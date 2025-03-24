package H_Generics;

//Generic Constructor in a Generic Class
class Box<T> {

    private T item;

    // Generic constructor with its own type parameter
    <U> Box(U value) {
        System.out.println("Inside Generic Constructor: " + value);
        System.out.println("Type of U: " + value.getClass().getName());
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}


//Generic Constructor in a Non-Generic Class
 class GenericConstructorDemo {

    // Generic constructor
    <T> GenericConstructorDemo(T value) {
        System.out.println("Value: " + value);
        System.out.println("Type: " + value.getClass().getName());
    }
}


public class GenConstructor {
    public static void main(String[] args) {
        // Creating a Box object with Integer type
        Box<String> box1 = new Box<>(123);
        box1.setItem("Class in Integer type");

        // Creating a Box object with String type
        Box<String> box2 = new Box<>("Generic Constructor Example");
        box2.setItem("Class in String type");

        System.out.println("Box1 item: " + box1.getItem());
        System.out.println("Box2 item: " + box2.getItem());


        System.out.println("----------------------------------------------------------------");

        GenericConstructorDemo obj1 = new GenericConstructorDemo(100);
        GenericConstructorDemo obj2 = new GenericConstructorDemo("Hello");
        GenericConstructorDemo obj3 = new GenericConstructorDemo(3.14);
    }
}