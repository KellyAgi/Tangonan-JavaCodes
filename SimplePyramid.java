/* Title: Simple 2D Pyramid
 * Name: Tangonan, Kent Alfred Tarlit
 * Date: December 1, 2024
 * Time: 18:36
 */
import java.awt.*;
import javax.swing.*;

public class SimplePyramid extends Canvas {

    @Override
    public void paint(Graphics keii) {
        // Draw a simple 2D pyramid

        // Set color for the pyramid's front face
        keii.setColor(new Color(210, 180, 140)); // Tan color

        // Coordinates for the front face (triangle)
        int[] frontX = {200, 300, 100}; // X-coordinates (apex, bottom-right, bottom-left)
        int[] frontY = {50, 200, 200};  // Y-coordinates
        keii.fillPolygon(frontX, frontY, 3); // Fill the triangle

        // Draw the outline of the pyramid
        keii.setColor(Color.BLACK);
        keii.drawPolygon(frontX, frontY, 3);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Kenjung's Simple 2D Pyramid");
        SimplePyramid canvas = new SimplePyramid();

        f.setSize(400, 300); // Adjusted size to fit the pyramid
        f.add(canvas);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
