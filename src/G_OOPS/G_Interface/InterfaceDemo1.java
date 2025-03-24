package G_OOPS.G_Interface;

interface  W {
    default void doStuff(){
        System.out.println("default W.doStuff()");
    }

    default void display(){
        System.out.println("default W.display()");
    }
}

class B {
    public void doStuff(){  //concrete implementation takes preference over default
        System.out.println("B.doStuff()");
    }

     void display(){
        System.out.println("B.display()");
    }
}

class A extends B implements W {

    @Override
    public void display(){
        System.out.println("A.display()");
        W.super.display();  //Interface name is required to call super
        super.display();
    }
}

class C extends A{
    @Override
    public void display(){
        System.out.println("C.display()");
        //W.super.display();  //default implementation of interface W is hidden
        super.display();
    }

}

public class InterfaceDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.doStuff();
        a.display();
    }
}