package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Add2Nums{
    public static void main(String[] args) {
        
        // Adding a new object
        Addition obj = new Addition();  
    }
}
class Addition extends JFrame implements ActionListener{

    // Defining the data to increase the scope
    JTextField t1,t2;
    JButton b;
    JLabel l ;

    public Addition() {

        // Adding the text field
        t1 = new JTextField(20);
        t2 = new JTextField(20);

        // Adding the event 
        b = new JButton("Okay");

        // Adding the head 
        l = new JLabel("Result");

        // Adding the component
        add(t1);
        add(t2);
        add(b);
        add(l);

        // Adding the Action Listener
        b.addActionListener(this);// ActionListener is an Interface

        // Setting the layout (flowLayout, GridLayout, Null)
        setLayout(new FlowLayout());

        // Showing the Dialog box
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This is the closing frame command
    
    }
    public void actionPerformed(ActionEvent ae){
        // This field stores Data and used for calculation

        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int value = num1 + num2;

        // setting text
        l.setText(value + "");
    }
}