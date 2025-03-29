package H_Generics.MoreConcepts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List l = new ArrayList<String>();
        l.add(LocalDate.now());
        List<String> ls = l;
        // String s = ls.get(0); ClassCastException : class java.time.LocalDate cannot be cast to class java.lang.String

        List<String> lStr = new ArrayList<>();  // Type parameter 'String' is erased at the compile time
        if(lStr instanceof ArrayList)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}