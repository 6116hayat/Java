package File_Input_Output;

import java.io.*;

import java.io.FileOutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws Exception {

        OutputStream output = new FileOutputStream("Online_Sources//File_Input_Output//output.txt");
        byte b[] = { 81, 82, 83, 84 };

        // Iillustrating write (byte[] b) method
        output.write(b);

        // illustrating flush() method
        output.flush();

        // illustrating write(int b)method
        for (int i = 85; i < 90; i++) {
            output.write(i);
        }

        output.flush();

        // close the stream
        output.close();
    }
}
