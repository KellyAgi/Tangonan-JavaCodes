// Title: Laboratory Challenge 3: Grocery Shopping Store
// Author: Tangonan, Kent Alfred T.
// Date: September 22, 2024
// Section: CITCS 1B Group B
// Subject: CC2: Introduction to Programming
// Time: 12:17
// Location: Philippines
import java.util.Scanner;

public class Cc2Laboratory3 {

    public static void main(String[] args) {
        Scanner groceryShopping = new Scanner(System.in);
        // Declaration
        double fItem;
        int quantity1;
        double sItem;
        int quantity2;
        double tItem;
        int quantity3;
        
        // Get the price of item 1.
        System.out.print("Enter the price of item 1: ");
        fItem = groceryShopping.nextInt();
        
        // Get the quantity of the item 1.
        System.out.print("Enter the quantity of item 1: ");
        quantity1 = groceryShopping.nextInt();
        
        // Get the price of item 2.
        System.out.print("Enter the price of item 2: ");
        sItem = groceryShopping.nextInt();
        
        // Get the quantity of the item 2.
        System.out.print("Enter the quantity of item 2: ");
        quantity2 = groceryShopping.nextInt();
        
        // Get the price of item 3.
        System.out.print("Enter the price of item 3: ");
        tItem = groceryShopping.nextInt();
        
        // Get the quantity of the item 3.
        System.out.print("Enter the quantity of item 3: ");
        quantity3 = groceryShopping.nextInt();
        
        // Declaration
        double subtotal;
        double discount;
        double salesTax;
        double finalTotal;
        double percentage;
        double taxSales;
        
        // 5% discount
        percentage = 0.05d;
        // 12% discount
        taxSales = 0.12d;
        
        // Formula and assignment
        subtotal = (fItem*quantity1) + (sItem*quantity2) + (tItem*quantity3);
        discount = (percentage*subtotal);
        salesTax = taxSales*(subtotal-discount);
        finalTotal = (subtotal-discount) + salesTax;
        
        // Display the total.
        System.out.printf("\nSubtotal: PHP %.2f", subtotal);
        System.out.printf("\nDiscount: PHP %.2f", discount);
        System.out.printf("\nSales Tax: PHP %.2f",  salesTax);
        System.out.printf("\nFinal Total: PHP %.2f\n", finalTotal);
        
        // Close the scanner
        groceryShopping.close();
    }
    
}
