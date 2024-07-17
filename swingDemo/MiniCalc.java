package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiniCalc {
    
    // calling the main method
    public static void main(String[] args) {
        AddSub obj = new AddSub();
    }
    
}

class AddSub extends JFrame implements ActionListener{

    // Menitioning all the components to be used
    JTextField t1, t2;
    JButton b1, b2;
    JLabel l ;
    
    public AddSub(){
        // Intialising all the components
        t1 =  new JTextField(15);
        t2 =  new JTextField(15);
        b1 = new JButton("ADD");
        b2 = new JButton("MINUS");
        l = new JLabel("Result");

        // Adding all the components to the box
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);

        //adding Listener
        b1.addActionListener(this);
        b2.addActionListener(this);

        //Dialog Box Layout
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae){

        // Calculation
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText()); 

        //Logic for Addition and Subtraction
        int value = 0;

        if(ae.getSource() == b1){  // getSource method helps us to identify the number pressed
            value = num1 + num2;
        }else{
            value = num1 - num2;
        }

        // setting text
        l.setText(value + "");
    }
}
