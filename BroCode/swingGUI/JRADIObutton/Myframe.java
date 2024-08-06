package swingGUI.JRADIObutton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Myframe extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton momosButton;
    JRadioButton cold_DrinkButton;
    
    Myframe(){ 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //creating a radio Button
        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        momosButton = new JRadioButton("momos");
        cold_DrinkButton = new JRadioButton("cold_Drink");

        //creating a button group
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(momosButton);
        group.add(cold_DrinkButton);

        //adding component
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(momosButton);
        this.add(cold_DrinkButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("you ordered PIZZA");
        }
        else if (e.getSource() == hamburgerButton) {
            System.out.println("you ordered HAMBURGER");
        }
        else if (e.getSource() == momosButton){
            System.out.println("you ordered MOMOS");
        }
        else if(e.getSource() == cold_DrinkButton){
            System.out.println("you ordered COLD DRINK");
        }
        
    }

}
