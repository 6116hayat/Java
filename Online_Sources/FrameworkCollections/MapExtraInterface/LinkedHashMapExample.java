package FrameworkCollections.MapExtraInterface;

import java.util.*;

public class LinkedHashMapExample {

    // ⁜ LinkedHashMap :
    // • It is similar to LinkedHashMap but with additional feature of maintaining
    // insertion order of elements.

    // KEY FEATURES :
    // ⁎ Storage : Stores data in key-value pairs
    // ⁎ Null Values : Allows one null key and multiple null values
    // ⁎ Order : Maintains the order of elements based on their insertion
    // ⁎ Synchornization : Not synchronized, meaning it is not thread safe

    // DISADVANTAGES:
    // 1. Non-Synchronized: Not thread-safe, so it requires external synchronization
    // in multi-threaded environments.
    // 2. Memory Overhead: Slightly more memory overhead compared to HashMap due to
    // the linked list used to maintain order.

    public static void main(String[] args) {

        // Creating a HashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Adding Elements
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        // Displaying the HashMap
        System.out.println("HashMap :" + map);

        System.out.println();
        // Accessing the elements
        System.out.println("C =" + map.get("C"));

        System.out.println();
        // Removing elements
        map.remove("A");
        System.out.println("HashMap After Removal : " + map);

        System.out.println();
        // Checking for the Key
        System.out.println("HashMap Contains D :" + map.containsKey("D"));

        System.out.println();
        // Iterating through the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key :" + entry.getKey() + ", Value : " + entry.getValue());
        }
    }

}
