package swingGUI.JoptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        
        // JOptionPane : pop up a standard dialog box that prompts users for 
        //               a value or informs them of something

        // SHOW MESSAGE DIALOG

        // Plain Message 
        // JOptionPane.showMessageDialog(null, "Hy master Umar ","Message from servant", JOptionPane.PLAIN_MESSAGE);
        
        // Infromation Message 
        // JOptionPane.showMessageDialog(null, "I am your Servant ","Message from servant", JOptionPane.INFORMATION_MESSAGE);
        
        // Question Message
        // JOptionPane.showMessageDialog(null, "Are you Really Umar? ","Message from servant", JOptionPane.QUESTION_MESSAGE);
        
        // Waning message
        // JOptionPane.showMessageDialog(null, "Security Has Been Breached ","Message from servant", JOptionPane.WARNING_MESSAGE);
        
        // Error message
        // JOptionPane.showMessageDialog(null, "Error 404 : Master Not Found ","Message from servant", JOptionPane.ERROR_MESSAGE);


        //  SHOW CONFIRM DIALOG BOX
        // JOptionPane.showConfirmDialog(null, "Are you Master Umar ??", "Master Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);


        // SHOW INPUT DIALOG BOX
        // String name =JOptionPane.showInputDialog(null, "What is your name User?");

        // System.out.println(name);


        // SHOW OPTION DIALOGBOX
        // ImageIcon onepiece =  new ImageIcon("BroCode\\MATERIAL PACK\\OnePieceLogo.jpeg");
        // JOptionPane.showOptionDialog(null, "Are you one piece fan ?", "Anime Fan", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, onepiece, null, 0);

        //Creating Our own Options
        String[] responses = {"One piece", "Naruto", "Bleach"};
        ImageIcon code_gease = new ImageIcon("BroCode\\MATERIAL PACK\\CGLogo.jpeg");
        JOptionPane.showOptionDialog(null, "Favourite Anime from Big 3 ??", "ANIME QUEST", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, code_gease, responses,0);

    }
}
