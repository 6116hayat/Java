package JAVA_DSA.pattern_one;

public class Exercise {
    public static void main(String[] args) {

        // Pattern 1 : Star Pattern
        /*
            *
            **
            ***
            ****
         */

        System.out.println("Star Pattern");
        int n = 5; // number of rows for the pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n" + " Break" + "\n"); // For line Gap

        // Pattern 2 : Reverse Star Pattern
        // printing the pattern
        /*
            ****
            ***
            **
            *
        */
        System.out.println("Reverse Star Pattern");
        int rows = 5; // number of rows for the pattern

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
