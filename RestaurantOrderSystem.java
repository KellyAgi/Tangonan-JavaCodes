/** Title: Challenge in CC2 
* Author: Tangonan, Kent Alfred T.
* Date: September 22, 2024
* Time: 23:21
* Location: Philippines
*/
import java.util.Scanner; 

public class RestaurantOrderSystem {
    public static void main(String[] args) {
      Scanner order = new Scanner(System.in);
      // Declaration
      int choice, quantity, totalAmount = 0;
      
      // Menu lists
      System.out.println("MENU");
      System.out.println("1. Burger    - PHP 100");
      System.out.println("2. Fries     - PHP 50");
      System.out.println("3. Soda      - PHP 30");
      System.out.println("4. Ice Cream - PHP 45");
      System.out.println("5. Exit");
      
      System.out.print("Enter the menu number of your choice: ");
      choice = order.nextInt();
      
      // Switch
      switch (choice){
          case 1:
              System.out.print("Enter the quantity: ");
              quantity = order.nextInt();
              totalAmount = 100 * quantity;
              System.out.println("You ordered Burger.");
              System.out.println("Total amount: " + totalAmount + " PHP");
              break;
          case 2:
              System.out.print("Enter the quantity: ");
              quantity = order.nextInt();
              totalAmount = 50 * quantity;
              System.out.println("You ordered Fries.");
              System.out.println("Total amount: " + totalAmount + " PHP");
              break;
          case 3:
              System.out.print("Enter the quantity: ");
              quantity = order.nextInt();
              totalAmount = 30 * quantity;
              System.out.println("You ordered Soda.");
              System.out.println("Total amount: " + totalAmount + " PHP");
              break;
          case 4:
              System.out.print("Enter the quantity: ");
              quantity = order.nextInt();
              totalAmount = 45 * quantity;
              System.out.println("You ordered Ice Cream.");
              System.out.println("Total amount: " + totalAmount + " PHP");
              break;
          case 5:
              System.out.println("Exit");
              break;  
          default:
              System.out.println("Invalid choice. Please choose again.");
              break;
      }
      // Close the scanner
      order.close();
    }
    
}
