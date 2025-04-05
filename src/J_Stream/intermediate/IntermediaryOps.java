package J_Stream.intermediate;

import java.util.Arrays;
import java.util.List;

public class IntermediaryOps {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A1","B2","C3","A1");
        names.forEach(System.out::println);
        testDistinct(names);
        testlimit(names);
        testskip(names);
    }
    public static void testDistinct( List<String> names){
        System.out.println("Inside testDistinct");
        names.stream()
                        .distinct()
                        .forEach(System.out::println);
    }

    public static void testlimit( List<String> names){
        System.out.println("Inside testlimit");
        names.stream()
                .limit(2)
                .forEach(System.out::println);
    }

    public static void testskip( List<String> names){
        System.out.println("Inside testskip");
        names.stream()
                .skip(2)
                .forEach(System.out::println);
    }
}
