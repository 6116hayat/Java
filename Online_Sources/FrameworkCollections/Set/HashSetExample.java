package FrameworkCollections.Set;

import java.util.HashSet;

public class HashSetExample {

    // HashSet
    // • It implements the set interface and is backed by a Hash Table(a HashMap
    // instance)

    // KEY FEATURES:
    // ⁎ No Duplicate : Ensures that no duplicate elements are stored
    // ⁎ Unordered : Does not gurrantee the order of elements
    // ⁎ Allows Null : can store a single null element
    // ⁎ Thread-Safety : not synchornized so its not treated by default

    // DISADVANTAGES:
    // • No Order : Does not maintain any specific order of elements
    // • Thread-Safety : Not Synchornized, so it not thread-safe by default

    public static void main(String[] args) {

        // Creating a HashSet
        HashSet<String> color = new HashSet<>();

        // Adding elemets to list
        color.add("Black");
        color.add("White");
        color.add("Purple");

        // Displaying the HashSet
        System.out.println("Color: " + color);

        System.out.println(); // for the line break
        // Attempting to add a duplicate element
        color.add("Purple");

        System.out.println();
        // checking if the elements exists
        System.out.println("Color contains Green :" + color.contains("Green"));

        System.out.println();
        // Removing the elements
        color.remove("Purple");

        System.out.println("List After Color: " + color);
    }
}
