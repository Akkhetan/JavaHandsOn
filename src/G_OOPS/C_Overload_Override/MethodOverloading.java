/*
Two or more methods can have the same name inside the same class if they accept different arguments. This feature is known as method overloading.
Method overloading is achieved by either:
changing the number of arguments.
or changing the data type of arguments.
It is not method overloading if we only change the return type of methods. There must be differences in the number of parameters.

 */
package G_OOPS.C_Overload_Override;

class MethodOverloading {

    // this method accepts int
    private static void display(int a){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
    private static void display(String a){
        System.out.println("Got String object.");
    }

    // this method  accepts int and String
    private static void display(int i, String a){
        System.out.println("Got int and String.");
    }

    public static void main(String[] args) {
        display(1);
        display("Hello");
        display(1,"Hello");
    }
}
