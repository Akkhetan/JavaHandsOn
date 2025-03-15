package D_FlowControl;

public class Switch {
    public static void main(String[] args) {
        char x = 1;
        final int offset = 0;
        switch (x){
            //case 65536: this is too large value to be stored in char
            case 65535:
                System.out.println("Big");
                break;
            case offset+1:  //need to be a constant expression, hence 'offset' is made final
                System.out.println("off+1 : "+(++x));
            default:
                throw new IllegalStateException("Unexpected value: " + x);
        }
    }
}
