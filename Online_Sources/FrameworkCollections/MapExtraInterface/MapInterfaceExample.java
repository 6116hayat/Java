package FrameworkCollections.MapExtraInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {

    // ⁜ MAP
    // • Unlike the other collections types, it does not extend collection interface

    // KEY FEATURES :
    // ⁎ Unique Keys : Each key in a map is unique, and each key maps to exactly one
    // value
    // ⁎ Null values : Some implementations allow null keys and values (e.g
    // HashMap), while others do not (e.g TreeMap)
    // ⁎ Order : The order map depends on specific Implementations (For Example
    // :HashMap does not gurrantee any order, while LinkedHashMap maintains
    // insertion Order)

    // Common Implementations:
    // 1.HashMap 2.LinkedHashTable 3.TreeMap 4.HashTable

    // Common Methods:
    // • put(K key, V value): Associates the specified value with the specified key
    // in this map.
    // • get(Object key): Returns the value to which the specified key is mapped, or
    // null if this map contains no mapping for the key.
    // • remove(Object key): Removes the mapping for a key from this map if it is
    // present.
    // • containsKey(Object key): Returns true if this map contains a mapping for
    // the specified key.
    // • containsValue(Object value): Returns true if this map maps one or more keys
    // to the specified value.
    // • keySet(): Returns a Set view of the keys contained in this map.
    // • values(): Returns a Collection view of the values contained in this map.
    // • entrySet(): Returns a Set view of the mappings contained in this map.

    public static void main(String[] args) {

        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println();

        // Displaying the map
        System.out.println("Map elements: " + map);

        System.out.println();

        // Retrieving a value
        System.out.println("Value for key 'Two': " + map.get("Two"));

        System.out.println();

        // Removing a key-value pair
        map.remove("One");
        System.out.println("Map after removal: " + map);

        System.out.println();

        // Checking if a key exists
        System.out.println("Contains key 'Three': " + map.containsKey("Three"));
    }
}
