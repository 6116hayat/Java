package JAVA_DSA.arrays;

public class arraysASfunction {

    // functions for arrays
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    // main function
    public static void main(String[] args) {

        // creating an array
        int marks[] = { 99, 98, 97 };

        // updating the array with function
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}
