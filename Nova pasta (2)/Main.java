import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) {
        // Create a new BufferedImage with the specified dimensions
        BufferedImage image = new BufferedImage(300, 200, BufferedImage.TYPE_INT_RGB);

        // Get the Graphics2D object for drawing
        Graphics2D g = image.createGraphics();

        // Set the background color
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, image.getWidth(), image.getHeight());

        // Set the drawing color
        g.setColor(Color.RED);

        // Draw a candy heart
        g.fillArc(75, 50, 150, 100, 45, 180);

        // Draw a candy cane
        g.setColor(Color.GREEN);
        g.fillRect(100, 120, 50, 60);

        // Save the image to a file
        try {
            File outputFile = new File("output.png");
            ImageIO.write(image, "png", outputFile);
        } catch (IOException e) {
            System.out.println("Error saving image: " + e.getMessage());
        }
    }
}