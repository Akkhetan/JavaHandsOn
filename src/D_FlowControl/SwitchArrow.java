package D_FlowControl;

public class SwitchArrow {
    public static void main(String[] args) {
        int x = 97;
        switch (x) {
            //for multiple lines block is necessary
            case 97,98,99 -> {   //can pass multiple values to test
                System.out.println("x is currently : "+ x);
                x +=100;  // break is not necessary when '->' is used instead if ':'
            }
            case 100 ->
                    System.out.println("one hundred");
            default ->
                    System.out.println("default");
        }
        System.out.println("x is now : "+ x);

        System.out.println("------------------------------------------------------------------------------------------");

        int y = 97;
        switch (y) {
            //for multiple lines block is necessary
            case 97,98,99 : {   //can pass multiple values to test
                System.out.println("y is currently : "+ y);
                y +=100;
            }
            case 100 :
                    System.out.println("one hundred");
            default :
                    System.out.println("default");
        }
        System.out.println("y is now : "+ y);

    }
}
