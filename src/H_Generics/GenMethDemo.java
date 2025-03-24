/*
The following program declares a non-generic class called GenMethDemo and a static generic method within that class called isIn( ).
The isIn( ) method determines if an object is a member of an array. It can be used with any type of object and array as long as the array contains objects
that are compatible with the type of the object being sought.
 */
package H_Generics;

public class GenMethDemo{

    // upper bound of Comparable ensures that this method can be used only with objects that can be compared
    static <T extends Comparable<T>, V extends T>boolean isIn(T x, V[] y){
        for(V element : y){
            if(x.compareTo(element)==0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4};
        if(GenMethDemo.isIn(2,nums)){
            System.out.println("2 is in nums array");
        }
        else {
            System.out.println("2 is not in nums array");
        }

        String[] strs = {"one","two","three"};
        if(GenMethDemo.isIn("2",strs)){
            System.out.println("2 is in strs array");
        }
        else {
            System.out.println("2 is not in strs array");
        }
    }
}