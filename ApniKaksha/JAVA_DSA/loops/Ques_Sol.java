package JAVA_DSA.loops;

import java.util.*;

public class Ques_Sol {
    public static void main(String[] args) {
        // Creating a scanner class
        Scanner input = new Scanner(System.in);

        // Ques 2 : A program to print sum of even and odd integers upto N
        System.out.println("Input the limit of Intgers upto you want SUM");
        int userLimit = input.nextInt();

        int EvenSum = 0, OddSum = 0;
        for (int i = 0; i <= userLimit; i++) {
            if (i % 2 == 0) {
                EvenSum += i;
            } else {
                OddSum += i;
            }
        }

        System.out.println("The sum of all Even Upto " + userLimit + " = " + EvenSum);
        System.out.println("The sum of all Odd Upto " + userLimit + " = " + OddSum);

        System.out.println(); // For Extra Line Gap

        // Ques 3 : Factorial of a number
        System.out.println("Input the limit for factorial");
        int factorialLimit = input.nextInt();

        int Factorial = 1;
        for (int i = 1; i <= factorialLimit; i++) {
            Factorial *= i;
        }

        System.out.println("The factorial for limit " + factorialLimit + " = " + Factorial);

        System.out.println(); // for extra line Gap

        // Ques 4 : Program to print the Table
        System.out.println("Enter the number for the table:");
        int tableLimit = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int table = 1;
            table = tableLimit * i;
            System.out.println(tableLimit + " * " + i + " = " + table);
        }

    }
}
