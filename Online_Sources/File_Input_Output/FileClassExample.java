package File_Input_Output;

import java.io.File;

public class FileClassExample {

    // File class
    public static void main(String[] args) {
        File file = new File("Online_Sources\\File_Input_Output\\Example.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }
}
