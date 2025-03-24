/*
# It is important to understand that each enumeration constant is an object of its enumeration type. Thus, when you define a constructor for an enum, the constructor is called
when each enumeration constant is created. Also, each enumeration constant has its own copy of any instance variables defined by the enumeration.
# Constructors are private
# When the variable ap is declared in main( ), the constructor for Apple is called once for each constant that is specified.
# an enumeration can’t inherit another class. Second, an enum cannot be a superclass. This means that an enum can’t be extended.
# You can obtain a value that indicates an enumeration constant’s position in the list of constants. This is called its ordinal value, and it is retrieved by calling the ordinal( ) method,
# You can compare enum constants using equals(), which checks if both refer to the same constant in the same enum. Alternatively, use == for direct reference comparison.
 */
package G_OOPS.H_Enum;

enum Apple2{
    Jonathan(10,2.5), GoldenDel(20,3.5), RedDel(30), Winesap, Cortland(50,6.5);

    private int price;
    private double weight;

    //constructor
    Apple2(int p) {
        price = p;
    }

    //Overloaded Constructor
    Apple2(int p, double w) {
        this(p);
        weight = w;
    }

    Apple2() {

    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

   @Override
    public String toString() {
        return "Apple2{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}

public class EnumBasics2 {

    public static void main(String[] args) {
        Apple2 ap = Apple2.Jonathan;

        System.out.println("Value of Jonathan = " + Apple2.valueOf("Jonathan"));
        System.out.println("Price of Jonathan = " + ap.getPrice() + " & Weight = " + ap.getWeight());

        ap = Apple2.RedDel;
        System.out.println("Price of RedDel = " + ap.getPrice() + " & Weight = " + ap.getWeight());

        for(Apple2 ap2 :Apple2.values()){
            System.out.println(ap2.name() + " - Ordinal = " + ap2.ordinal() + " , "  + ap2);
        }

    }

}