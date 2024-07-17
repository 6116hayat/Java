package swingDemo;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.util.concurrent.Flow;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class firstGUI {
    
    public static void main(String[] args) {

        Abc obj = new Abc() ;
    }

}
class Abc extends JFrame{ // CardLayout: Can only see front card, not behind it
    public Abc(){

        // Adding the heading 
        JLabel U = new JLabel("Hello Master, Umar");
        JLabel U1 = new JLabel("How Can I Help");
        add(U);
        add(U1);

        // Setting the layout (flowLayout, GridLayout, Null)
        setLayout(new FlowLayout());

        // Showing the Dialog box
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This is the closing frame command
    }
}

