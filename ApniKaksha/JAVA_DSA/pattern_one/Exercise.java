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

        System.out.println(); // for a line gap

        // Pattern 3 : Half Pyramid of a number
        // printing the pattern
        /*
         * 1
         * 12
         * 123
         * 1234
         */
        System.out.println("Half Pyramid of number");
        int a = 5;
        for (int line = 1; line <= a; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println(); // for a line gap

        // Pattern 4 : Half Pyramid of a alphabets
        // printing the pattern
        /*
         * A
         * BC
         * DEF
         * GHIJ
         */
        System.out.println("Half Pyramid of Alphabets");
        int charLimit = 5;
        char ch = 'A';

        // outer loop
        for (int i = 1; i <= charLimit; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
