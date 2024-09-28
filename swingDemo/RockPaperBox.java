package swingDemo;

import javax.swing.*;
import java.awt.*;

public class RockPaperBox extends JFrame {

    public static void main(String[] args) {
        // components using in the frame
        JFrame frame = new JFrame();

        // Panel 1 for the introduction
        JPanel panel1 =  new JPanel();

        // TextField for the Title
        JLabel Intro = new JLabel();

        //customizing the textfield
        Intro.setText("Welcome to the Rock-Paper-Scissor");
        Intro.setBackground(Color.yellow);
        Intro.setHorizontalAlignment(JLabel.CENTER);
        Intro.setLayout(new BorderLayout());
        Intro.setOpaque(true);

        frame.add(Intro);

        // Panel 2 for the Buttons
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        JLabel computerGesture = new JLabel("Make a Choice User");

        // Image icons for buttons
        ImageIcon rockIcon =  new ImageIcon("C:\\Coding\\VS studio\\Java\\swingDemo\\fist.png");
        ImageIcon paperIcon =  new ImageIcon("C:\\Coding\\VS studio\\Java\\swingDemo\\palm.png");
        ImageIcon scissorIcon =  new ImageIcon("C:\\Coding\\VS studio\\Java\\swingDemo\\scissor.png");

        // Button
        JButton rockButton =  new JButton((rockIcon));
        JButton paperButton =  new JButton((paperIcon));
        JButton scissorButton =  new JButton((scissorIcon));

        panel2.add(computerGesture);

        panel2.add(rockButton);
        panel2.add(paperButton);
        panel2.add(scissorButton);

        frame.add(panel2);

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
