package JAVA_DSA.arrays;

import java.util.*;

public class largestNumber {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {

        // -infinity : Integer.Min_Value
        // +infinity : Integer.Max_Value

        int numbers[] = { 1, 2, 8, 6, 7 };
        System.out.println("Largest number is : " + getLargest(numbers));
    }
}
