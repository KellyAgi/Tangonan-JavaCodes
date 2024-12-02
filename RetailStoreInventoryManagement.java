/* Title: Final Challenge No. 1: Retail Store Inventory Management (1D array)
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 12, 2024
* Time: 00:53
*/
import javax.swing.JOptionPane;
public class RetailStoreInventoryManagement {

    public static void main(String[] args) {
        int sizeOfAnArray;
        double totalValueOfProducts = 0;
        
        sizeOfAnArray = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Enter the number of products:","Number of Products",JOptionPane.INFORMATION_MESSAGE));
        
        int stockLevels[] = new int[sizeOfAnArray];
        double prices[] = new double[sizeOfAnArray];
        
        JOptionPane.showMessageDialog(null, "ENTER THE STOCK LEVELS FOR " + sizeOfAnArray + " PRODUCTS ","Stock Levels",JOptionPane.INFORMATION_MESSAGE);
        for(int i=0; i<sizeOfAnArray; i++){
            stockLevels[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Enter the product "+(i+1)+" stock level: ", "Product Stock Levels", JOptionPane.QUESTION_MESSAGE));
        } 
        JOptionPane.showMessageDialog(null, "ENTER THE PRICE FOR " + sizeOfAnArray + " PRODUCTS ");
        for(int j=0; j<sizeOfAnArray; j++){
            prices[j] = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Enter the price of "+(j+1)+" product: ","Product Prices", JOptionPane.QUESTION_MESSAGE));
        }
        for (int index = 0; index < sizeOfAnArray; index++) {
            totalValueOfProducts += stockLevels[index] * prices[index];
        }
        JOptionPane.showMessageDialog(
                null, "The total value of all items in stock is: PHP " + totalValueOfProducts,"Total Value of All Products",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
