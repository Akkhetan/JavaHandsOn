package D_FlowControl;

public class LabelledLoop {
    public static void main(String[] args) {
        outer : for (var x= 0; x<5; System.out.println(),x++ ){
            inner : for(var y=0; y<5; y++){
                if(y==x)
                    continue outer;
                System.out.printf("x=%d, y=%d : ",x,y);
            }
        }
    }
}