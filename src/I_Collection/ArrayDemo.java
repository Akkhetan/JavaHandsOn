package I_Collection;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println("Before nums = " + Arrays.toString(nums));

        Arrays.parallelPrefix(nums,(a,b) -> a + b );
        System.out.println("After nums = " + Arrays.toString(nums));

        //  Creating & Initializing Primitive Arrays
        int[] numbers = {42, 15, 89, 2, 55, 78};

        //  Sorting using Arrays.sort()
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        //  Searching using Binary Search (Requires Sorted Array)
        int index = Arrays.binarySearch(numbers, 55);
        System.out.println("Index of 55: " + index);

        //  Finding Min & Max Efficiently
        int min = Arrays.stream(numbers).min().orElse(Integer.MIN_VALUE);
        int max = Arrays.stream(numbers).max().orElse(Integer.MAX_VALUE);
        System.out.println("Min: " + min + ", Max: " + max);

        //  Filtering & Transforming using Streams (Even Numbers Only)
        int[] evens = Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();
        System.out.println("Even Numbers: " + Arrays.toString(evens));

        //  Parallel Sorting for Large Arrays
        Arrays.parallelSort(numbers);
        System.out.println("Parallel Sorted Array: " + Arrays.toString(numbers));

        //  Custom Sorting using Lambda (Descending Order)
        Integer[] numObjArray = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(numObjArray, (a, b) -> Integer.compare(b, a));
        System.out.println("Custom Sorted (Descending): " + Arrays.toString(numObjArray));

    }
}