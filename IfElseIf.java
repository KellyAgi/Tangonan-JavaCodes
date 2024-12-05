/* Title: How to find hypotenuse.
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 11, 2024
* Time: 23:06
*/
import java.util.Scanner;
public class IfElseIf {

    public static void main(String[] args) {
        Scanner conditions = new Scanner(System.in);
        int age;
        
        System.out.println("What is your age? ");
        age = conditions.nextInt();
        
        if (age>=18 && age<=74){
            System.out.println("You are an adult!");
        } else if(age>=75){
            System.out.println("You are a boomer!");
        } else {
            System.out.println("You are a minor!");
        }
       
    }
    
}
