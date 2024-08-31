package FrameworkCollections.List;

import java.util.LinkedList;

public class LinkedListExample {

    // LinkedList :-
    // • Unlike an arraylist, which uses a dynamic array to store elements, a
    // LinkedList used a doubly linked list to store elements

    // Key Features :-
    // ⁎ Dynamic Size: LinkedList can grow and shrink
    // ⁎ Nodes: Each elements is stored in a node, which contains data and
    // references(links) to the previous node
    // ⁎ Type-Safe: Adding or removing elements is more effiecient compared to
    // Arraylists, especially when dealing with large datasets

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<String>(); // Creating an LinkedList

        // Adding the elements
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("cherry");

        System.out.println("The Original List: " + fruits);

        System.out.println();
        // Accessing the elements
        String car = fruits.get(0); // here it is mango
        System.out.println("The List Elements from index(0) : " + fruits.get(0));

        System.out.println();
        // Modifying elements
        fruits.set(1, "pineapple"); // Lambo replaced with pineapple
        System.out.println("The Modifying List: " + fruits);

        System.out.println();
        // Removing elements
        fruits.remove(0); // Removing mercedes
        System.out.println("After Removed elements from List: " + fruits);

        // Getting the size
        System.out.println("ArrayList Size : " + fruits.size());

        System.out.println();
        // Looping through the elements
        for (String i : fruits) {
            System.out.println(i);
        }
    }

}
