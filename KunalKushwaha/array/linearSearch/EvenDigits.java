package linearSearch;

// A program to print even/odd based on the digits 
public class EvenDigits{

    //Creating a function
    public static int findNumbers(int nums[]){

        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count ++ ;
            }
        }
        return count;
    }

    //function to check is number of digits is even or not
    public static boolean even(int num){
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }

    //function to count the number of digits in number
    public static int digits(int num){

        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    //main function
    public static void main(String[] args) {
        
        int nums[] = { 12, 345 , 2 , 6 , 7869 };
        System.out.println(findNumbers(nums));
    }
}