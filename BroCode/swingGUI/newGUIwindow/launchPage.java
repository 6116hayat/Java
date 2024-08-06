package swingGUI.newGUIwindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class launchPage implements ActionListener {

    //Creating frame
    JFrame frame =  new JFrame();
    JButton button1 = new JButton("SURPRISE");
    
    launchPage(){

        //Creating button
        button1.setBounds(100, 160, 200, 40);
        button1.setFocusable(true);
        button1.addActionListener(this);

        //adding button

        frame.add(button1);

        //setting frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e){

        if (e.getSource() == button1) {
            frame.dispose();
            newWindow myWindow = new newWindow();
        }
    }
}
