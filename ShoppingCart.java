/* Title: Final Challenge No. 5: Exception Handling Laboratory Challenges
 * Name: Tangonan, Kent Alfred Tarlit
 * Date: December 3, 2024
 * Time: 22:50
 */
import javax.swing.JOptionPane;

// Custom exception class to handle invalid product quantity input
class InvalidQuantityException extends Exception {
    // Constructor that takes a message for the exception
    public InvalidQuantityException(String message) {
        super(message);  // Pass the message to the superclass (Exception)
    }
}

public class ShoppingCart {
    private static final int AVAILABLE_STOCK = 100; // Example stock quantity (constant)

    public static void main(String[] args) {
        // Start an infinite loop to keep prompting the user for valid input
        while (true) {
            // Prompt the user to enter the quantity of the product they wish to purchase using JOptionPane
            String input = JOptionPane.showInputDialog("Enter the quantity of the product you want to purchase:");

            // Check if input is null (user clicked cancel) or empty
            if (input == null || input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No input provided. Exiting the program.", "Error", JOptionPane.ERROR_MESSAGE);
                return;  // Exit the program if user clicked "Cancel" or provided no input
            }

            try {
                // Parse the input to an integer
                int quantity = Integer.parseInt(input);
                
                // Validate the entered quantity
                validateQuantity(quantity);
                
                // If quantity is valid, show a success message using JOptionPane
                JOptionPane.showMessageDialog(null, "You have successfully added " + quantity + " items to your cart.");
                break;  // Exit the loop if everything is valid
            } catch (InvalidQuantityException e) {
                // Catch the custom exception and show the error message in a dialog
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                // Catch invalid input (e.g., non-integer input) and show an error message in a dialog
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Method to validate the product quantity entered by the user
    private static void validateQuantity(int quantity) throws InvalidQuantityException {
        // Check if the quantity is negative
        if (quantity < 0) {
            throw new InvalidQuantityException("Quantity cannot be negative.");
        }
        
        // Check if the quantity exceeds the available stock
        if (quantity > AVAILABLE_STOCK) {
            throw new InvalidQuantityException("Quantity exceeds available stock of " + AVAILABLE_STOCK + ".");
        }
    }
}
