package G_OOPS.E_ObjectInitialization;

public class InstanceInitalization2 {
    static int x;     //flow 1 : x = 0
    int y;
    {  // flow 6 : x = 3 and y = 1
        x++;
        y++;
    }

    static{   //flow 2 : x = 1
        x++;
    }


    InstanceInitalization2(){
        this(++x); // flow 4 : since 'this' is explicitly mentioned as 1st statement, it will not go to initializer block, instead it go to constructor with argument with x =2 (pass by value)
    }

    InstanceInitalization2(int x){      //flow 5 : here 'x' is considered as local with all, and this constructor has implicit super which will call initialisation block
        System.out.println(x + " , " + y);  // flow 7 : here local x = 2 and static x = 3 and instance y = 1
    }

    static {  // flow 3 : calls default constructor
        new InstanceInitalization2();
    }

    public static void main(String[] args) {
    }

}