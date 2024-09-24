package KunalKushwaha.Sorting.bubbleSort;

import java.util.Arrays;

public class example {
    
    //function
    static void bubble(int nums[]){
        // run the steps n-1 times
        for (int i = 0; i < nums.length; i++) {
            // for each step, max value come to the last index
            for (int j = 1; j < nums.length - i ; j++) {
                // swap if the item is smaller than the previous
                if (nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }

    //main 
    public static void main(String[] args) {

        // Array of numbers
        int nums[] = {5,4,3,2,1};
        bubble(nums);
        System.out.println(Arrays.toString(nums));

    }
}
