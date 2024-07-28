package swingGUI.Panels;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class main {
    public static void main(String[] args) {
        
        // JPanel = a GUI component that functions as a container to hold other commponents

        //creating label
        JLabel label = new JLabel();
        label.setText("Yo");

        JPanel pink_panel = new JPanel();
        pink_panel.setBackground(Color.PINK);
        pink_panel.setBounds(0,0,250,250);

        //creating another panel
        JPanel red_panel = new JPanel();
        red_panel.setBackground(Color.RED);
        red_panel.setBounds(250,0,250,250);

        //creating another panel
        JPanel orange_panel = new JPanel();
        orange_panel.setBackground(Color.ORANGE);
        orange_panel.setBounds(0,250,500,250);


        //Basic Code 
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);

        //adding labels to panels
        pink_panel.add(label);

        // adding commponent
        frame.add(pink_panel);
        frame.add(red_panel);
        frame.add(orange_panel);

    }

}
