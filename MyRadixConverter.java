import java.util.Scanner;

//Author: Tangonan, Kent Alfred
//Section: CC1-1B
//Date: September 16, 2024
//Title: Programming: Radix Converter

public class MyRadixConverter {

	public static void main(String[] args) {
		Scanner myRadixConversion = new Scanner(System.in);

		while (true) {
		System.out.print("Enter the origin number system (2-16): ");
		int originBase = myRadixConversion.nextInt();
		/*If you type the Origin Base that is less than 2 and greater than 16, you will get invalid display output. You should type the Origin Base between 2 and 16.*/
		if (originBase < 2 || originBase > 16) {
		System.out.println("Invalid origin number system. Please enter a number between 2 and 16.");
				continue;
			}
		/**If you type 2 in base, you should only type{0, 1}*/
		//Example, 110110 for binary(2)
		System.out.print("Enter the number: ");
		String number = myRadixConversion.next();

		System.out.println("Converted numbers:");
		for (int targetBase = 2; targetBase <= 16; targetBase++) {
		String convertedNumber = convertBase(number, originBase, targetBase);
		System.out.println("Base " + targetBase + ": " + convertedNumber);
			}
		//The program will terminated if you type STOP.
		System.out.print("Enter 'STOP' to exit, or any other input to continue: ");
		String input = myRadixConversion.next();
		if (input.equalsIgnoreCase("STOP")) {
				break;
			}
		}

		myRadixConversion.close();
	}

		private static String convertBase(String number, int originBase, int targetBase) {
		int decimalValue = Integer.parseInt(number, originBase);
		return Integer.toString(decimalValue, targetBase);
	}
}
