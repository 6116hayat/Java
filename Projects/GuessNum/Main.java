package Projects.GuessNum;

import java.util.*;

public class Main{

    // Creating a function
    static void startGame(){
        Scanner in = new Scanner(System.in);

        boolean keepPlaying = true;
        

        // Keep Playing Game Logic
        while (keepPlaying) {

         // Computer making a choice
        Random random = new Random();
        int computerNum = random.nextInt(10); // chooses number between 0-10

        int UserLives = 3;

        System.out.println("Welcome to the Guessing game");
        System.out.println("I have selected a number from 0 to 10");
        System.out.println("You have " + UserLives + " lives to give the correct answer");

            System.out.println(computerNum);
            
            // User Lives is not equal to Zero loop
            while(UserLives != 0){

                //User Making choice
                System.out.println("Input your guessed Number");
                int userGuess = in.nextInt();

                if (userGuess == computerNum) {
                    System.out.println("You Won !!!");
                    break;
                }else {
                    UserLives--;
                    System.out.println("Try Again!"+ "\n "+ "Lives Remain : "+ UserLives);
                }if(UserLives > 0){
                    System.out.println("Enter the integer Again!");
                }else {
                    System.out.println("You Lost the Game ");
                    System.out.println("The Number was : "+ computerNum);
                }
            } // UserLives loop End

            //Asking the player you want to play again
            System.out.println("Do you want to play Again || yes/no");
            String ans = in.nextLine().toLowerCase();
            if (!ans.equals("yes")) {
                keepPlaying = false;
            } //Keep Playing loop end
        }
    }

    // Main function
    public static void main(String[] args) {
        
        //calling the startGame Function
        startGame();
    }
}
