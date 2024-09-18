package KunalKushwaha.array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,54,69,78,45,53};
        int target = 69;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // Search in the array : return the index if item found
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for a loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute
        return -1;
    }
}
