package FrameworkCollections.List;

import java.util.Vector;

public class VectorListExample {

    // VectorList :-
    // • It implements growable array to objects, similar to arraylist but with some
    // differences.

    // Key Features :-
    // ⁎ Dynamic Size: VectorList can grow and shrink
    // ⁎ Synchronized: VectorList is synchronized making it thread safe. This means
    // that multiple thread can access a vector withoutcasuing data inconsistency
    // ⁎ LegacyClass: Vector is considered to be a legacy class, but it is fully
    // compatible with collections framework

    public static void main(String[] args) {

        Vector<String> numbers = new Vector<String>(); // Creating an LinkedList

        // Adding the elements
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");

        System.out.println("The Original List: " + numbers);

        System.out.println();
        // Accessing the elements
        String car = numbers.get(0); // here it is one
        System.out.println("The List Elements from index(0) : " + numbers.get(0));

        System.out.println();
        // Modifying elements
        numbers.set(1, "four"); // Lambo replaced with pineapple
        System.out.println("The Modifying List: " + numbers);

        System.out.println();
        // Removing elements
        numbers.remove(0); // Removing mercedes
        System.out.println("After Removed elements from List: " + numbers);

        // Getting the size
        System.out.println("ArrayList Size : " + numbers.size());

        System.out.println();
        // Looping through the elements
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
