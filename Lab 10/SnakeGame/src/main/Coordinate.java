public class Coordinate {
  /**
   * Constructs a new Coordinate object with the given x and y coordinates
   *
   * @param x the x coordinate
   * @param y the y coordinate
   */
  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  int x;
  int y;

  /**
   * GChecks if this Coordinate equals another object. Returns true if the other object is a Coordinate
   * and has the same x and y values as this Coordinate.
   *
   * @param obj the object to compare to
   * @return true if the other object is a Coordinate with the same x and y values as this Coordinate
   */
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Coordinate) {
      Coordinate other = (Coordinate) obj;
      return other.x == this.x && other.y == this.y;
    }

    return false;
  }
}
