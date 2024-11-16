/* Title: Final Challenge No. 1: Retail Store Inventory Management (1D array)
* Name: Tangonan, Kent Alfred Tarlit
* Date: November 16, 2024
* Time: 00:53
*/
import javax.swing.JOptionPane;
public class RetailStoreInventoryManagement {

    public static void main(String[] args) {
        // I will be using JOptionPane to make my code better
        int sizeOfAnArray;
        double totalValueOfProducts = 0;
        
        // Get the number of products
        sizeOfAnArray = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Enter the number of products:","Number of Products to be Input",JOptionPane.INFORMATION_MESSAGE));
        
        // 1 Dimension Array
        int stockLevels[] = new int[sizeOfAnArray];
        double prices[] = new double[sizeOfAnArray];
        
        JOptionPane.showMessageDialog(null, "ENTER THE STOCK LEVELS FOR " + sizeOfAnArray + " PRODUCTS ","Stock Levels",JOptionPane.INFORMATION_MESSAGE);
        // Get the Product stock levels using 1 dimensional array
        for(int i=0; i<sizeOfAnArray; i++){
            stockLevels[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Enter the product "+(i+1)+" stock level: ", "Product Stock Levels", JOptionPane.QUESTION_MESSAGE));
        } 
        JOptionPane.showMessageDialog(null, "ENTER THE PRICE FOR " + sizeOfAnArray + " PRODUCTS ");
        // Get the product prices using 1 dimensional array
        for(int j=0; j<sizeOfAnArray; j++){
            prices[j] = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Enter the price of "+(j+1)+" product: ","Product Prices", JOptionPane.QUESTION_MESSAGE));
        }
        // Formula 
        for (int index = 0; index < sizeOfAnArray; index++) {
            totalValueOfProducts += stockLevels[index] * prices[index];
        }
        // Display the total amounts of products
        JOptionPane.showMessageDialog(
                null, "The total value of all items in stock is: PHP " + totalValueOfProducts,"Total Value of All Products",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
