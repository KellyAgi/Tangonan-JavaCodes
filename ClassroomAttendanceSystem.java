/** 
 * Title: Challenge in CC2 
 * Author: Tangonan, Kent Alfred T.
 * Date: October 15, 2024
 * Time: 21:39
 * Location: Philippines
 */
import java.util.Scanner;

public class ClassroomAttendanceSystem {
    public static void main(String[] args) {
        Scanner attendance = new Scanner(System.in);
        int totalNumberOfStudents, presentCount = 0, absentCount = 0, i;
        String answers;
       
        // Get the total number of students first.
        System.out.print("Enter the total number of students: ");
        totalNumberOfStudents = attendance.nextInt();
        attendance.nextLine(); // Consume the newline left by nextInt()
       
        for (i = 1; i <= totalNumberOfStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            answers = attendance.nextLine();  
            
            // Using switch is the easiest way thn if else.
            switch (answers) {
                case "Y":
                    presentCount++;
                    break;
                case "N":
                    absentCount++;
                    break;
                default:
                    System.out.println("Invalid input, please enter Y or N.");
                    i--; // Repeat the same student's attendance if input is invalid
                    break;
            }
        }
       
        // Display the total present and absent count
        System.out.println("Total present: " + presentCount);
        System.out.println("Total absent: " + absentCount);

        // Closing the scanner object
        attendance.close(); 
    }
}
