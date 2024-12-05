/* Title: How to swap variables.
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 11, 2024
* Time: 21:26
*/
import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) {
        Scanner myUserInput = new Scanner(System.in);
        String name, food;
        int age;
        
        System.out.println("What is your name? ");
        name = myUserInput.nextLine();
        
        System.out.println("What is your favorate food? ");
        food = myUserInput.nextLine();
        
        System.out.println("What is your age? ");
        age = myUserInput.nextInt();
        
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your favorate food is: " + food);
    }
    
}
