package Projects.RockPaperGui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RockPaperScissorGui extends JFrame implements ActionListener {

    // Creating a Components for GUI
    JFrame frame = new JFrame();

    // Button for Player's Choice
    private JButton rockButton, paperButton, scissorButton;

    // Label for Display information
    private JLabel resultLabel, playerChoiceLabel, computerChoiceLabel;

    // Random object for the computer's choice
    Random random = new Random();

    public RockPaperScissorGui(){

        //Set up the frame
        setTitle("ROCK-PAPER-SCISSOR");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creating a random object 
        random = new Random();

        // Creating buttons and add action listeners
        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorButton = new JButton("Scissor");

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorButton.addActionListener(this);

        // Add button to frame
        add(rockButton);
        add(paperButton);
        add(scissorButton);

        // Creating and adding labels for displaying
        resultLabel  = new JLabel("Choose Rock, Paper, or Scissor");
        playerChoiceLabel = new JLabel("Your Choice");
        computerChoiceLabel = new JLabel("Computer's Choice");

        // Adding the labels
        add(playerChoiceLabel);
        add(computerChoiceLabel);
        add(resultLabel);

        // Set frame to visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get player's choice based on click
        String playerChoice = e.getActionCommand();

        //Randomly generate computer's choice
        String[] choices = {"Rock", "Paper", "Scissor"};
        String computerChoice = choices[random.nextInt(3)];

        // Display Choices
        playerChoiceLabel.setText("Your Choice:" + playerChoice);
        computerChoiceLabel.setText("Computer's Choice" + computerChoice);

        // Determine the result of the game
        String result = determineWinner(playerChoice, computerChoice); {
            resultLabel.setText(result);
        }
    }

    private String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "It is a tie";
        }

        // Check for all winning conditions for the player
        if ((player.equals("Rock") && computer.equals("Scissors")) ||
                (player.equals("Paper") && computer.equals("Rock")) ||
                (player.equals("Scissors") && computer.equals("Paper"))) {
            return "You win!";
        } else {
            return "You lose!";
        }

    }
}
