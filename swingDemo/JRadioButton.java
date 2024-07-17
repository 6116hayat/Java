package swingDemo;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JRadioButton {
    
    /*
     * Introduction of the Program 
     * We will use JRadio Button for this 
     * JRadio Helps in Java GUI for choosing one options from multiple options 
     */

    public static void main(String[] args) {
        RadioDemo r = new RadioDemo();
    }

}
class RadioDemo extends JFrame{

    // Components we need 
    JTextField t1;
    JButton b;
    JRadioButton r1;
    JRadioButton r2;
    JLabel l ;

    public  RadioDemo(){

        //Initialising the Components
        t1 = new JTextField(15);
        b = new JButton("Okay");
        r1 = new JRadioButton();
        r2 = new JRadioButton();
        l = new JLabel("Greeting");

        // Adding all the components
        add(t1);
        add(b);
        // add(r1);
        // add(r2);
        add(l);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            }
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
