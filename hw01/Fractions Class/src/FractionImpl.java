/**
 * Implements the Fraction interface, representing a fraction with a numerator and a positive denominator.
 */
public class FractionImpl implements Fraction {
  private int numerator;
  private int denominator;

  /**
   * Constructor for FractionImpl.
   * @param numerator the numerator of the fraction.
   * @param denominator the denominator of the fraction; must be positive.
   * @throws IllegalArgumentException if the denominator is zero or negative.
   */
  public FractionImpl(int numerator, int denominator) {
    if (denominator == 0) {
      throw new IllegalArgumentException("Denominator cannot be zero.");
    }
    if (denominator < 0) {
      numerator = -numerator;
      denominator = -denominator;
    }
    this.numerator = numerator;
    this.denominator = denominator;
    simplify();
  }

  // Implementations of Fraction interface methods with JavaDocs omitted for brevity

  /**
   * Simplifies the fraction to its simplest form.
   */
  private void simplify() {
    int gcd = gcd(this.numerator, this.denominator);
    this.numerator /= gcd;
    this.denominator /= gcd;
  }

  /**
   * Implements Euclid's algorithm to find the greatest common divisor (GCD) of two integers.
   * @param a the first integer.
   * @param b the second integer.
   * @return the greatest common divisor of a and b.
   */
  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  @Override
  public int getNumerator() {
    return numerator;
  }

  @Override
  public void setNumerator(int numerator) {
    this.numerator = numerator;
    simplify();

  }

  @Override
  public int getDenominator() {
    return denominator;
  }

  @Override
  public void setDenominator(int denominator) throws IllegalArgumentException {
    if (denominator <= 0){
      throw new IllegalArgumentException("Dominator must be positive.");
    }
    this.denominator = denominator;
    simplify();
  }

  @Override
  public double toDouble() {
    return (double) numerator / denominator;
  }

  @Override
  public Fraction reciprocal() {
    if (numerator == 0) {
      throw new ArithmeticException("Cannot take reciprocal of a fraction with zero numerator.");
    }
    return new FractionImpl(denominator, numerator);
  }


  @Override
  public Fraction add(Fraction other) {
    int newNumerator = this.numerator * other.getDenominator() + this.denominator * other.getNumerator();
    int newDenominator = this.denominator * other.getDenominator();
    return new FractionImpl(newNumerator, newDenominator);
  }

  @Override
  public int compareTo(Fraction other) {
    int crossProduct1 = this.numerator * other.getDenominator();
    int crossProduct2 = other.getNumerator() * this.denominator;
    return Integer.compare(crossProduct1, crossProduct2);
  }

  @Override
  public String toString() {
    return numerator + " / " + denominator;
  }

  // Overridden methods and additional private methods omitted for brevity
}
