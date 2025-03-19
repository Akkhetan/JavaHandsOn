/*
# Both the superclass and the subclass must have the same method name, the same return type and the same parameter list.
# Final Method cannot be overridden
 */
package G_OOPS.C_Overload_Override;

public class MethodOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
        Animal a = new Dog();  // Dynamic method dispatch or Run time polymorphism
        a.displayInfo();  //Child version is called
        a.displayInfoStatic();  //Calling static method and polymorphism will not work for it. Parent version is called
    }
}

class Animal {
    protected CharSequence displayInfo() {
        System.out.println("I am an animal.");
        return "I am an animal.";
    }

    public static void displayInfoStatic() {
        System.out.println("Static Method : I am an animal.");
    }

    public final void displayInfoFinal() {
        System.out.println("Final Method : I am an animal.");
    }

}

class Dog extends Animal {
    @Override
    // void displayInfo() { Not allowed - attempting to assign weaker access privilege error
    public String displayInfo() {
        System.out.println("I am a dog.");
        return "I am a dog.";
    }

  //  @Override Annotation is not allowed for static methods
    public static void displayInfoStatic() {
        System.out.println("Static Method : I am a dog.");
    }

    /* Final Method cannot be overridden
    public final void displayInfoFinal() {
        System.out.println("Final Method : I am a dog.");
    }*/
}

