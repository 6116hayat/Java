package swingGUI.FlowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main {
    
    public static void main(String[] args) {
        
        // Layout manager : DEfines natural layout for components within a container

        // FlowLayout : places components in a row,  sized at their preffered size
        //              If the horizontal space in the container is too small,
        //              the flowLayout class uses the next available row

        // Basic Code for Frame
        JFrame frame = new JFrame();
        // frame.setVisible(true);

        // flowLayout Options
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // FlowLayout Options : CENTER, LEFT, RIGHT, TRAILING, LEADING (spacing 0, 0)


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        // Creating components
        JButton button1 = new JButton();

        // Creating Panels
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout()); // setting layout for panel

        // Shortcuts 
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));


        // adding components
        // frame.add(button1);
        frame.add(panel);


        frame.setVisible(true);
    }
}
