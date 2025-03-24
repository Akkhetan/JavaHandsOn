package H_Generics.A_WildCard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
    // Method to add integers to a list
    public static void addIntegers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        // List of Numbers
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);  // Adding integers to a Number list
        System.out.println("Number List: " + numberList);

        // List of Objects
        List<Object> objectList = new ArrayList<>();
        addIntegers(objectList);  // Adding integers to an Object list
        System.out.println("Object List: " + objectList);
    }
}