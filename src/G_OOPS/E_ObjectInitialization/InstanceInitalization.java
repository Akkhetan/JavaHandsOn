/*
# An Instance Initializer Block is a block of code inside a class that is executed when an instance of the class is created, right after the call to the constructor.
# Instance initializer blocks are executed before the constructor, regardless of which constructor is called..
# If there are multiple instance initializer blocks, they are executed in the order they appear in the class.
 */
package G_OOPS.E_ObjectInitialization;

class MyClass {
    // Instance initializer block
    {
        System.out.println("Instance initializer block executed");
    }

    // Constructor
    public MyClass() {
        System.out.println("Constructor executed");
    }
}

public class InstanceInitalization {
        public static void main(String[] args) {
            MyClass obj = new MyClass();
        }
}