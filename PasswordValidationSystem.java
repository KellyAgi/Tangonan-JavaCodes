/** 
 * Title: Challenge in CC2 
 * Author: Tangonan, Kent Alfred T.
 * Date: October 15, 2024
 * Time: 23:21
 * Location: Philippines
 */

import java.util.Scanner;

public class PasswordValidationSystem {
    
    // Function to check if the password meets the criteria
    public static String isValidPassword(String password) {
        // Check if password is at least 8 characters long
        if (password.length() < 8) {
            return "Password must be at least 8 characters long.";
        }
        
        // Check if password contains at least one number
        if (!password.matches(".*\\d.*")) {
            return "Password must contain at least one number.";
        }
        
        // Check if password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return "Password must contain at least one uppercase letter.";
        }
        
        // If all conditions are met
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            
            // Validate the password
            String validationMessage = isValidPassword(password);
            
            if (validationMessage == null) {
                System.out.println("Your password is valid!");
                break;
            } else {
                System.out.println(validationMessage);
            }
        }
        
        scanner.close();
    }
}
