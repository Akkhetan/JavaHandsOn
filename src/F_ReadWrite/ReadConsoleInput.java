package F_ReadWrite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleInput {
    public static void main(String[] args) throws IOException {
     // BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));  not sure why System.console is null
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        readCharacter(br);
        readString(br);

    }

    private static void readCharacter(BufferedReader br) throws IOException {
        char c;
        System.out.println("Enter characters, 'q' to quit: \n");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }

    private static void readString(BufferedReader br) throws IOException {
        String str;
        System.out.println("Enter lines of text. Enter 'stop' to quit. \n");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!"stop".equals(str));
    }
}
