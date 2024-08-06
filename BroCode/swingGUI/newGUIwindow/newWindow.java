package swingGUI.newGUIwindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class newWindow {
    
    // Creating Frame
    JFrame frame = new JFrame();
    JLabel label = new JLabel("MFS..");

    newWindow(){

        //creating label
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN,25));

        //adding components
        frame.add(label);

        // Frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
