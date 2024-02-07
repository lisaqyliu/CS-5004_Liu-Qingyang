import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for the FractionImpl class.
 */
public class FractionImplTest {

  /**
   * Tests addition of two fractions.
   * Verifies that the sum of 1/2 and 1/3 is correctly calculated as 5/6.
   */
  @Test
  public void testAddition() {
    Fraction f1 = new FractionImpl(1, 2);
    Fraction f2 = new FractionImpl(1, 3);
    Fraction result = f1.add(f2);
    assertEquals("Incorrect addition result", "5 / 6", result.toString());
  }

  /**
   * Tests the constructor's handling of a zero denominator.
   * Expects an IllegalArgumentException to be thrown.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testZeroDenominator() {
    new FractionImpl(1, 0);
  }

  /**
   * Tests the reciprocal function of a fraction.
   * Verifies that the reciprocal of 1/4 is correctly calculated as 4/1.
   */
  @Test
  public void testReciprocal() {
    Fraction f = new FractionImpl(1, 4);
    Fraction reciprocal = f.reciprocal();
    assertEquals("Incorrect reciprocal", "4 / 1", reciprocal.toString());
  }

  /**
   * Tests conversion of a fraction to its double representation.
   * Verifies that 1/2 is correctly represented as 0.5.
   */
  @Test
  public void testToDouble() {
    Fraction f = new FractionImpl(1, 2);
    double result = f.toDouble();
    assertEquals("Incorrect double representation", 0.5, result, 0.00001);
  }

  /**
   * Tests the simplification of fractions to their simplest form.
   * Verifies that 2/4 is simplified to 1/2.
   */
  @Test
  public void testSimplification() {
    Fraction f = new FractionImpl(2, 4);
    assertEquals("Fraction not simplified correctly", "1 / 2", f.toString());
  }

  // Additional tests to cover negative fractions, comparisons, etc., can be added here.
}
