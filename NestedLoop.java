/* Title: How to use for loop.
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 12, 2024
* Time: 00:00
*/
import java.util.Scanner;
public class NestedLoop {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int rows, columns;
       char letters;
       
       System.out.println("Enter number of rows: ");
       rows = sc.nextInt();
       
       System.out.println("Enter number of column: ");
       columns = sc.nextInt();
       
       System.out.println("Enter any leter: ");
       letters = sc.next().charAt(0);
       
       for(int i=0; i<=rows; i++){
           System.out.println();
           for(int j=0; j<=columns; j++){
               System.out.print(letters);
           }
               
       }
    }
    
}
