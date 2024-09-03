package File_Input_Output;

import java.io.*;

public class FileReader_FileWriter {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("Online_Sources\\File_Input_Output\\input.txt");
                FileWriter writer = new FileWriter("Online_Sources\\File_Input_Output\\output.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
