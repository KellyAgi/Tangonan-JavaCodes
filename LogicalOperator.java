/* Title: How to use logical operators.
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 12, 2024
* Time: 00:00
*/
import java.util.Scanner;
public class LogicalOperator {

    public static void main(String[] args) {
        Scanner games = new Scanner(System.in);
        // NOT !
        // AND &&
        // OR ||
        String response;
        
        System.out.println("Khane is gay?");
        response = games.nextLine();
        
        if(response.equals("Yes")||response.equals("No")){
            System.out.println("Yes, Khane is Gay");
        }else{
            System.out.println("Invalid Answer");
        }
        games.close();
    }
    
}
