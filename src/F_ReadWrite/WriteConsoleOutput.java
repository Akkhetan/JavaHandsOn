package F_ReadWrite;

import java.io.PrintWriter;

public class WriteConsoleOutput {
    public static void main(String[] args) {
        printWriter();
    }

    private static void printWriter(){
        PrintWriter pw = new PrintWriter(System.out,true);

        String str = "This is a String";
        int i = -7;
        double d = 45.8;

        pw.println(str);
        pw.println(i);
        pw.println(d);
    }
}
