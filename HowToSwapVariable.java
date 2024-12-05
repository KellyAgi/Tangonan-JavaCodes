/* Title: How to swap variables.
* Name: Tangonan, Kent Alfred Tarlit
* Date: November, 11, 2024
* Time: 21:26
*/
public class HowToSwapVariable {

    public static void main(String[] args) {
        String x, y, temp;
        x = "Water";
        y = "Juice";
        temp = x;
        x = y;
        y = x;
        
        x=y;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
    
}
