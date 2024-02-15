import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class ShapeIntegrationTest {

    @Test
    public void testSortingByArea() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1, 1, 1));
        shapes.add(new Rectangle(0, 0, 2, 2));
        shapes.add(new Triangle(new Point2D(0, 0), new Point2D(1, 0), new Point2D(0, 1)));

        Collections.sort(shapes); // Sorting by area

        for (int i = 0; i < shapes.size() - 1; i++) {
            assertTrue(shapes.get(i).area() <= shapes.get(i + 1).area());
        }
    }

    @Test
    public void testSortingByPerimeter() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1, 1, 1.5));
        shapes.add(new Rectangle(0, 0, 3, 4));
        shapes.add(new Triangle(new Point2D(0, 0), new Point2D(3, 0), new Point2D(0, 4)));

        Collections.sort(shapes, new PerimeterComparator()); // Sorting by perimeter

        for (int i = 0; i < shapes.size() - 1; i++) {
            assertTrue(shapes.get(i).perimeter() <= shapes.get(i + 1).perimeter());
        }
    }
}
