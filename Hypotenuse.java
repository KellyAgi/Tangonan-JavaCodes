/* Title: How to find hypotenuse.
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 11, 2024
* Time: 22:49
*/
import java.util.Scanner;
public class Hypotenuse {

    public static void main(String[] args) {
        Scanner hypotenuse = new Scanner(System.in);
        double x, y, z;
        
        System.out.println("Enter side x: ");
        x = hypotenuse.nextDouble();
        
        System.out.println("Enter side y: ");
        y = hypotenuse.nextDouble();
        
        z = Math.sqrt((x*x)+(y*y));
        
        System.out.println("The Hypotenuse is: " +z);
        
        hypotenuse.close();
    }
    
}
