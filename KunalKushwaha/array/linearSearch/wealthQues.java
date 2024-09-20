package linearSearch;

public class wealthQues {

    //function
    public static  int maxWealth(int accounts [][]){

        //person = row
        // account = column

        // out of the for loops
        int max =  Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            // start new column 
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        int accounts[][] = { {1,5},{7,3},{3,5} };

    System.out.println("Max Wealth : "+ maxWealth(accounts));
    }

}
