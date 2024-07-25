package swingGUI.Frame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe {
    
    public static void main(String[] args) {
        
        // JFrame = a GUI window to add components 

        JFrame frame = new JFrame(); // creates a frame 

        frame.setTitle("Hayat-Frame");
        frame.setSize(600,600); // sets Size 
        frame.setResizable(false);// prevent frame to resize
        frame.setVisible(true);// make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application

        ImageIcon image =  new ImageIcon("C:/Coding/VS studio/Java/BroCode/swingGUI/logo.jpg"); // create jan ImaageIcon 
        frame.setIconImage(image.getImage()); // change Icon frame

        frame.getContentPane().setBackground(new Color(100,50,150)); // change background color
        
        
    }
}
