/*
outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.
If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
 */

package G_OOPS.E_ObjectInitialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerRankStaticInitalization {
    static double breadth, height;
    static {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter breadth : ");
             breadth = Double.parseDouble(br.readLine());

            System.out.println("Enter height : ");
             height = Double.parseDouble(br.readLine());

            System.out.println("breadth = " + breadth + " height = " + height);

        } catch (IOException e) {
            throw new RuntimeException(e);
           // If an exception is thrown inside a static block in Java, it will cause the class initialization to fail and result in an ExceptionInInitializerError.
            // This error is a subclass of Error, indicating that an exception occurred during the evaluation of a static initializer.
        }
    }

    public static void main(String[] args) {
        try {
            if (breadth < 0 || height < 0)
                throw new Exception("Breadth and height must be positive");
            double area = breadth * height;
            System.out.println("Area = " + (int)area);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
