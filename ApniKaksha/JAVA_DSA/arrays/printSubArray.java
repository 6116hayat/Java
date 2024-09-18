package JAVA_DSA.arrays;

public class printSubArray {    
    // Sub Array : A continuous part of array

    // Function
    public static void printSubArray(int nums[]){
        int ts = 0;

        for (int i = 0; i < nums.length; i++) { // loop 1 : start
            int start = i;
            for (int j = i; j < nums.length; j++) { // loop 2 : end
                int end = j;
                for (int k = start ; k <= end; k++) { // loop 3 : print elements
                    System.out.print(nums[k]+ " "); // Sub-Array

                    ts ++ ;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub-Arrays : "+ ts);
    }

    public static void main(String[] args) {

        // An array for the nested loop
        int nums[] = {2,4,6,8,10};
        printSubArray(nums);
    }
}
