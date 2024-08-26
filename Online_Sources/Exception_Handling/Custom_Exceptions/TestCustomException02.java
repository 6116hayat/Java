package Exception_Handling.Custom_Exceptions;

import java.util.*;

// Defining custom exceptions class
class Footballer_Or_Not extends Exception{
    public Footballer_Or_Not(String message){
        super(message);
    }
}

public class TestCustomException02 {
    
    // Method to check for exception
    static void choice(int UserChoice) throws Footballer_Or_Not{
        if (UserChoice == 1){
            throw new Footballer_Or_Not("Yes a footbaaller");
        }else if (UserChoice == 2){
            throw new Footballer_Or_Not("No Not a footabller");
        }else{
            System.out.println("Choose right options please...");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter your choice");
            int UserChoice = input.nextInt();
            choice(UserChoice);
        } catch (Footballer_Or_Not e) {
            System.out.println("Caught in exception");
            System.out.println("Exception occured: "+e.getMessage());
        }
    }
}
