package File_Input_Output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_BufferedWriter {
    public static void main(String[] args) {

        // Writing to a file......

        String[] names = { "Sujeet", "Umar", "Shivam" };
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Online_Sources\\File_Input_Output\\writer.txt"));
            writer.write("Writing to a new line");
            writer.write("\n It is a new line :");

            for (String name : names) {
                writer.write("\n" + name);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Online_Sources\\File_Input_Output\\writer.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
