package G_OOPS.E_ObjectInitialization;

// StaticControlFlow class (Main class)

class StaticControlFlow {
    // initializing static integer a=100
    static int a = 100;
    //static int b = 200;

    // static method print()
    public static void print()
    {
        // displaying value of b
        System.out.println(b);
    }

    // first static block
    static
    {
        // displaying value of a
        System.out.println(a);

        // calling static method print()
        print();
        System.out.println("Inside First Static Block");
    }

    // static main method
    public static void main(String[] args)
    {
        // calling static method print()
        print();
        System.out.println(
                "Main method has finished its execution");
    }

    // initializing static integer b=200
    static int b = 200;

    // second static block
    static
    {
        System.out.println("Inside Second Static Block");
    }


}