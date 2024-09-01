package FrameworkCollections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    // LinkedHashSet
    // • It combines the characteristics fo a HashSet and a LinkedList maintaining a
    // doubly linked list across all element.
    // • It ensures the iteration order is the same as the insertion order, unlike
    // Hashset, which does not gurrantee any specific order.

    // KEY FEATURES:
    // ⁎ No Duplicate : Ensures that no duplicate elements are stored
    // ⁎ Maintaining Insertion Order : Elements are returned in order they were
    // inserted
    // ⁎ Implements set interfaces : Provides all optional set operation and permit
    // null elements

    // DISADVANTAGES:
    // • No Order : Does not maintain any specific order of elements
    // • Thread-Safety : Not Synchornized, so it not thread-safe by default

    public static void main(String[] args) {

        // Creating a LinkedHashSet
        LinkedHashSet<String> alphabets = new LinkedHashSet<>();

        // Adding elemets to list
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.add("A"); // Duplicate item will not be added

        // Displaying the LinkedHashSet
        System.out.println("alphabets: " + alphabets);

        System.out.println(); // for the line break
        // Adding the new element to the hashset
        alphabets.add("E");

        System.out.println();
        // checking if the elements exists
        System.out.println("alphabets contains E :" + alphabets.contains("E")); // Output will be a True

        System.out.println();
        // Removing the elements
        alphabets.remove("C");

        System.out.println("List After Removing: " + alphabets);
    }
}
