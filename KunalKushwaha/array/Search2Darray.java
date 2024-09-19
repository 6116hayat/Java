package KunalKushwaha.array;

public class Search2Darray {

    // Functions for finding the target in the array
    public static int[] Search2Darray(int nums [][], int target){

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] == target) {
                    System.out.println("Found "+ target + "at" + nums[row][col]);
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    // Functions for the maximum in Array 
    public static int max2Darray(int nums [][]){

        int max = Integer.MIN_VALUE; //-infinity

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] > max) {
                    max = nums[row][col];
                }
            }
        }
        return max;
    }

    //main function
    public static void main(String[] args) {
        
        int [][] nums = {
                            {23, 4, 1},
                            {18, 12, 3, 9},
                            {78, 99, 34, 56},
                            {18, 12}
        };
        int target = 34;

        // int[] ans = Search2Darray(nums, target); 
        // System.out.println(Arrays.toString(ans));

        System.out.println(max2Darray(nums));
    }
}
