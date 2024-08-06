package swingGUI.labels;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    
    MyFrame(){

        // JFrame = a GUI window to add components 

        this.setTitle("Hayat-Frame");
        this.setSize(600,600); // sets Size 
        this.setResizable(false);// prevent frame to resize
        this.setVisible(true);// make frame visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application

        ImageIcon image =  new ImageIcon("C:/Coding/VS studio/Java/BroCode/swingGUI/logo.jpg"); // create an ImageIcon 
        this.setIconImage(image.getImage()); // change Icon frame

        this.getContentPane().setBackground(new Color(100,50,0)); // change background color
        
        
    }
}
    

