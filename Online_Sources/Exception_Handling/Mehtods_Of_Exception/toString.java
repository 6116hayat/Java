package Exception_Handling.Mehtods_Of_Exception;


    
import java.io.*;

public class toString {
    public static void main (String[] args) {
    int a=5;
    int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}
