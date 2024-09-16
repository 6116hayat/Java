package JAVA_DSA.arrays;

public class BinarySearch {

    // Creating a fucntion for binary search
    public static int BinarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisions
            if (numbers[mid] == key) { // found
                return mid;
            }
            if (numbers[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = { 1, 5, 8, 65, 41, 13, 19 };
        int key = 13;

        System.out.println("The key is at the index " + BinarySearch(numbers, key));

    }
}
