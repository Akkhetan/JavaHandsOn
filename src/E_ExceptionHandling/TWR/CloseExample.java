package E_ExceptionHandling.TWR;

import java.sql.SQLException;

public class CloseExample {
    public static void main(String[] args) {
        System.out.println("Starting");
        MyResources mr0 = new MyResources();
        try(MyResources mr1 = new MyResources();
            mr0;
            MyResources mr2 = new MyResources();){
            System.out.println("Using Resources....");
        } catch (SQLException e) {
            System.out.println("Problem in closing");
        }
        //resources are closed in reverse order of listing in 'try' but not in order they are created

       // mr0 = null; Not allowed  as mr0 has to be effectively final
        System.out.println("Ending");
    }
}
