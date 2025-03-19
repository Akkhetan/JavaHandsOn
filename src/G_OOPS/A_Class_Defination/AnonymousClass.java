package G_OOPS.A_Class_Defination;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Running from MyRunnable");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable();
        r1.run();

        // Below we are declaring and initializing AnonymousClass
        Runnable r2 = new Runnable(){
            @Override
            public void run() {
                System.out.println("Running from Anonymous class");
            }
        };
        r2.run();

        //Below using Lambda in place of AnonymousClass
        Runnable r3 = () -> System.out.println("Running from Lambda");
        r3.run();
    }
}
