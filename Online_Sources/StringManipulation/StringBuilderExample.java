package StringManipulation;

public class StringBuilderExample {

    // ⁜ StringBuilder :
    // • A java class used to create mutable sequences of Character.
    // • Unlike String, which is immutable, StringBuilder allows you to modify the
    // content without creating new objects, making it more efficient for certain
    // operations

    // KEY FEATURES :
    // ⁎ Mutable : you can change the content wihtout creating new objects.
    // ⁎ Not-Thread-Safe : Unlike StringBuffer, StringBuilder is not synchronized,
    // making it faster but not thread-safe.

    // When To Use:
    // ৹ Frequent Modifications : When you need to modify strings frequently, such
    // as in loops
    // ৹ Single-Threaded Environment : When Thread safety is not concern

    public static void main(String[] args) {

        // 1.Append() : Adds Text to the end of current sequence
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb.toString()); // "Hello World"

        System.out.println(); // For a line Gap

        // 2.Insert() : Inserts text at a specified position
        sb.insert(5, ",");
        System.out.println(sb.toString()); // "Hello, World"

        System.out.println(); // For a line Gap

        // 3.Replace() : Replaces apart of the sequence with another string
        sb.replace(5, 6, "!");
        System.out.println(sb.toString()); // "Hello! World"

        System.out.println(); // For a line Gap

        // 4.Delete() : Removes characters from the sequence
        sb.delete(5, 6);
        System.out.println(sb.toString()); // "Hello World"

        System.out.println(); // For a line Gap

        // 5.Reverse() : Reverses the sequence
        sb.reverse();
        System.out.println(sb.toString()); // "dlroW olleH"

        System.out.println(); // For a line Gap

        // 6.Capacity() : Returns the current capacity of the String Builder
        int capacity = sb.capacity();
        System.out.println("Capacity :" + capacity);

        System.out.println(); // For a line Gap

        // 7.EnsureCapacity() : Ensures the capacity is at least equal to specified
        // minimum
        sb.ensureCapacity(50);

    }
}
