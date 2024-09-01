package FrameworkCollections.Queue;

import java.util.*;

public class PriorityQueueExample {

    // ⁜ Priority Queue
    // • It is a type of queue where elements are based on their priority rather
    // than their insertion order.

    // KEY FEATURES :
    // ⁎ Ordering : Elements are ordered according to their natural ordering(e.g
    // integers in ascending order) or by a Comparator provied at queue
    // connstruction time.
    // ⁎ No Nulls : Does not permit null elements
    // ⁎ Unbounded : Queue grows as needed to accomodate new elements

    // Common Methods:
    // • add(E e): Inserts the specified element into the queue.
    // • offer(E e): Inserts the specified element into the queue.
    // • poll(): Retrieves and removes the head of the queue, or returns null if the
    // queue is empty.
    // • remove(): Retrieves and removes the head of the queue.
    // • peek(): Retrieves, but does not remove, the head of the queue, or returns
    // null if the queue is empty
    // • element(): Retrieves, but does not remove, the head of the queue.

    public static void main(String[] args) {

        // Constructing the queue
        PriorityQueue<String> animals = new PriorityQueue<>();

        // Adding the elements:
        animals.add("Bull");
        animals.add("Cow");
        animals.add("Goat");
        animals.add("Sheep");

        // Displaying the queue
        System.out.println("Animals: " + animals);

        System.out.println();
        // Removing the elements
        animals.remove("Bull"); // Removing the inddex one element

        System.out.println("Animals Queue After Removal :" + animals);

        System.out.println();
        // Peeking the head of the PriorityQueue
        System.out.println("Head of the Queue :" + animals.peek());

    }
}
