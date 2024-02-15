import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class PerimeterComparatorTest {

    @Test
    public void testPerimeterComparator() {
        Shape circle = new Circle(0, 0, 1);
        Shape rectangle = new Rectangle(0, 0, 2, 2);
        Shape triangle = new Triangle(new Point2D(0, 0), new Point2D(3, 0), new Point2D(0, 4));

        Shape[] shapes = new Shape[] {triangle, rectangle, circle};
        Arrays.sort(shapes, new PerimeterComparator());

        assertTrue("Shapes should be sorted by perimeter in ascending order",
                shapes[0] == circle && shapes[1] == rectangle && shapes[2] == triangle);
    }
}
