package FrameworkCollections.UsingCollections;

import java.io.*;
import java.util.*;

// List Interfaces :
/*
 * We will proceed in :-
 * 1. Arraylist
 * 2. Vector
 * 3. Stack
 * 4. LinkedList
 */

/*
 * creating an Arraylist Example 
 *  
 * class ArrayListExample {
 * public static void main(String[] args) {
 * 
 * int n = 5; // Size of ArrayList
 * 
 * // Declaring the list with size of n;
 * List<Integer> arrayList = new ArrayList<Integer>(n);
 * 
 * // Appending the new elements
 * for (int i = 1; i <= n; i++) {
 * arrayList.add(i);
 * }
 * 
 * // Printing elements
 * System.out.println(arrayList);
 * 
 * // Removing elements at index 3
 * arrayList.remove(3);
 * 
 * System.out.println(arrayList);
 * 
 * }
 * }
 * 
 */

/* 

// Creating a Vector Example

class VectorExample {
    public static void main(String[] args) {

        // Size of vector
        int n = 5;

        // Declaring the list with intial n
        List<Integer> v = new Vector<Integer>(n);

        // Appending elements
        for (int i = 1; i <= n; i++) {
            v.add(i);
        }

        // printing elements
        System.out.println(v);

    }
}

*/

/* 

// Creating a Stack Example

class StackExample {
    public static void main(String[] args) {

        // Size of the stack
        int n = 5;

        // Declaring the List
        List<Integer> s = new Stack<Integer>();

        // Appending the new Elements
        for (int i = 1; i <= n; i++) {
            s.add(i);
        }

        System.out.println(s);
    }
}

*/

/* */

//Creating a Linked List Example
class LinkedListExample {
    public static void main(String[] args) {

        // Size of array
        int n = 5;

        // Declarinng the List
        List<Integer> ll = new LinkedList<Integer>();

        // Appending the list with the elements
        for (int i = 1; i <= n; i++) {
            ll.add(i);
        }

        // printing the elements
        System.out.println(ll);
    }
}