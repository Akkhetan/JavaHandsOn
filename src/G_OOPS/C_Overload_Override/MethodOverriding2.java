package G_OOPS.C_Overload_Override;

class P {
    protected String message = "P";
    void show(P p){
        System.out.println(p.message);
    }
}

class S extends P{
    private String message = "S";

    @Override
    void show(P p){
        System.out.println("sub says " + p.message);
    }

    //This is method overloading and not overridding
    void show(S s){
        System.out.println("sub says " + s.message);
    }
}


public class MethodOverriding2 {
    public static void main(String[] args) {
        P p  = new S();
        p.show(p); //there is no dynamic binding for fields. It is only for methods
    }
}
