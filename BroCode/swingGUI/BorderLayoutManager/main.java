package swingGUI.BorderLayoutManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class main {
    
    public static void main(String[] args) {
        
        // Layout Manager : Defines the natural layout for components within a container

        // 3 common managers

        // Borderlayout : A BorderLayout places components in five areas :
        //                  North, South, West, east, Center
        //                All Exrtra space is placed in the center area

        int width_margin = 10;
        int height_margin = 10;

        // Basic code 
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10)); // setting margins for layout
        frame.setSize(500,500);
        frame.setVisible(true);

        //Creating Jpanel 
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // Assigning color to the panel
        panel1.setBackground(Color.YELLOW);
        panel2.setBackground(Color.RED);
        panel3.setBackground(Color.PINK);
        panel4.setBackground(Color.GREEN);
        panel5.setBackground(Color.BLUE);

        //Selecting Size
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        //adding the frame Border Layout
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);



    }

}
