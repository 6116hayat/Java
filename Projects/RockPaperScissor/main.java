package Projects.RockPaperScissor;

// 1. Importing the libraries
import java.util.*;
import java.util.jar.Attributes.Name;

// 2. Creating the main class and methods
public class main {
    public static void main(String[] args) {

        // Introducing Scanner for the user Input
        Scanner in = new Scanner(System.in);

        // Welcoming to the Program
        System.out.println("Welcome to the ROCK-PAPER-SCISSOR GAME:");

        // Play-Again variable for the loop
        boolean playAgain = true;
        while (playAgain == true) {

            // 3. Taking User Input :
            System.out.println("Enter Your Choice : ");
            System.out.println("Rock, Paper, Scissor :");
            String playerChoice = in.nextLine().toLowerCase();

            // 4. Taking the Random chocie from the computer
            Random random = new Random();
            int computerChoice = random.nextInt(3); // generate numbers from 0, 1 and 2

            String computerMove;
            if (computerChoice == 0) {
                computerMove = "rock";
            } else if (computerChoice == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissor";
            }
            System.out.println("Computer Chose = " + computerMove);

            // 5. Determine the winner
            if (playerChoice.equals(computerMove)) {
                System.out.println("It is tie");
            } else if (playerChoice.equals("rock") && computerMove.equals("scissors") ||
                    playerChoice.equals("scissors") && computerMove.equals("paper") ||
                    playerChoice.equals("paper") && computerMove.equals("rock")) {
                System.out.println("You Win!!");
            } else {
                System.out.println("You Lose !!");
            }

            // Asking the player want to play again or not
            System.out.println("Do you wan to play again ? (yes/no)");
            String answer = in.nextLine().toLowerCase();
            if (!answer.equals("yes")) {
                playAgain = false;
            }

        } // while loop end
    }
}
