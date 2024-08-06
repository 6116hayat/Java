package swingGUI.labels;

import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;

import swingGUI.Frame.Jframe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {

        // adding an image icon
        ImageIcon image = new ImageIcon("BroCode\\swingGUI\\labels\\hitman logo.jpg");

        //creating a border
        Border border = BorderFactory.createLineBorder(Color.BLUE,5);
        

        JLabel label = new JLabel();
        label.setText("HITMAN: AGENT 47" ); // set text of label
        label.setIcon(image);

        //setting the text position
        label.setHorizontalTextPosition(JLabel.CENTER); // options: text LEFT, CENTER, RIGHT og imageIcon
        label.setVerticalTextPosition(JLabel.TOP);// options:  set Text TOP, CENTER, BOTTOM of imageIcon

        //changing text - font & color
        label.setForeground(new Color(50,60,100));
        label.setFont(new Font("MV Boli", Font.PLAIN,40));

        //Icon Text Gap
        label.setIconTextGap(-05); // 

        // Background Color
        label.setBackground(Color.black);
        label.setOpaque(true); // this shows background color

        // label for border
        label.setBorder(border);

        //changing the image and text allignment within label
        label.setVerticalAlignment(JLabel.CENTER); 
        label.setHorizontalAlignment(JLabel.CENTER); // setting horizontal position

        //label for setting bounds
        // label.setBounds(100,100, 600,600); // sets position for x, y within frame as well as dimension

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame layout
        // frame.setLayout(null);

        frame.setSize(600,600);
        frame.setVisible(true);
        frame.add(label);

        frame.pack();




        
        // MyFrame myFrame = new MyFrame();
    }
}
