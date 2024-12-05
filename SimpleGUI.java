/* Title: SimpleGUI
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 12, 2024
* Time: 00:53
*/
import javax.swing.JOptionPane;
public class SimpleGUI {

    public static void main(String[] args) {
         String name= JOptionPane.showInputDialog(null, "Enter your name:");
         JOptionPane.showMessageDialog(null, name);

         int birthYear= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your year of birth: "));
         JOptionPane.showMessageDialog(null, birthYear);

         int currentYear = 2024;

         int age = currentYear - birthYear;
         
         JOptionPane.showMessageDialog(null, "Hello " + name  + ",  you are " +  age + " years old.");
         
    }
    
}
