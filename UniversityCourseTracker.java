/* Title: Final Challenge No. 3: University Course Enrollment and Grades Tracker (1D and 2D arrays)
 * Name: Tangonan, Kent Alfred Tarlit
 * Date: November 16, 2024
 * Time: 19:47
 * Version: Number 1
 */
import javax.swing.JOptionPane;

public class UniversityCourseTracker {

    public static void main(String[] args) {
        // Student names
        String[] studentNames = {"Kenjung", "Kent", "Alfred", "Ann", "Gie"};

        // Grades for each student in 3 subjects
        int[][] studentGrades = {
                {85, 90, 78}, // Kenjung's grades
                {75, 88, 92}, // Kent's grades
                {91, 85, 89}, // Alfred's grades
                {80, 77, 83}, // Ann's grades
                {95, 92, 90}  // Gie's grades
        };

        // Display grades and average for each student
        for (int i = 0; i < studentNames.length; i++) {
            int totalGrade = 0;
            String gradesString = studentNames[i] + " Grades: ";
            for (int j = 0; j < studentGrades[i].length; j++) {
                totalGrade += studentGrades[i][j];
                gradesString += studentGrades[i][j] + " ";
            }
            double averageGrade = (double) totalGrade / studentGrades[i].length;
            gradesString += "\nAverage: " + averageGrade;
            JOptionPane.showMessageDialog(null, gradesString);
        }
    }
}

/* Title: Final Challenge No. 3: University Course Enrollment and Grades Tracker (1D and 2D arrays)
 * Name: Tangonan, Kent Alfred Tarlit
 * Date: November 16, 2024
 * Time: 19:47
 * Version: Number 2
 *
import javax.swing.JOptionPane;
public class UniversityCourseEnrollment{
    public static void main(String []args){
        String gradeInputs, output;
        
        int numberStudents, subjects;
        
        numberStudents = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of students: "));
        subjects = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of subjects: "));
        
        // Array that stores student names
        String studentNames[] = new String[numberStudents];
        // Array that stores student's grade
        double grades[][] = new double[numberStudents][subjects];
        // Array that calculate the average grade of the students
        double averages[] = new double[numberStudents];
        
        // Loop through inputing student names
        for(int i = 0; i < numberStudents; i++){
          studentNames[i] = JOptionPane.showInputDialog(null, "Enter the name of student " + (i + 1) + ": ");
        double sum = 0;
        // Loop students grades
          for(int j = 0; j < subjects; j++){
              gradeInputs = JOptionPane.showInputDialog(null, "Enter grade for " + studentNames[i] + " in Subject " + (j + 1) + ":");
              grades[i][j] = Double.parseDouble(gradeInputs);
               sum += grades[i][j];
          }
          averages[i] = sum / subjects; 
        }
        output = "Student Average Grades:\n";
        for (int i = 0; i < numberStudents; i++) {
            output += studentNames[i] + ":\n";
        for (int j = 0; j < subjects; j++) {
            output += "  Subject " + (j + 1) + ": " + grades[i][j] + "\n";
         }
        output += "  Average: " + averages[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, output);

    }
}*/