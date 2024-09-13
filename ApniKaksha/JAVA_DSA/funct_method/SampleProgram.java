package JAVA_DSA.funct_method;

import java.util.*;

public class SampleProgram {

    /*
     * // Hello world function
     * public static void printHelloWorld() {
     * System.out.println("Hello World");
     * }
     * 
     * // parameter function
     * public static int sum(int a, int b) { // parameters / formal parameters
     * return a + b;
     * }
     * 
     * // function for swap values
     * public static void swap(int num1, int num2) {
     * int temp = num1;
     * num1 = num2;
     * num2 = temp;
     * System.out.println("After Swapping");
     * System.out.println("Number 1 = " + num1 + "\n" + "Number 2 = " + num2);
     * }
     * 
     * // function for products
     * public static int multiply(int a, int b) {
     * return a * b;
     * }
     * 
     * // factorial of a number
     * public static int factorial(int n) {
     * int fact = 1;
     * for (int i = 1; i <= n; i++) {
     * fact *= i;
     * }
     * return fact;
     * }
     * 
     * // binomial cofficient
     * /*
     * Binomial coefficient = {(f)!} / {(r)! * (n-r)!}
     */

    /*
     * public static int binCoeff(int n, int r) {
     * 
     * int fact_n = factorial(n);
     * int fact_r = factorial(r);
     * int fact_nmr = factorial(n - r);
     * 
     * int binCoeff = fact_n / (fact_r * fact_nmr);
     * return binCoeff;
     * }
     * 
     * // Is number a prime or not (Important)
     * public static boolean isPrime(int num) {
     * boolean isPrime = true;
     * for (int i = 2; i <= num - 1; i++) {
     * if (num % i == 0) { // completely divides
     * isPrime = false;
     * break;
     * }
     * }
     * return isPrime;
     * }
     */

    /*
     * 
     * // different way for isPrime
     * public static boolean isPrime(int n) {
     * 
     * // special case
     * if (n == 2) {
     * return true;
     * }
     * 
     * for (int i = 2; i <= Math.sqrt(n); i++) {
     * if (n % i == 0) {
     * return false;
     * }
     * }
     * return true;
     * }
     * 
     * // prime in range
     * public static void primesInRange(int n) {
     * for (int i = 2; i <= n; i++) {
     * if (isPrime(i)) { // true
     * System.out.println(i + " ");
     * }
     * }
     * System.out.println();
     * }
     * 
     */

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

        /*
         * // product of two numbers
         * System.out.println("Enter the 2 numbers ");
         * int a = in.nextInt();
         * int b = in.nextInt();
         * int product = multiply(a, b);
         * System.out.println("Product of 2 numbbers : " + product);
         */

        /*
         * // factorial of a number
         * System.out.println("Enter the number for factorial ");
         * int a = in.nextInt();
         * int f = factorial(a);
         * System.out.println("The Factorial of number " + a + " = " + f);
         */

        /*
         * // binomial coefficient
         * System.out.println("Binomial coefficient = " + binCoeff(5, 2));
         */

        /*
         * // isPrime
         * System.out.println("Enter the number to check for Prime");
         * int num = in.nextInt();
         * System.out.println("Is the number Prime : " + isPrime(num));
         */

        /*
         * 
         * System.out.println("Enter the number to check for Prime");
         * int n = in.nextInt();
         * System.out.println("Is the number Prime : " + isPrime(n));
         * 
         * primesInRange(20); // 2 to 20
         * 
         */

    }
}
