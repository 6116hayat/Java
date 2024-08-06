package swingGUI.JLayeredPane;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class main {
    public static void main(String[] args) {
        
        // JLayeredPane : swing container that provides a 3D dimension for 
        //                z positioning 
        //                example - depth, index

        // creating Labels for program
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.ORANGE);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.YELLOW);
        label3.setBounds(150,150,200,200);

        //creating an instances
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        // adding labels
        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(1));
        layeredPane.add(label3, Integer.valueOf(2));

        //BASIC CODE for frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adding components
        frame.add(layeredPane);


        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
