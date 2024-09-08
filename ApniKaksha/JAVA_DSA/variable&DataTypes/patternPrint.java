import java.util.*;

// printing the pattern
/*
    ****
    ***
    **
    *
 */

public class patternPrint {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // System.out.println("Input a number between 1 to 10");
        // int userInput = in.nextInt();

        int rows = 5; // number of rows for the pattern

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
