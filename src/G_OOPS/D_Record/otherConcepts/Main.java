package G_OOPS.D_Record.otherConcepts;

public class Main {
    public static void main(String[] args) {
        NamePair namePair1 = new NamePair(new StringBuilder("Ankit"), new StringBuilder("Khetan"));
        System.out.println(namePair1);

        NamePair namePair2 = new NamePair(new StringBuilder("Ankit"), new StringBuilder("Khetan"));
        System.out.println(namePair2);

        System.out.println("namePair1.equals(namePair2) ? " + namePair1.equals(namePair2)); //StringBuilder doesn't provide meaningful equal

        namePair2.first().append(" Kumar"); // Object it(namePair2.first()) refers is same. but since Object(StringBuilder) is mutable this is allowed
        System.out.println(namePair2);





    }
}
