package FrameworkCollections.MapExtraInterface;

import java.util.*;

public class HashMapExample {

    // ⁜ HashMap :
    // • It is used to store key-value pairs
    // • It allows for efficient retrieval, insertion, and deletion of elements
    // based on keys

    // KEY FEATURES :
    // ⁎ Storage : Stores data in key-value pairs
    // ⁎ Null Values : Allows one null key and multiple null values
    // ⁎ Order : Does not maintain any order of its elements
    // ⁎ Synchornization : Not synchronized, meaning it is not thread safe

    // DISADVANTAGES
    // 1. Not Synchronied : Not Thread-Safe, so it requires external synchronization
    // in multi-threaded environments.
    // 2. No-Order : Does not maintain any order of elements

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding Elements
        map.put("Key1", 10);
        map.put("Key2", 20);
        map.put("Key3", 30);
        map.put("Key4", 40);

        // Displaying the HashMap
        System.out.println("HashMap :" + map);

        System.out.println();
        // Accessing the elements
        System.out.println("Key3 =" + map.get("Key3"));

        System.out.println();
        // Removing elements
        map.remove("Key2");
        System.out.println("HashMap After Removal : " + map);

        System.out.println();
        // Checking for the Key
        System.out.println("HashMap Contains Key4 :" + map.containsKey("Key4"));

        System.out.println();
        // Iterating through the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key :" + entry.getKey() + ",Value : " + entry.getValue());
        }
    }

}
