package G_OOPS.A_Class_Defination;

public class TryThis {
    static {
        System.out.println("Calling from static block");
    }

     {
        System.out.println("Calling from instance block");
    }

    static class A {}  // Nested class
    class B {} // Inner class

    static enum X {}
    static interface Y {}
}
