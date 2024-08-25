package Exception_Handling.FinallyBlock_tryResources;

import java.io.FileReader;
import java.io.IOException;

public class tryWithResources {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("Exception_Handling\\FinallyBlock_tryResources\\sample.txt")){
            int data = reader.read();
            while (data != -1){
                System.out.println((char)data);
                data = reader.read();
            }
        } catch (IOException e) {
            System.out.println("An error occured :" +e.getMessage());
        }
    }
}
