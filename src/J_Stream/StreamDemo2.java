package J_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Integer> number  = Arrays.asList(5,4,2,3,5,4,4);

        //Find max number
        Integer max = number.stream().max(Integer::compare).orElseThrow(() -> new NoSuchElementException("List is empty"));
        System.out.println("Max = " + max);

        //find frequency of elements
        Map<Integer, Long> frequencyMap = number.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        frequencyMap.forEach((key,value) -> System.out.println("Key = " + key + " value = " + value));


        String[] strs = new String[]{"One","Two","Three","Four"};

        String longestString = Arrays.stream(strs).max(Comparator.comparingInt(String::length)).orElseThrow(() -> new NoSuchElementException("Array is empty"));
        System.out.println("Longest String : " + longestString);

    }
}
