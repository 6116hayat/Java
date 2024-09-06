package Java_8_Features.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// 1.Intermediate Operations :
// ⁎ filter(): Filters elements based on a specified condition
// ⁎ map(): Transforms each element in a stream to another value.
// ⁎ sorted():  Sorts the elements of a stream.

public class intermediateOperations {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Integer> num = new ArrayList<Integer>();

        // Adding elements
        num.add(1);
        num.add(12);
        num.add(4);
        num.add(33);
        num.add(7);

        // printing out the list
        System.out.println(num);

        System.out.println();// for extra line gap

        // 1.filtering the elements out (here odd numbers)
        List<Integer> ls = num.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        // priting out the collection after stream Operation
        System.out.println("Printing out the List After Stream :" + ls);

        System.out.println(); // for extra line gap

        // 2.Using the map function
        List<Integer> sqrnum = num.stream().map(n -> n * n).collect(Collectors.toList());
        // Printint the squared number
        System.out.println("Square Numbered :" + sqrnum);

        System.out.println(); // for extra line gap

        // Using the sorted() function to sort the list
        List<Integer> sortSqrnum = sqrnum.stream().sorted().collect(Collectors.toList());
        // Priting out the sorted number sequence
        System.out.println("Sorted Square number : " + sortSqrnum);

    }

}