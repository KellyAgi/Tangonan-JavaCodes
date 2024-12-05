/* Title: AdditionCalculator 
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 12, 2024
* Time: 00:53
*/
import javax.swing.JOptionPane;
public class SimpleGUI2 {

    public static void main(String[] args) {
         int firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number:", "Input", JOptionPane.QUESTION_MESSAGE));
         JOptionPane.showMessageDialog(null,"The first input number is " + firstNumber);

         int secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number:", "Input", JOptionPane.QUESTION_MESSAGE));
         JOptionPane.showMessageDialog(null,"The second input number is " +secondNumber);
         
         int num1 = firstNumber;
         int num2 = secondNumber;
         int sum = num1 + num2;
         
         JOptionPane.showMessageDialog(null, "The sum of "+firstNumber+ " and "+secondNumber+ " is "+ sum, "Result",JOptionPane.INFORMATION_MESSAGE); 
 }
    
}
