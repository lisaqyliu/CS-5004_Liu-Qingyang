import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShapeDemo {

  public static void main(String[] args) {
    List<Shape> shapes = new LinkedList<>(); // Use LinkedList

    // Add shapes to the list
    shapes.add(new Circle(5.0, 6.0, 15.0)); // Circle with center at (5.0, 6.0) and radius 15.0
    shapes.add(new Rectangle(4.0, 6.0, 3.0, 4.0)); // Rectangle with lower-left corner at (4.0, 6.0), width 3.0, and height 4.0

    // Correctly creating a Triangle instance
    Point2D pointA = new Point2D(1.0, 2.0);
    Point2D pointB = new Point2D(0.0, 3.0);
    Point2D pointC = new Point2D(-1.0, 0.0);
    shapes.add(new Triangle(pointA, pointB, pointC)); // Triangle defined by three points

    // Sort shapes based on area (using Comparable)
    Collections.sort(shapes);

    // Print the sorted list by area
    System.out.println("Sorted by area:");
    for (Shape shape : shapes) {
      System.out.println(shape + " - Area: " + shape.area());
    }

    // Sort shapes based on perimeter (using Comparator)
    Collections.sort(shapes, new PerimeterComparator());

    // Print the sorted list by perimeter
    System.out.println("\nSorted by perimeter:");
    for (Shape shape : shapes) {
      System.out.println(shape + " - Perimeter: " + shape.perimeter());
    }
  }
}
