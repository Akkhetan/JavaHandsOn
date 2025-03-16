package E_ExceptionHandling;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchException {
    public static void main(String[] args) throws Exception {
        throwSpecificException();
        throwCommonException();
    }

    public static void throwSpecificException() throws SQLException, FileNotFoundException {
        try{
            if(Math.random()>.5) throw new FileNotFoundException();
            if(Math.random()<.5) throw new SQLException();
        }catch (FileNotFoundException | SQLException e){
            throw e;
        }
    }

    public static void throwCommonException() throws Exception {
        try{
            if(Math.random()>.5) throw new FileNotFoundException();
            if(Math.random()<.5) throw new SQLException();
        }catch (FileNotFoundException | SQLException e){
            final Exception f = e;
            throw f;  //'Exception' is parent of both 'FileNotFoundException' & 'SQLException'
        }
    }
}
