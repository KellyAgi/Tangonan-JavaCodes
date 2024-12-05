/* Title: How to use expressions.
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 11, 2024
* Time: 22:04
*/
import javax.swing.JOptionPane;
public class GuiProgram {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name? ");
        JOptionPane.showMessageDialog(null, "Hi " +name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age? "));
        JOptionPane.showMessageDialog(null, "You are " +age+" years old");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height? "));
        JOptionPane.showMessageDialog(null, "You are " +height+" cm tall");
        
    }
    
}
