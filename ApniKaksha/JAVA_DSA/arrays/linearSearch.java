package JAVA_DSA.arrays;

public class linearSearch {

    // linear search : find the index of element in given array

    // functions for linear search

    /*
     * public static int linearSearch(int num[], int key) {
     * 
     * // for loop to iterate
     * for (int i = 0; i < num.length; i++) {
     * if (num[i] == key) {
     * return i;
     * }
     * }
     * return -1;
     * }
     */

    // Homework

    // main function
    public static void main(String[] args) {

        /*
         * int num[] = { 2, 4, 6, 8, 10, 12, 14 };
         * int key = 10;
         * 
         * int index = linearSearch(num, key);
         * if (index == -1) {
         * System.out.println("Not Found");
         * } else {
         * System.out.println("Key is at index : " + index);
         * }
         */

        System.out.println("Menu Search program");

        String menu[] = { "idli", "dosa", "samosa", "breadpakoda", "sandwich" };

        String item = "idli";

        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == item) {
                System.out.println(item + " found on index = " + i);
            }
        }
    }

}
