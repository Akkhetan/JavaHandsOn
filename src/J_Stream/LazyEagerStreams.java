package J_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEagerStreams {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Sam","Kish");
        testLazy(names);
        testEager(names);
    }

    public static void testLazy(List<String> names){
        names.stream().filter(name ->
        {
            System.out.println("Inside filter - Test Laziness");
            return  name.startsWith("R");
        });  // Intermediary operations like 'filter', 'map' etc are lazy differ the operation on pipelines unless  asked by terminal
    }

    public static void testEager(List<String> names){
        Stream<String> stringStream = names.stream().filter(name ->
        {
            System.out.println("Inside filter - Test Eagerness");
            return name.startsWith("R");
        });

        System.out.println("Total count : " + stringStream.count()); // Terminary operations like 'count', 'collect' etc are eager
    }
}
