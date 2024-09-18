package JAVA_DSA.arrays;

public class MaxSubArraySum {


    // Functions
    public static void MaxSubArraySum(int nums[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) { // loop 1 : start
            int start = i;
            for (int j = i; j < nums.length; j++) { // loop 2 : end
                int end = j;
                currentSum = 0;
                for (int k = start ; k <= end; k++) { // loop 3 : print elements
                    // subArray Sum
                    currentSum += nums[k];
                }
                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("max Sum = " +maxSum);
    }

    public static void main(String[] args) {
        int nums[] = {1, -2, 6, -1, 3};
        MaxSubArraySum(nums);
    }
}
