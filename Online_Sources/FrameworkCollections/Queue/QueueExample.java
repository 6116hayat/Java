package FrameworkCollections.Queue;

import java.util.PriorityQueue;
import java.util.*;

public class QueueExample {

    // ⁜ Queue
    // • It represents the collections designed for holding elements prior to
    // processing. It follows the First-In-First-Out(FIFO) principle, meaning
    // elements are processed in order they were added.

    // Key Implementations:
    // 1. LinkedList 2. Priority Queue 3.Array Deque 4.PriorityBlockingQueue

    public static void main(String[] args) {

        // Creating the List
        Queue<Integer> queue = new PriorityQueue<>();

        // Adding the elememts
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // Displaying the Queue
        System.out.println("Queue :" + queue);

        System.out.println();
        // Removing the elements from the Queue
        queue.remove("Removed Elements : " + queue.remove(3));

        System.out.println("Queue After Removal:" + queue);

        System.out.println();
        // Peeking the head of the thread
        System.out.println("Head of the queue: " + queue.peek());
    }
}
