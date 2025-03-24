package H_Generics.A_WildCard;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcard {
    // Method to calculate the sum of numbers in a list
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // List of Integers
        List<Integer> intList = Arrays.asList(10, 20, 30);
        System.out.println("Sum of Integers: " + sumOfList(intList));  // 60.0

        // List of Doubles
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Sum of Doubles: " + sumOfList(doubleList));  // 7.5
    }
}