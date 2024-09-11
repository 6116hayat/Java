package JAVA_DSA.funct_method;

import java.util.Scanner;

public class ques_sol {

    // Ques 1: Method for average of 3 numbers
    public static int averageThreeNumbers(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    // Ques 2 : Method to Guess an a number is Even
    public static boolean isEven(int userNum) {
        return userNum % 2 == 0;
    }

    // Ques 3 : Method to check is palindrome or not
    public static boolean isPalindrome(int number) {

        int userN = number; // copied number
        int rev = 0;

        while (userN != 0) {
            int rem = userN % 10;
            rev = (rev * 10) + rem;
            userN = userN / 10;
        }

        // if original num == reverse num than it is palindrome
        if (number == rev) {
            return true;
        }
        return false;
    }

    // Ques 4 : Method to sum up the digits
    public static int DigitsSum(int userChoice) {
        int sum = 0;

        while (userChoice != 0) {
            int remainder = userChoice % 10;
            sum += remainder;
            userChoice /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        // Introducing Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Solution 1");
        int avg_result = averageThreeNumbers(5, 6, 7);
        System.out.println("Average of 3 No. = " + avg_result);

        System.out.println(); // Extra line gap

        System.out.println("Solution 2");
        System.out.println("Enter the number to check:");
        int userNum = in.nextInt();

        if (isEven(userNum)) {
            System.out.println(userNum + " is EVEN");
        } else {
            System.out.println(userNum + " is ODD");
        }

        System.out.println(); // Extra a line

        System.out.println("Solution 3");
        System.out.println("Enter a number to reverse :");
        int userN = in.nextInt();

        if (isPalindrome(userN)) {
            System.out.println("Original Number : " + userN + " is a palindrome");
        } else {
            System.out.println("Original Number : " + userN + " is not a palindrome");
        }

        System.out.println(); // extra line gap

        System.out.println("Solution 4");
        System.out.println("Enter the Number to sum up its Digits:");
        int userChoice = in.nextInt();

        System.out.println("The sum of digits " + DigitsSum(userChoice));

    }
}
