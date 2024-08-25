package Exception_Handling.FinallyBlock_tryResources;

import java.io.*;


public class FinallyExample {
    public static void main(String[] args) {
        FileReader reader = null;

        // this try_catch block
        try {
            reader = new FileReader("Exception_Handling/FinallyBlock_tryResources/sample.txt");
            int data = reader.read();
            while (data != -1){
                System.out.println((char)data);
                data = reader.read();
            }
        } catch (IOException e) {
            System.out.println("An error occured : "+ e.getMessage());
        }
        // finally block of code
        finally{
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the reader: "+ e.getMessage());
            }
            System.out.println("Finally block Executed");
        }

    }
}
