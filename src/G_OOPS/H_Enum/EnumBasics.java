/*
# An enumeration is a list of named constants that define a new data type and its legal values. Thus, an enumeration object can hold only a value that was declared in the list.
An enumeration can have constructors, methods, and instance variables.

# The identifiers Jonathan, GoldenDel, and so on, are called enumeration constants. Each is implicitly declared as a public, static final member of Apple.
  Because they static final references, the instance must be created during class loading
  So instance initializer and constructor runs before static initializers
# However, even though enumerations define a class type, you do not instantiate an enum using new. Instead, you declare and use an enumeration variable in m
uch the same way as you do one of the primitive types.

 */
package G_OOPS.H_Enum;

enum Apple {  // Enum is implicitly final
    Jonathan, GoldenDel, RedDel, Winesap, Cortland; //The identifiers are called enumeration constants. Each is implicitly declared as a public, static final member of Apple.

    static {
        System.out.println("Hello from static block");

    }

    {
        System.out.println("Hello from initializer block");

    }

    public static void main(String[] args) {
        System.out.println("Calling from enum static method");
    }
}

//enum Orange extends EnumBasics{} extends not allowed

public class EnumBasics {
    public static void main(String[] args) {
        // Apple apple = new Apple(); Enum type cannot be instantiated

        Apple ap;
        ap = Apple.GoldenDel;
        System.out.println(ap);

        if (ap == Apple.GoldenDel) System.out.println("ap is GoldenDel");

        if (ap.equals(Apple.GoldenDel)) System.out.println("ap is GoldenDel");

        switch (ap) {
            case GoldenDel -> System.out.println("from switch - ap is GoldenDel");
            case Winesap -> System.out.println("from switch - ap is Winesap");
        }

        Apple[] apples = Apple.values();  //use values()
        for (Apple a : apples)
            System.out.println(a);

        Apple apple = Apple.valueOf("Cortland");
        System.out.println(apple);

    }
}