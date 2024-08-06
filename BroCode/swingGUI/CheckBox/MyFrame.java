package swingGUI.CheckBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkbox;
    ImageIcon naruto;
    ImageIcon one_piece;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        naruto =  new ImageIcon("BroCode\\MATERIAL PACK\\NarutoLogo.jpeg"); 
        one_piece = new  ImageIcon("BroCode\\MATERIAL PACK\\OnePieceLogo.jpeg");

        button = new JButton("SUBMIT");
        button.addActionListener(this);

        checkbox = new JCheckBox();

        this.add(button);
        this.add(checkbox);
        checkbox.setText("Are You Naruto Fan ?? ");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas",Font.PLAIN,35));

        //changing Icon Image for the Icon
        checkbox.setIcon(naruto);
        checkbox.setSelectedIcon(one_piece);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkbox.isSelected());
            checkbox.setText("You Are one piece Fan!!");
        }
        
    }

    
    

}
