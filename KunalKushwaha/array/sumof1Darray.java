package KunalKushwaha.array;

public class sumof1Darray {
    

    //functions
    static void runningSum(int nums[]){
        for (int i = 0; i < nums.length; i++){
            int sum = nums[i];
            sum += nums[i];
            System.out.println(sum);
        }
        
    }

    public static void main(String[] args) {
        int nums[]= {1,2,3,4};
        runningSum(nums);
    }
}
