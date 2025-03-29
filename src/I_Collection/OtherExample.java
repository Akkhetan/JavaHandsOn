package I_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OtherExample {
    public static void main(String[] args) {
        var sa = new String[]{"one","two","three"};
        System.out.println("Original Array contents : "+ Arrays.toString(sa));
        var ls = Arrays.asList(sa); // this list is just the view and not the copy
        //ls.add("four");  //Runtime exception - UnsupportedOperationException
        //ls.remove(1); //Runtime exception - UnsupportedOperationException
        ls.set(2,"four");  //modification is allowed
        System.out.println("Array contents after modification: "+ Arrays.toString(sa));
    }
}