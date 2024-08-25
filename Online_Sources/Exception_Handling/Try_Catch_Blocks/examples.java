package Exception_Handling.Try_Catch_Blocks;


class String_index_Out_Of_Bound{
    //method for this class
    public void String_index_Exception(){
        //we would try and catch StringIndexOutOfBound Exception

    String name = "My name is Hayat"; // String Length is 16

    System.out.println("String lenght: "+name.length());

    System.out.println("\n"+"First Printing Character inside String");
    char first_name_letter = name.charAt(11);
    System.out.println(first_name_letter);

    try {
        char c =  name.charAt(20);
        System.out.println(c);
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("\n"+"StringIndexOutOfBoundsException");
    }
    }
}

class NullPointer_Demo{
    public void NullPointer_Exception(){
        String nothing = null;

        //printing out the String first
        System.out.println("String - "+nothing + "\n"); 

        try {
            System.out.println(nothing.charAt(2));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}

public class examples extends NullPointer_Demo {
    public static void main(String[] args) {

        // creating Objects
        examples example01 = new examples();
        examples example02 = new examples();

        // calling out the methods
        // example01.String_index_Exception();
        example02.NullPointer_Exception();

    }
}
