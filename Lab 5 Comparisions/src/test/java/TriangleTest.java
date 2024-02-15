import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setUp() {
        triangle = new Triangle(new Point2D(0, 0), new Point2D(4, 0), new Point2D(0, 3));
    }

    @Test
    public void testConstructorCorrectAssignment() {
        assertNotNull("Triangle should be created", triangle);
    }

    @Test
    public void testConstructorThrowsExceptionForCollinearPoints() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(new Point2D(0, 0), new Point2D(1, 1), new Point2D(2, 2)));
    }

    @Test
    public void testArea() {
        assertEquals("Area should be correct", 6.0, triangle.area(), 0.001);
    }

    @Test
    public void testPerimeter() {
        assertEquals("Perimeter should be correct", 12.0, triangle.perimeter(), 0.001);
    }

    @Test
    public void testResize() {
        double originalArea = triangle.area();
        double resizeFactor = 4;
        triangle = (Triangle) triangle.resize(resizeFactor);
        double expectedNewArea = originalArea * resizeFactor;
        double newArea = triangle.area();
        assertEquals("Resized area should be approximately 4 times original", expectedNewArea, newArea, 0.001);
    }
}
