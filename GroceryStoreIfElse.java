/** Title: Challenge in CC2 
* Author: Tangonan, Kent Alfred T.
* Date: October 15, 2024
* Time: 21:41
* Location: Philippines
*/
import java.util.Scanner; 

public class GroceryStoreIfElse {
    public static void main(String[] args) {
        //Declaration
        Scanner groceryStore = new Scanner(System.in);
        double totalAmount,finalPrice;
        double discount = 0;

        // Get the total amount 
        System.out.print("Enter the total purchase amount: PHP ");
        totalAmount = groceryStore.nextInt();

        // Using if else to get the discount
        if (totalAmount > 10000){
           discount = 0.15;
        } else if (totalAmount >= 5001 && totalAmount <= 10000) {
            discount = 0.10;
        } else if (totalAmount >= 1000 && totalAmount <= 5000) {
            discount = 0.05;
        } else if (totalAmount > 1000) {
        } else {
            discount = 0;
        }
        // Formula for discounted price.
        finalPrice = totalAmount - (totalAmount * discount);

        // Display the discounted price.
        System.out.println("Discount applied: " + (int)(discount * 100) + "%" );
        // Display the final price of an item.
        System.out.println("Final price after discount: PHP " + (int)finalPrice );

        // Close the scanner
        groceryStore.close();
    }
        
}
