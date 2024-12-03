/* Title: Final Challenge No. 5: Exception Handling Laboratory Challenges
 * Name: Tangonan, Kent Alfred Tarlit
 * Date: December 3, 2024
 * Time: 22:50
 */
import javax.swing.*;

// InsufficientFundsException.java
// Custom exception class to handle cases of insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message); // Pass the error message to the parent Exception class
    }
}

// BankAccount.java
// Class to represent a bank account with balance and withdrawal functionality
class BankAccount {
    private double balance; // Balance of the bank account

    // Constructor to initialize the bank account with an initial balance
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative."); // Throw exception if initial balance is negative
        }
        this.balance = initialBalance; // Set the initial balance
    }

    // Method to withdraw an amount from the bank account
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount exceeds current balance."); // If withdrawal exceeds balance, throw exception
        }
        balance -= amount; // Deduct the withdrawal amount from balance
        JOptionPane.showMessageDialog(null, String.format("Successfully withdrew $%.2f. New balance: $%.2f", amount, balance)); // Show success message
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Main.java
public class BankingSystem {
    public static void main(String[] args) {
        // Initialize the initial balance with an invalid value (negative)
        double initialBalance = -1;
        
        // Loop until the user enters a valid initial balance
        while (initialBalance < 0) {
            // Ask the user to input the initial balance using a dialog box
            String input = JOptionPane.showInputDialog("Enter initial balance for your account: $");

            try {
                initialBalance = Double.parseDouble(input); // Try to convert the input to a double
                if (initialBalance < 0) {
                    JOptionPane.showMessageDialog(null, "Initial balance cannot be negative. Please enter a valid amount."); // Show error if negative
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid number for the initial balance."); // Show error if input is not a number
            }
        }

        // Create a new BankAccount object with the valid initial balance
        BankAccount account = new BankAccount(initialBalance);

        // Continue allowing withdrawals until the user decides to exit
        while (true) {
            // Ask the user to input the withdrawal amount
            String input = JOptionPane.showInputDialog("Enter amount to withdraw (or type 'exit' to quit): $");

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                break; // Exit the loop
            }

            try {
                // Try to parse the withdrawal amount from the input
                double amountToWithdraw = Double.parseDouble(input);
                account.withdraw(amountToWithdraw); // Attempt to withdraw the amount
            } catch (InsufficientFundsException | NumberFormatException e) {
                // If an exception occurs, handle it by showing an error message
                // This block handles both insufficient funds and invalid number input
                JOptionPane.showMessageDialog(null, "Error: " + (e instanceof InsufficientFundsException
                    ? e.getMessage() // Show the message from the InsufficientFundsException
                    : "Please enter a valid number for the withdrawal amount.")); // Handle invalid input
            }
        }

        // Show the final balance when the user exits the loop
        JOptionPane.showMessageDialog(null, String.format("Final balance: $%.2f", account.getBalance()));
    }
}
