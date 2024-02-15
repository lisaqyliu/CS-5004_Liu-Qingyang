import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {

    private Circle circle;

    @Before
    public void setUp() {
        circle = new Circle(1.0);
    }

    @Test
    public void testConstructorRadiusAssignment() {
        assertEquals("Radius should be 1.0", 1.0, circle.getRadius(), 0.0001);
    }

    @Test
    public void testArea() {

        double expectedArea = Math.PI;
        assertEquals("Area calculation should be correct", expectedArea, circle.area(), 0.0001);
    }

    @Test
    public void testPerimeter() {

        double expectedPerimeter = 2 * Math.PI;
        assertEquals("Perimeter calculation should be correct", expectedPerimeter, circle.perimeter(), 0.0001);
    }

    @Test
    public void testResize() {

        circle = (Circle) circle.resize(4);
        double expectedRadiusAfterResize = 2.0;
        double expectedAreaAfterResize = Math.PI * Math.pow(expectedRadiusAfterResize, 2);
        double expectedPerimeterAfterResize = 2 * Math.PI * expectedRadiusAfterResize;

        assertEquals("Radius after resize should be correct", expectedRadiusAfterResize, circle.getRadius(), 0.0001);
        assertEquals("Area after resize should be correct", expectedAreaAfterResize, circle.area(), 0.0001);
        assertEquals("Perimeter after resize should be correct", expectedPerimeterAfterResize, circle.perimeter(), 0.0001);
    }





}
