/* Title: /* Title: Final Challenge No. 3: University Course Enrollment and Grades Tracker (1D and 2D arrays)
 * Name: Tangonan, Kent Alfred Tarlit
 * Date: November 16, 2024
 * Time: 19:47
 */
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = 0.0;

        // Use a single try block to catch input-related errors
        try {
            // Initial deposit setup
            System.out.print("Enter initial deposit amount: $");
            currentBalance = scanner.nextDouble();

            boolean systemRunning = true;
            while (systemRunning) {
                // Display menu options
                System.out.println("\nMenu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1-4): ");
                int userChoice = scanner.nextInt();

                switch (userChoice) {
                    case 1:
                        // Check balance
                        System.out.println("Current Balance: $" + currentBalance);
                        break;

                    case 2:
                        // Deposit money
                        System.out.print("Enter deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount > 0) {
                            currentBalance += depositAmount;
                            System.out.println("Deposited: $" + depositAmount);
                        } else {
                            System.out.println("Deposit amount must be positive.");
                        }
                        break;

                    case 3:
                        // Withdraw money
                        System.out.print("Enter withdrawal amount: $");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > 0) {
                            if (withdrawAmount <= currentBalance) {
                                currentBalance -= withdrawAmount;
                                System.out.println("Withdrew: $" + withdrawAmount);
                            } else {
                                System.out.println("Insufficient funds to withdraw $" + withdrawAmount);
                            }
                        } else {
                            System.out.println("Withdrawal amount must be positive.");
                        }
                        break;

                    case 4:
                        // Exit program
                        System.out.println("Thank you for using the banking system.");
                        systemRunning = false;
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }

        } catch (java.util.InputMismatchException e) {
            // Catching invalid input (like non-numeric values) for both deposit/withdrawal and menu choice
            System.out.println("Invalid input! Please enter a numeric value.");
        } catch (Exception e) {
            // Catching any other unexpected errors
            System.out.println("An unexpected error occurred. Please try again.");
        } finally {
            scanner.close();
        }
    }
}
