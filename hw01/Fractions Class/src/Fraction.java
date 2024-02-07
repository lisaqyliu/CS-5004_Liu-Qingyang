/**
 * Defines the methods for a Fraction class that represents a mathematical fraction.
 */
public interface Fraction {
  /**
   * Returns the numerator of the fraction.
   * @return the numerator as an integer.
   */
  int getNumerator();

  /**
   * Sets the numerator of this fraction.
   * @param numerator the new numerator value.
   */
  void setNumerator(int numerator);

  /**
   * Returns the denominator of the fraction.
   * @return the denominator as a positive integer.
   */
  int getDenominator();

  /**
   * Sets the denominator of this fraction. Must be positive and non-zero.
   * @param denominator the new denominator value.
   * @throws IllegalArgumentException if the denominator is zero or negative.
   */
  void setDenominator(int denominator) throws IllegalArgumentException;

  /**
   * Converts this fraction to its decimal representation.
   * @return the decimal value of this fraction as a double.
   */
  double toDouble();

  /**
   * Returns the reciprocal of this fraction.
   * @return the reciprocal fraction.
   * @throws ArithmeticException if the numerator is zero, as reciprocal would be undefined.
   */
  Fraction reciprocal() throws ArithmeticException;

  /**
   * Adds another fraction to this fraction and returns the result.
   * @param other the fraction to add to this one.
   * @return the sum of this fraction and the other fraction as a new Fraction.
   */
  Fraction add(Fraction other);

  /**
   * Compares this fraction with another fraction.
   * @param other the fraction to compare with this one.
   * @return a negative integer, zero, or a positive integer as this fraction
   *         is less than, equal to, or greater than the specified fraction.
   */
  int compareTo(Fraction other);
}
