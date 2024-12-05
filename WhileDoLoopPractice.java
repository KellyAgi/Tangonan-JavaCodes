/* Title: How to use while and do loop.
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 12, 2024
* Time: 00:00
*/
import java.util.Scanner;
public class WhileDoLoopPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Using while is to loop unlimited.
        String name;
        name = " ";
        
       do{
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }while(name.isBlank());
        System.out.println("Hello "+name);
    }
    
}
