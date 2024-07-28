package swingGUI.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
    
    //declaring components
    JButton button;
    JLabel label;

    MyFrame(){

        // setting an icon
        ImageIcon icon = new ImageIcon("BroCode\\swingGUI\\Frame\\logo.jpg");
        ImageIcon icon2 = new ImageIcon("BroCode\\MATERIAL PACK\\NarutoLogo.jpeg");

        // creating an Label
        label = new JLabel();

        // customizing label
        // label.setText("LABEL");
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        //creating button
        button = new JButton();
        button.setBounds(100,100,250,100); // setting size of button

        //adding action listener to the button
        button.addActionListener(this);

        // lambda expression
        // button.addActionListener(e -> System.out.println("Hi!!"))

        // Customizing the button
        button.setText("Button!!"); // set text to button
        button.setFocusable(false); 
        button.setIcon(icon); // adding icon

        //changing button text position
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);

        //chaning button font and font color
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setForeground(Color.RED);

        //changing TextGap
        button.setIconTextGap(10);

        //changing background color and setting border
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        //button disabled
        // button.setEnabled(false);

        // Basic code for frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        // adding the components
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button ) {
            System.out.println("HI!! You Just clicked the button");
            label.setVisible(true);
        }
    }
}
