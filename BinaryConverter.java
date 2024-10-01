import java.util.Scanner;

// Title: Quest 2.1 - Programming: Decimal to Binary Calculator
// Author: Tangonan, Kent Alfred T.
// Class/Section: CC1 1B-B
/* Instructions: Create a program that converts decimal numbers to binary numbers. Document your output.

The program should have the following features:

The program asks for a user input of decimal numbers.
The program will keep on asking for a new input every after a successful conversion.
The program will only terminate one the user inputs "STOP".
Test the following test inputs:
Valid Inputs:

Input    Output
5       0000 0101
10      0000 1010
20      0001 0100
48      0011 0000
91      0101 1011 */

public class BinaryConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
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
                    String binaryNumber = Integer.toBinaryString(decimalNumber);
                    
                    // Format the binary number to be padded to multiples of 4
                    int length = binaryNumber.length();
                    int padding = (4 - (length % 4)) % 4; // Calculate padding needed
                    
                    // Create a padded binary string manually
                    StringBuilder paddedBinary = new StringBuilder();
                    for (int i = 0; i < padding; i++) {
                        paddedBinary.append('0');
                    }
                    paddedBinary.append(binaryNumber);
                    
                    // Split the binary string into groups of 4
                    StringBuilder formattedBinary = new StringBuilder();
                    for (int i = 0; i < paddedBinary.length(); i += 4) {
                        if (i > 0) {
                            formattedBinary.append(" "); // Add space between groups
                        }
                        formattedBinary.append(paddedBinary, i, Math.min(i + 4, paddedBinary.length()));
                    }

                    // Display the result
                    System.out.println("Decimal: " + decimalNumber + " -> Binary: " + formattedBinary);
                } catch (NumberFormatException e) {
                    // Handle invalid input
                    System.out.println("Invalid input, please enter a valid decimal number.");
                }
            }
        }
    }
}
