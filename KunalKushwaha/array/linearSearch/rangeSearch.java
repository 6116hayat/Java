package linearSearch;

public class rangeSearch {
    
    // fucntion
    public static int RangeSearch(int nums[],int target,int start, int end){
        
        for (int index = start; index <=  end; index++) {
            if (nums.length == 0) {
                return -1;
            }

            if(target == nums[index]){
                return index;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        
        int nums[] = {18,12,-7,3,14,28};
        int target = 3 ;

        int start = 1, end = 4;

        System.out.println(RangeSearch(nums, target, start, end));
    }
}
