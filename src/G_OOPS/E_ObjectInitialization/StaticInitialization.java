package G_OOPS.E_ObjectInitialization;

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println(x + " , " + y + " , " + z);
    }
    static int x;

    static {
        //System.out.println(x + " , " + y);  compilation fails
        System.out.println(x + " , " + StaticInitialization.y); // 'StaticInitialization.y' is forward qualified reference so it takes default value
    }

    static int y = 100;

    static {
        System.out.println(x + " , " + StaticInitialization.y);
    }

    static {
        x = y + 10;
    }

    static int z = -1;

}
