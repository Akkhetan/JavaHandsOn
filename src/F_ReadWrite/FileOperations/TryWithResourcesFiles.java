package F_ReadWrite.FileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourcesFiles {
    public static void main(String[] args) {
      int i;

      if(args.length <2){  //Here filename is passed as part of command line argument
          System.out.println("Enter input and output filenames");
          return;
      }

      //try-with-resources
      try(FileInputStream fin = new FileInputStream(args[0]);
          FileOutputStream fout = new FileOutputStream(args[1]))
      {
          do{
              i = fin.read();   //Read the characters until End Of File is encountered
              if(i != -1)
                  fout.write(i);  //Write the character to the file
          }while(i != -1);

      } catch (FileNotFoundException e) {
          System.out.println("Unable to find the either of the file : "+args[0] + " or  " + args[1]);
      } catch (IOException e) {
          System.out.println("Unable to read or write from/to the file: "+args[0] + " or  " + args[1]);
      }

    }
}