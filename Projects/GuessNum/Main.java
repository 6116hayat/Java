package Projects.GuessNum;

import java.util.*;

public class Main{

    //Creating a fucntion
    public static void startGame(){
        // creating a scanner 
        Scanner in =  new Scanner(System.in);

        // Asking the user for the input
        System.out.print("\n"+ " Choose a Integer from 0-10 ");
        int userInput = in.nextInt();

        //User-Lives 
        int userLives = 3;

            //Computer chose the number 
            Random random = new Random();
            int computerChoice = random.nextInt(10);

            if (userInput == computerChoice) {
                System.out.println("You found the number");
            }else{
                System.out.println("Try Again!!");
                userLives--;
                System.out.println("Lives -1, "+ userLives + " Lives Remain");
            }

            //UserLives commes to 0
            if (userLives == 0) {
                System.out.println("You Lost the Game");
                System.out.println("The number was : "+ computerChoice);
            }

    }


    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Welcome to the Guess the number Game");

        // Keep-Playing loop 
        boolean keepPlaying = true;

        int userLives = 3;

        while (keepPlaying) {

            while (userLives != 0) {
                //Runing the startGame function
                startGame();
                userLives--;
            }
            

        // Asking the Player you want ot continue ??
        System.out.println("Do you want to Continue ?? (yes/no)");
        String ans = in.next().toLowerCase();
        if (ans.equals("no")) {
            keepPlaying = false;
        }

        } //  while Loop end
    }
}
