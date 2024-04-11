import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Coordinate.
 * This class tests the functionality of the Coordinate class methods.
 */
public class CoordinateTest {

  /**
   * Test for the constructor of Coordinate class.
   * Ensures the x and y values are correctly assigned.
   */
  @Test
  public void testCoordinateConstructor() {
    int x = 5;
    int y = 10;
    Coordinate coordinate = new Coordinate(x, y);

    Assert.assertEquals("The x value should be assigned correctly.", x, coordinate.x);
    Assert.assertEquals("The y value should be assigned correctly.", y, coordinate.y);
  }

  /**
   * Test for the equals method when both Coordinates are the same.
   */
  @Test
  public void testEqualsWithSameCoordinate() {
    Coordinate coordinate = new Coordinate(5, 10);
    Assert.assertEquals("Coordinate should be equal to itself.", coordinate, coordinate);
  }

  /**
   * Test for the equals method with two different Coordinates with the same values.
   */
  @Test
  public void testEqualsWithDifferentCoordinateSameValues() {
    Coordinate coordinate1 = new Coordinate(5, 10);
    Coordinate coordinate2 = new Coordinate(5, 10);

    Assert.assertEquals("Coordinates with the same x and y values should be equal.", coordinate1,
        coordinate2);
  }

  /**
   * Test for the equals method with two different Coordinates with different values.
   */
  @Test
  public void testEqualsWithDifferentCoordinateDifferentValues() {
    Coordinate coordinate1 = new Coordinate(5, 10);
    Coordinate coordinate2 = new Coordinate(10, 5);

    Assert.assertNotEquals("Coordinates with different x and y values should not be equal.",
        coordinate1, coordinate2);
  }
}
