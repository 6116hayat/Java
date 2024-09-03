package File_Input_Output;

import java.io.*;

public class FileInputOutputStream {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("Online_Sources\\File_Input_Output\\input.txt");
                FileOutputStream out = new FileOutputStream("Online_Sources\\File_Input_Output\\output.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
