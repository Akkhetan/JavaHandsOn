package J_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveStream {
    public static void main(String[] args) {

        intStreamPrimitive();
        convertIntegertoPrimitiveInt();
    }

    public static void intStreamPrimitive(){
        int[] ints = new int[]{1,2,3,4,5};
        IntStream intStream = IntStream.of(ints);
        int intSum = intStream.sum();

        System.out.println("Sum of primitive int : "+intSum);
    }

    public static void convertIntegertoPrimitiveInt(){
        List<Integer> integers =Arrays.asList(1,2,3,4,5);
        Integer integerSum = integers.stream().reduce(Integer::sum).get();
        System.out.println("Sum of Integer : "+integerSum);

        int intSum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum after conversion to primitive int : "+intSum);
    }
}
