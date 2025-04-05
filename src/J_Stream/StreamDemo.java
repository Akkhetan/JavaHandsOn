package J_Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> number  = Arrays.asList(5,4,2,3);

        //map(Function | Intermediate)
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        List<String> concept  = Arrays.asList("Reflection","Stream", "Collections");

        // filter(Predicate | Intermediate)
        List<String> result = concept.stream().filter(s ->  s.startsWith("S")).toList();
        //System.out.println(result);

        //sorted (stateful | Intermediate)
        List<String> sortedList = concept.stream().sorted().toList();
        //System.out.println(sortedList);

        //forEach(Terminal)
        number.stream().map(x -> x*x).forEach(System.out::println);

        //count (Terminal)
        Long countVar =  concept.stream().filter(s -> s.startsWith("S")).count();
        System.out.println(countVar);

        IntSummaryStatistics intSummaryStatistics = number.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("intSummaryStatistics :"+ intSummaryStatistics);

        OptionalDouble average = number.stream().mapToInt(x->x).average();
        System.out.println("average :"+ average.getAsDouble());

        System.out.println("Find duplicates and their count");
        String str = "Angel Srivastava";

        IntStream chars1 = str.chars();
        List<Character> characterList = chars1.mapToObj(x -> (char) x).toList();
        characterList.stream().filter(x->Collections.frequency(characterList,x)>1).peek(e-> System.out.println("Count value: " + e + " " + Collections.frequency(characterList,e))).collect(Collectors.toSet());

        int[] integer = {1,2,3,4,5,4,5,8} ;
        List<Integer> integerList = Arrays.stream(integer).boxed().toList();
        integerList.stream().filter(x-> Collections.frequency(integerList,x)>1).peek(x -> System.out.println("Count of : "+ x + Collections.frequency(integerList,x))).collect(Collectors.toList());

        //characterList.stream().peek(e-> System.out.println("Count value: " + e + " " + Collections.frequency(characterList,e))).collect(Collectors.toList());




    }
}
