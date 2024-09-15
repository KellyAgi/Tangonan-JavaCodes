import java.util.Scanner;

//Title: Basic Scanner 
//Author: Tangonan, Kent Alfred T.
//Date: September 15, 2024
/* This is my first practice of Scanner code in Java programming */

public class BasicBinaryConverter{
      public static void main(String[] args) {

        Scanner myDecimalToBinary= new     Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber= myDecimalToBinary.nextInt();
        
        String binaryNumber=Integer.toBinaryString(decimalNumber);

         System.out.print("The Binary is: " +binaryNumber);
        }
}