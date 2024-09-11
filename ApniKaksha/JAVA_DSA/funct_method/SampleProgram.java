package JAVA_DSA.funct_method;

import java.util.*;

public class SampleProgram {

    // Hello world function
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    // parameter function
    public static int sum(int a, int b) { // parameters / formal parameters
        return a + b;
    }

    // function for swap values
    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping");
        System.out.println("Number 1 = " + num1 + "\n" + "Number 2 = " + num2);
    }

    // function for products
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // calling the Scanner
        Scanner in = new Scanner(System.in);

        /*
         * 
         * System.out.println("Hello world Function Called");
         * printHelloWorld(); // hello world function call
         * 
         * System.out.println(); // Line Gap
         * 
         * // sum function
         * System.out.println("Sum function Called ");
         * System.out.println("Enter the numbers ");
         * int a = in.nextInt();
         * int b = in.nextInt();
         * int sum = sum(a, b); // arguments or actual parameters
         * System.out.println("Sum is : " + sum);
         * 
         * 
         */

        /*
         * // swap values of 2 numbers
         * int num1 = 5;
         * int num2 = 6;
         * System.out.println("Before Swapping");
         * System.out.println("Number 1 = " + num1 + "\n" + "Number 2 = " + num2 +
         * "\n");
         */

        /*
         * // swapping starts here
         * int temp = num1;
         * num1 = num2;
         * num2 = temp;
         * System.out.println("After Swapping");
         * System.out.println("Number 1 = " + num1 + "\n" + "Number 2 = " + num2);
         */

        // product of two numbers
        System.out.println("Enter the 2 numbers ");
        int a = in.nextInt();
        int b = in.nextInt();
        int product = multiply(a, b);
        System.out.println("Product of 2 numbbers : " + product);
    }
}
