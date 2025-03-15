package D_FlowControl;

public class DoWhileLoop {
    public static void main(String[] args) {
        int x = 0;
        do{
            System.out.println(x); //prints increasing integers up to 2 billion, then from -2 billion increasing to 0, then stops
            x++;
        }while(x!=0);
        System.out.println("done");
    }

}
