/**
 * This is a Main class. It creates main frame and calls relevant claseses.
 */
import javax.swing.*;
public class Main 
{
    public static void main(String[] args)
    {
        JFrame menuFrame = new Menu();
        menuFrame.setTitle("Pills on Wheels");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setVisible(true);
    }
}