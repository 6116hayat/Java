package FrameworkCollections.Set;

import java.util.*;

public class SetInterfacesExample {

    // • It is part of Java Collection Framework
    // • It extends collection interface and provides methods to perform set
    // operations like union, intersection and ddifference

    // KEY FEATURES :-
    // ⁎ No duplicate : A set cannot duplicate items
    // ⁎ Unordered Collection : The elements in set is not stored in any particular
    // order

    // COMMON IMPLEMENTATIONS:
    // 1. HashSet
    // 2. TreeSet
    // 3. LinkedHashSet

    // Disadvantges
    // No Order: Does not maintain any specific order of elements(except for TreeSet
    // and LinkedHashSet)

    public static void main(String[] args) {

        // Creating a hashset to store Elements
        Set<String> games = new HashSet<>();

        // Adding Elemets
        games.add("football");
        games.add("cricket");
        games.add("vollleyball");

        System.out.println("Games :" + games); // Displaying the set

        System.out.println();
        // Checking if element exists
        System.out.println("Contains Squash:" + games.contains("Squash"));

        System.out.println();
        // Removing the elements
        games.remove("cricket"); // here cricket will be removed

        System.out.println();
        // Displaying the list after removal
        System.out.println("Games After removal:" + games);
    }
}
