/* Title: Final Challenge No. 1: Retail Store Inventory Management (1D array)
 * Name: Tangonan, Kent Alfred Tarlit
 * Date: November 16, 2024
 * Time: 00:53
 * Version: Number @
 */
import javax.swing.JOptionPane;

public class WeatherDataTracker {

    public static void main(String[] args) {
        // Declare variables for the number of cities and days
        int cities, days;
        String dailyTemp;

        // Prompt the user to enter the number of cities
        cities = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Enter a number of cities: ", "Number of Cities", JOptionPane.INFORMATION_MESSAGE));
        
        // Prompt the user to enter the number of days
        days = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Enter a number of days: ", "Number of Days", JOptionPane.INFORMATION_MESSAGE));
       
        // Declare a 2D array to store temperatures for each city and day
        int[][] temperatures = new int[cities][days];
        
        // Declare arrays to store average and highest temperatures for each city
        double[] averageTemperatures = new double[cities];
        int[] highestTemperatures = new int[cities];
        
        // Notify the user to start entering temperature data
        JOptionPane.showMessageDialog(null,
            "ENTER THE " + cities + " CITIES, AND THEIR " + days + " DAYS TEMPERATURES",
            "Cities and Daily Temperature", JOptionPane.INFORMATION_MESSAGE);
        
        // Input temperature data for each city and day
        for (int i = 0; i < cities; i++) {
            for (int j = 0; j < days; j++) {
                dailyTemp = JOptionPane.showInputDialog(null,
                    "Enter the Temperature for city " + (i + 1) + ", Day " + (j + 1) + " (°C):", 
                    "Temperature Input", JOptionPane.QUESTION_MESSAGE);
                
                // Parse the input and store it in the temperatures array
                temperatures[i][j] = Integer.parseInt(dailyTemp);
            }
        }
        
        // Calculate average and highest temperatures for each city
        for (int city = 0; city < cities; city++) {
            int sum = 0; // To store the sum of temperatures for a city
            int maxTemp = Integer.MIN_VALUE; // To track the highest temperature
            
            for (int day = 0; day < days; day++) {
                int temp = temperatures[city][day]; // Get the temperature for the current day
                sum += temp; // Add to the sum
                if (temp > maxTemp) { // Update the highest temperature if needed
                    maxTemp = temp;
                }
            }
            
            // Calculate and store the average temperature for the city
            averageTemperatures[city] = sum / (double) days;

            // Store the highest temperature for the city
            highestTemperatures[city] = maxTemp;
        }
        
        // Construct the result string for output
        String result = "Temperature Results:\n";
        for (int city = 0; city < cities; city++) {
            result += "City " + (city + 1) + ":\n";
            result += "  Average Temperature: " + Math.round(averageTemperatures[city]) + " °C\n";
            result += "  Highest Temperature: " + highestTemperatures[city] + " °C\n";
        }

        // Display the result in a message dialog
        JOptionPane.showMessageDialog(null, result, "Temperature Analysis", JOptionPane.INFORMATION_MESSAGE);
    }
}

/*import java.util.Scanner;

 * Title: Final Challenge No. 1: Retail Store Inventory Management (1D array)
 * Name: Tangonan, Kent Alfred Tarlit
 * Date: November 16, 2024
 * Time: 00:53
 * Version: Number 1

public class WeatherDataTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store temperatures for 3 cities and 7 days
        double[][] temperatures = new double[3][7];

        // Input temperatures for each city and each day
        System.out.println("Enter temperatures for 3 cities over 7 days:");
        for (int i = 0; i < 3; i++) { // i represents the city index
            System.out.println("City " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) { // j represents the day index
                System.out.print("Day " + (j + 1) + ": ");
                temperatures[i][j] = scanner.nextDouble(); // Store the temperature
            }
        }

        // Process data to calculate average and highest temperatures
        for (int i = 0; i < 3; i++) { // Loop through each city
            double total = 0; // To calculate total temperature for averaging
            double highest = temperatures[i][0]; // Initialize highest temperature

            for (int j = 0; j < 7; j++) { // Loop through each day for the city
                total += temperatures[i][j]; // Add temperature to the total
                if (temperatures[i][j] > highest) { // Check for the highest temperature
                    highest = temperatures[i][j];
                }
            }

            // Calculate average and display results
            double average = total / 7;
            System.out.printf("City %d - Average: %.2f, Highest: %.2f\n", i + 1, average, highest);
        }

        scanner.close(); // Close the scanner to release resources
    }
}
*/