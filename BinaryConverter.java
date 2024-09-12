import java.util.Scanner;

//Title: Quest 2.1 - Programming: Decimal to Binary Calculator
//Author: Tangonan, Kent Alfred T.
//Class/Section: CC1 1B-B
/*Instructions: Create a program that converts decimal numbers to binary numbers. Document your output.

The program should have the following features:

The program asks for a user input of decimal numbers.
The program will keep on asking for a new input every after a successful conversion.
The program will only terminate one the user inputs "STOP".
Test the following test inputs:
Valid Inputs:

Input	Output
5	101
10	1010
20	10100
48	110000
91	1011011 */

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Scanner is Created!");
	    System.out.println("Conversion is Started!");
        while (true) {
            // Prompt the user for input
            System.out.print("Please enter a decimal number (or type 'STOP' to end): ");
            String userInput = scanner.nextLine();
            
            // Check if the user wants to stop the program
            if (userInput.equalsIgnoreCase("STOP")) {
                System.out.println("Program terminated.");
                break;
            }
            
            try {
                // Parse the input as an integer
                int decimalNumber = Integer.parseInt(userInput);
                
                // Convert the decimal number to binary
                String BINARYNUMBER = Integer.toBinaryString(decimalNumber);
                
                // Display the result
                System.out.println("Decimal: " + decimalNumber + " -> Binary: " + BINARYNUMBER);
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Invalid input, please enter a valid decimal number.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
