/** Title: Challenge in CC2 
* Author: Tangonan, Kent Alfred T.
* Date: September 22, 2024
* Time: 23:21
* Location: Philippines
*/
import java.util.Scanner; 

public class GroceryStoreIfElse {
    public static void main(String[] args) {
        //Declaration
        Scanner groceryStore = new Scanner(System.in);
        double totalAmount,finalPrice;
        double discount = 0;
        
        System.out.print("Enter the total purchase amount: PHP ");
        totalAmount = groceryStore.nextInt();
        
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
        finalPrice = totalAmount - (totalAmount * discount);
        
        System.out.println("Discount applied: " + (int)(discount * 100) + "%" );
        System.out.println("Final price after discount: PHP " + (int)finalPrice );
        
        groceryStore.close();
    }
        
}
