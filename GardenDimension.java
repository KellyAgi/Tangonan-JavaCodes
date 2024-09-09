//Title: Laboratory Challenge No. 2: Calculating the Area and Perimeter of a Rectangle
//Author: Tangonan, Kent Alfred T.
//Section/Subject: CC2 1B-B
//Date: September 09, 2024
//Activity: Calculating the Area and Perimeter of a Rectangle
/*Problem Statement:

You are tasked with helping a construction company estimate the materials needed to build a rectangular garden. The company needs to know the area and perimeter of the garden based on its fixed dimensions. Write a Java program to calculate and display the area and perimeter of the rectangle using predefined values for the length and width.*/
public class GardenDimension {
  public static void main(String[] args) {
  //Given values
   int Area;
   int Perimeter;
   int length;
   length = 7;
   int width;
   width = 13;
   //Formuula for Perimeter and Area.
   	Perimeter= 2 * (length + width);
   	Area = length * width;
   //Display the Output
   	System.out.println("The Length, the Width, the Area, and the Perimeter of the Garden:\n");
   	System.out.println("The Length of the garden is " + length + " meters.");
    System.out.println("The Width of the garden is " + width + " meters.");
   //Display the area of the gaarden.
    System.out.println("Area: " + Area);
   //Display the perimeter pf the garden.
    System.out.println("Perimeter: " + Perimeter );
    
  }
}
