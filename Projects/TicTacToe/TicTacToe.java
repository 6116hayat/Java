package Projects.TicTacToe;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;



public class TicTacToe implements ActionListener {

    //Creating an instance of random class
    Random random = new Random();

    // Creating commponents for GUI
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn ;


    TicTacToe(){
        
        // creating frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        // Creating the textfiled 
        textfield.setBackground(Color.ORANGE);
        textfield.setForeground(new Color(150,0,150));
        textfield.setFont(new Font("Ink Free",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("TIC_TAC_TOE");
        textfield.setOpaque(true);

        // creating the title panel
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        //Creating the button Panel
        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(Color.RED);

        //creating a for loop for the buttons
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

        }
        

        //adding the components
        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        // calling out the first turnn method
        firstTurn();

    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        // creating a for loop
        for (int i = 0; i < 9; i++) {
            if (e.getSource()== buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.BLUE);
                        buttons[i].setText("X");
                        player1_turn = false;
                        textfield.setText("O turn");

                        // calling out the check functions
                        check();
                    }
                }
                else{
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.BLACK);
                        buttons[i].setText("O");
                        player1_turn = true;
                        textfield.setText("X turn");
                    }
                }
            }
        }
    }

    // Creating a method for random turn 
    public void firstTurn(){

        // program sleep program
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (random.nextInt(2) == 0) {
            player1_turn = true;
            textfield.setText("X turn");
        }
        else{
            player1_turn = false;
            textfield.setText("O turn");
        }
    }

    // Creating a method for check
    public void check(){
        //check X win conditions
		if(
            (buttons[0].getText()=="X") &&
            (buttons[1].getText()=="X") &&
            (buttons[2].getText()=="X")
            ) {
        Xwins(0,1,2);
    }
    if(
            (buttons[3].getText()=="X") &&
            (buttons[4].getText()=="X") &&
            (buttons[5].getText()=="X")
            ) {
        Xwins(3,4,5);
    }
    if(
            (buttons[6].getText()=="X") &&
            (buttons[7].getText()=="X") &&
            (buttons[8].getText()=="X")
            ) {
        Xwins(6,7,8);
    }
    if(
            (buttons[0].getText()=="X") &&
            (buttons[3].getText()=="X") &&
            (buttons[6].getText()=="X")
            ) {
        Xwins(0,3,6);
    }
    if(
            (buttons[1].getText()=="X") &&
            (buttons[4].getText()=="X") &&
            (buttons[7].getText()=="X")
            ) {
        Xwins(1,4,7);
    }
    if(
            (buttons[2].getText()=="X") &&
            (buttons[5].getText()=="X") &&
            (buttons[8].getText()=="X")
            ) {
        Xwins(2,5,8);
    }
    if(
            (buttons[0].getText()=="X") &&
            (buttons[4].getText()=="X") &&
            (buttons[8].getText()=="X")
            ) {
        Xwins(0,4,8);
    }
    if(
            (buttons[2].getText()=="X") &&
            (buttons[4].getText()=="X") &&
            (buttons[6].getText()=="X")
            ) {
        Xwins(2,4,6);
    }
    //check O win conditions
    if(
            (buttons[0].getText()=="O") &&
            (buttons[1].getText()=="O") &&
            (buttons[2].getText()=="O")
            ) {
        Owins(0,1,2);
    }
    if(
            (buttons[3].getText()=="O") &&
            (buttons[4].getText()=="O") &&
            (buttons[5].getText()=="O")
            ) {
        Owins(3,4,5);
    }
    if(
            (buttons[6].getText()=="O") &&
            (buttons[7].getText()=="O") &&
            (buttons[8].getText()=="O")
            ) {
        Owins(6,7,8);
    }
    if(
            (buttons[0].getText()=="O") &&
            (buttons[3].getText()=="O") &&
            (buttons[6].getText()=="O")
            ) {
        Owins(0,3,6);
    }
    if(
            (buttons[1].getText()=="O") &&
            (buttons[4].getText()=="O") &&
            (buttons[7].getText()=="O")
            ) {
        Owins(1,4,7);
    }
    if(
            (buttons[2].getText()=="O") &&
            (buttons[5].getText()=="O") &&
            (buttons[8].getText()=="O")
            ) {
        Owins(2,5,8);
    }
    if(
            (buttons[0].getText()=="O") &&
            (buttons[4].getText()=="O") &&
            (buttons[8].getText()=="O")
            ) {
        Owins(0,4,8);
    }
    if(
            (buttons[2].getText()=="O") &&
            (buttons[4].getText()=="O") &&
            (buttons[6].getText()=="O")
            ) {
        Owins(2,4,6);
    }
}
    
    // creating a method for O wins
    public void Xwins (int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("X wins");
    }

    // creating a method for O wins
        public void Owins(int a,int b,int c) {
            buttons[a].setBackground(Color.GREEN);
            buttons[b].setBackground(Color.GREEN);
            buttons[c].setBackground(Color.GREEN);
            
            for(int i=0;i<9;i++) {
                buttons[i].setEnabled(false);
            }
            textfield.setText("O wins");
    }
}
