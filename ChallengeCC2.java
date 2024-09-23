// Title: Challenge in CC2 
// Author: Tangonan, Kent Alfred T.
// Date: September 22, 2024
// Time: 23:21
// Location: Philippines

import java.util.Scanner;

public class ChallengeCC2 {

    public static void main(String[] args) {
        Scanner labChallenge = new Scanner(System.in);
        // Declaration
        int fNum;
        int sNum;

        // Get the first number.
        System.out.print("Enter the First Number: ");
        fNum = labChallenge.nextInt();

        // Get the second number.
        System.out.print("Enter the Second Number: ");
        sNum = labChallenge.nextInt();

        // Declaration
        char dot;
        // Assignment
        dot = '.';

        // Declaration
        int sum;
        int difference;
        int product;
        int quotient;
        int remainder;

        // Formula 
        sum = fNum + sNum;
        difference = fNum - sNum;
        product = fNum * sNum;
        quotient = fNum / sNum;
        remainder = fNum % sNum;

        // Print and display the output.
        System.out.println("The sum of " + fNum + " and " + sNum + " is " + sum + dot);
        System.out.println("The difference of " + fNum + " and " + sNum + " is " + difference + dot);
        System.out.println("The product of " + fNum + " and " + sNum + " is " + product + dot);
        System.out.println("The quotient of " + fNum + " and " + sNum + " is " + quotient + dot);
        System.out.println("The remainder of " + fNum + " and " + sNum + " is " + remainder + dot);
    }
    
}
