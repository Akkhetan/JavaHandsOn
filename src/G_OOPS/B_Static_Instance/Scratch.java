package G_OOPS.B_Static_Instance;


public class Scratch {
    int x;
    static void doStuff(){
        // System.out.println(x);  static cannot access instance variable directly
        System.out.println(new Scratch().x);

    }

    Scratch doMoreStuff (Scratch this){  //'this' can be passed as parameter
    return this;
    }

    /* Pass by value */
    static void adder(int x, Integer y, StringBuilder sb){
        x +=1;
        y +=1;
        sb.append("1");
    }

    public static void main(String[] args) {
        int x = 1;
        Integer y = 1;
        StringBuilder sb = new StringBuilder("1");
        adder(x,y,sb);  //this is pass by value(i.e copy is passed), in Java there is no pass by reference
        System.out.println("x = "+ x + "\n y = " + y + "\n sb = "+ sb);
        // value of x is not updated as it is primitive type
        // value of y is not updated as 'Integer' is immutable
        // value of sb is updated as StringBuilder is mutable
    }


}
