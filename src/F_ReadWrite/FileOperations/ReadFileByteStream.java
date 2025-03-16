package F_ReadWrite.FileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileByteStream {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        if (args.length != 1) { //Here filename is passed as part of command line argument
            System.out.println("Usage: java ShowFile filename");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);   //Attempt to open the file
            do {
                i = fin.read();  //Read the characters until End Of File is encountered
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file : " + args[0]);
        } catch (IOException e) {
            System.out.println("Error reading the file");
        } finally {
            try {
                if (fin != null)
                    fin.close();   //close the file
            } catch (IOException e) {
                System.out.println("Error closing the file");
            }
        }
    }
}