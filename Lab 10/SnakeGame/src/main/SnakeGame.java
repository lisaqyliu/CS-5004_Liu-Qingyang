import java.awt.Dimension;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main method that creates the game frame and panel.
 *
 * @param args command line arguments
 */
public class SnakeGame {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JPanel panel = new MyPanel();
    panel.setPreferredSize(new Dimension(400, 400));
    frame.add(panel);
    frame.pack();
    // by default, everything is invisible. Make it visible
    frame.setVisible(true);
  }
}

//Future improvements: 1. separate the classes into different files and add more tests to ensure the correctness of the code. (break down myPanel.java into multiple classes)
//2. Add more features to the game, such as scoring, levels, and obstacles.
//3. Implement a better game loop for smoother animation. (Timing and synchronization)