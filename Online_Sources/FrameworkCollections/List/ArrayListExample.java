package FrameworkCollections.List;

import java.util.*;

public class ArrayListExample {

    // ArrayList :-
    // • Resizable arrray implementation in Java of list Interface
    // • ArrayList can dynamically grow and shrink as elements are added or removed

    // Key Features :-
    // ⁎ Dynamic Size: Automatically resizes itself when elements are added or
    // removed
    // ⁎ Indexed Access: Elements can be accessed directly using their index
    // ⁎ Type-Safe: Can store any type of object, and you can specify the type using
    // generics

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>(); // Creating an ArrayList

        // Adding the elements
        cars.add("BMW");
        cars.add("Lambo");
        cars.add("Mercedes");

        System.out.println("The Original List: " + cars);

        System.out.println();
        // Accessing the elements
        String car = cars.get(0); // here it is BMW
        System.out.println("The List Elements from index(0) : " + cars.get(0));

        System.out.println();
        // Modifying elements
        cars.set(1, "Tesla"); // Lambo replaced with tesla
        System.out.println("The Modifying List: " + cars);

        System.out.println();
        // Removing elements
        cars.remove(0); // Removing mercedes
        System.out.println("After Removed elements from List: " + cars);

        // Getting the size
        System.out.println("ArrayList Size : " + cars.size());

        System.out.println();
        // Looping through the elements
        for (String i : cars) {
            System.out.println(i);
        }
    }

}
