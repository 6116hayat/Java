package File_Input_Output;

import java.io.*;

public class InputStreamExample {

    public static void main(String[] args) throws Exception {

        InputStream input = null;
        try {

            input = new FileInputStream("Online_Sources//File_Input_Output//input.txt");

            // read() method : reading and printing Characters
            // one by one
            System.out.println("Char - " + (char) input.read());
            System.out.println("Char - " + (char) input.read());

            // mark() : read limiting the 'input' input stream
            input.mark(0);

            // skip() - it results in skipping of 'm' in Umar
            input.skip(1);
            System.out.println("skip() method comes to play");
            System.out.println("mark() method come to play");
            System.out.println("Char - " + (char) input.read());
            System.out.println("Char - " + (char) input.read());

            boolean check = input.markSupported();
            if (input.markSupported()) {
                // reset() method - repositioning the stream to
                // marked positions.
                input.reset();
                System.out.println("reset() invoked");
                System.out.println("Char - " + (char) input.read());
                System.out.println("Char - " + (char) input.read());
            } else
                System.out.println("reset() method not supported.");

            System.out.println("input.markSupported() supported" + " reset() - " + check);

        } catch (Exception e) {
            // in case of I/O error
            e.printStackTrace();
        } finally {
            if (input != null) {
                // Use of close() - closing the file
                // and releasing resources
                input.close();
            }
        }
    }
}
