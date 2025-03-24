package G_OOPS.G_Interface;

interface P {
    default void doStuff(){}  //default method
}

interface Q {
     void doStuff();  //abstract method
}

abstract class A3 implements P,Q{
    public abstract void doStuff();

}

 class A4 implements P,Q{
    void display(){
        P.super.doStuff();
       // Q.super.doStuff(); cannot call abstract methods
    }

     @Override
     public void doStuff() {
         P.super.doStuff();
     }
 }


public class InterfaceDemo3 {
}