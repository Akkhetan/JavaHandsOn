package G_OOPS;

class A{
    int i,j;
}

class B{
    int i,j;
}

class C extends A{
    int k;
}

class D extends A{
    int k;
}


public class InstanceOfDemo {
    public static void main(String[] args) {
        Number myObj = Integer.valueOf(9);
        if(myObj instanceof Integer iObj){
            // scope of iObj is only within if
            System.out.println("iObj refer to an integer : " + iObj);

            //  Integer iObj = (Integer) myObj;  Traditional way to use explicit cast to obtain iObj

        }
        //System.out.println(iObj); //iObj is out of scope

        Number num = Double.valueOf(3.14);
        if(num instanceof Integer i1){
            System.out.println("num is integer with value : " + i1);
        }

       basicInstanceOf();
       moreInstanceOf();


    }

    static void basicInstanceOf(){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        A a1 = (A)new C();
        // C c1 = (C) new A(); ClassCast Exception Object A cannot be cast to class C

        if (a instanceof A)
            System.out.println("a is instance of A");
        if (b instanceof B)
            System.out.println("b is instance of B");
        if (c instanceof C)
            System.out.println("c is instance of C");
        if (c instanceof A)
            System.out.println("c can be cast to A");
        if (a instanceof C)
            System.out.println("a can be cast to C");

        A ob;
        ob = d;
        System.out.println("ob now refers to d");
        if(ob instanceof D)
            System.out.println("ob is instance of D");

        ob = c;
        System.out.println("ob now refers to c");
        if(ob instanceof D)
            System.out.println("ob can be cast to D");
        else
            System.out.println("ob cannot be cast to D");

        if(ob instanceof A)
            System.out.println("ob can be cast to A");

    }

    static void moreInstanceOf(){

        Object [] obj = {"Alpha","Gamma","Beta",true,12,"neutron"};
        int i;
        for(i = 0; (i < obj.length) && (obj[i] instanceof String str)   ; i++){
            System.out.println("Index num " + i + " contains : " + obj[i]);
        }
    }
}