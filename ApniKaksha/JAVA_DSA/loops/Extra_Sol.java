package JAVA_DSA.loops;

import java.util.*;

public class Extra_Sol {
    public static void main(String[] args) {
        // Declaring the Scanner
        Scanner input = new Scanner(System.in);

        // Extra 1 : Reversing the number
        // 1024 = 4201
        System.out.println("Enter the Number for Reversing");
        int userNum = input.nextInt();
        int rev = 0;
        System.out.println("Original Number : " + userNum);

        while (userNum > 0) {
            int lastDigit = userNum % 10;
            rev = (rev * 10) + lastDigit;
            userNum /= 10;
        }
        System.out.print("Reverser Number : " + rev);

    }
}
