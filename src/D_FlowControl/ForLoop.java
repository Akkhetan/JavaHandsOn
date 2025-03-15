package D_FlowControl;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i++); //0, 2, 4, 6, 8
        }

     /*  this doesn't compile as declaration types are different(int and String), although multiple declarations are allowed
     for(int i = 0, String s = "hello"; i<3; i++, s+=s){
            System.out.println(s);
        }*/
    }
}
