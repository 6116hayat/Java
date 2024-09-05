package Java_8_Features.LambdaExpressions;

import java.util.ArrayList;
import java.util.Scanner;

public class lambdaExpressionExample {

    // ⁜ Lambda Expressions:
    // • A lambda expression is a short block of code which takes in parameters and
    // returns a value. Lambda expressions are similar to methods, but they do not
    // need a name and they can be implemented right in the body of a method.
    // • It provides a concise way to represent instances of functional
    // interfaces(interfaces with a single abstract method)
    // • They allow you to write more readable and maintainable code by reducing
    // boilerplate.

    // Basic syntax fo zero parameters
    // () -> expression

    // Basic Syntax for single parameter
    // (parameters) -> expression

    // Basic Syntax for more than one parameter
    // (parameter1, parameter2) -> expression

    public static void main(String[] args) {

        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL
        arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }

}