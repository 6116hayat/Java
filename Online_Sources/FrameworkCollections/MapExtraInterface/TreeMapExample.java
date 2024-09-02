package FrameworkCollections.MapExtraInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    // ⁜ TreeMap :
    // • It provides a way to manage key-value pairs in a sorted order. It is
    // implemented using a Red-Black tree, which is a type of self-balancing binary
    // search tree

    // KEY FEATURES :
    // ⁎ Storage : Stores data in key-value pairs
    // ⁎ Null Values : Does not allow null keys but allows multiple null values
    // ⁎ Order : Maintains elements in ascending order based on the natural ordering
    // of keys or a custom comparator provided at map creation time.
    // ⁎ Synchornization : Not synchronized, meaning it is not thread safe

    // DISADVANTAGES:
    // 1. Non-Synchronized: Not thread-safe, so it requires external synchronization
    // in multi-threaded environments.
    // in multi-threaded environments.
    // 2. No Null Keys : Does not allow null keys, which can be a limitation in some
    // cases

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        // Adding elements
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Displaying the TreeMap
        System.out.println(map);

        System.out.println();
        // Accessing elements
        System.out.println("Alice's age: " + map.get("Alice"));

        System.out.println();
        // Removing an element
        map.remove("Bob");
        System.out.println("TreeMap After Removal :" + map);

        System.out.println();
        // Iterating through the TreeMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
