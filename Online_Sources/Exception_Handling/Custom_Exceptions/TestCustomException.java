package Exception_Handling.Custom_Exceptions;

// Define the custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException (String message){
        super(message);
    }
}

public class TestCustomException{
    
    // method to check age

    static void validate(int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote");
        }else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the Exception");
            System.out.println("Exception occured: "+ e.getMessage());
        }
        System.out.println("Rest of the code...");
    }
}
