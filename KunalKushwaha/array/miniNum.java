package KunalKushwaha.array;

public class miniNum {
    
    //function
    public static int miniNum(int nums[]){
        int smallest = Integer.MAX_VALUE; // +infinity

        if (nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        
        int nums[] = {18, 12 , -7 , 3 , 14 ,28};
        System.out.println("The Minimum Value in the array :" + miniNum(nums));
    }
}
