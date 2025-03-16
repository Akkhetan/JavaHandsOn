package E_ExceptionHandling.TWR;

import java.sql.SQLException;

public class MyResources implements AutoCloseable{

    private static int nextId = 0;
    private final int id = nextId++;

    {
        System.out.println("Initializing MyResource id = "+ id);
    }

    @Override
    public void close()  throws SQLException {
        System.out.println("Closing from MyResources with id: "+ id);
        if(Math.random() > .5){
            System.out.println("Failed to close resource with id: "+ id);
            throw new SQLException();  //other resources are still closed even if there is any exception in closing the current one
        }
        System.out.println("Successfully closed resource with id :"+ id);
    }
}
