import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(0, 0, 3, 4);
    }

    @Test
    public void testConstructorWidthHeightAssignment() {
        // Verify the constructor correctly assigns width and height
        assertEquals("Width should be 3", 3, rectangle.getWidth(), 0.001);
        assertEquals("Height should be 4", 4, rectangle.getHeight(), 0.001);
    }

    @Test
    public void testArea() {
        // Area should be width * height
        double expectedArea = 12;
        assertEquals("Area calculation should be correct", expectedArea, rectangle.area(), 0.001);
    }

    @Test
    public void testPerimeter() {

        double expectedPerimeter = 14;
        assertEquals("Perimeter calculation should be correct", expectedPerimeter, rectangle.perimeter(), 0.001);
    }

    @Test
    public void testResize() {
        rectangle = (Rectangle) rectangle.resize(4);
        double expectedWidthAfterResize = 6;
        double expectedHeightAfterResize = 8;

        assertEquals("Width after resize should be doubled", expectedWidthAfterResize, rectangle.getWidth(), 0.001);
        assertEquals("Height after resize should be doubled", expectedHeightAfterResize, rectangle.getHeight(), 0.001);

        double expectedAreaAfterResize = expectedWidthAfterResize * expectedHeightAfterResize;
        double expectedPerimeterAfterResize = 2 * (expectedWidthAfterResize + expectedHeightAfterResize);

        assertEquals("Area after resize should be correct", expectedAreaAfterResize, rectangle.area(), 0.001);
        assertEquals("Perimeter after resize should be correct", expectedPerimeterAfterResize, rectangle.perimeter(), 0.001);
    }

}
