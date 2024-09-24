package JAVA_DSA.basicSorting.bubbleSort;

public class example1 {

    //  function
    public static void bubbleSort(int nums[]){
        for (int turn = 0; turn < nums.length-1; turn++) {
            for (int i = 0; i < (nums.length - 1 - turn); i++) {
                if (nums[i] > nums[i+1]) {
                    //swap
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
    }

    // Function to print nums
    public static void printNum(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int nums[] = {5,4,1,3,2};
        bubbleSort(nums);
        printNum(nums);
    }
}
