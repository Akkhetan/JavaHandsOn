/*
This code identifies all the prime numbers for given input from users
 */

package Z_Other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) throws IOException {

        int count = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> integerList = new ArrayList<>();
        System.out.println("Enter 5 integers : ");
        do {
            integerList.add(Integer.valueOf(br.readLine()));
            count++;
        } while (count <= 5);

        List<Integer> primeList = integerList.stream().filter(Prime::checkPrime).toList();

        if (primeList.isEmpty()) {
            System.out.println("There are no prime numbers in the list");
        } else {
            System.out.println("Prime List: ");
            primeList.forEach(System.out::println);
        }
    }

    public static boolean checkPrime(int num) {
        if(num <= 1)
            return false;
        if(num ==2)
            return true;

        if (num % 2 == 0) return false;

        double sqrtDouble = Math.sqrt(num);
        int sqrtInt = (int) sqrtDouble;

        if(sqrtDouble==sqrtInt)
            return false;

        return IntStream
                .rangeClosed(3,sqrtInt)
                .filter(n -> n%2 !=0)
                .noneMatch(n -> num%n ==0);
    }
}