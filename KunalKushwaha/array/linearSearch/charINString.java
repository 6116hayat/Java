package linearSearch;

public class charINString {

    // Create a method 
    public static boolean charSearch(String name, char target){
        if (name.length() == 0) {
            System.out.println("No name Provided");
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i) ) {
                System.out.println(target +" was at " + i);
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        
        // introducing the String 
        String name = "umar";
        char target = 'u';

        //calling the method
        charSearch(name, target);

        System.out.println("Runing ");

    }
}
