/**
 * This class represent a shoe with attributes like type, color, brand, and size.
 */
public class Shoe {
    private String type;
    private String color;
    private String brand;
    private double size;
  /**
   * Constructor for creating a shoe object with its attributes.
   * @param type The type of the shoe.
   * @param color The color of the shoe.
   * @param brand The brand of the shoe.
   * @param size The size of the shoe.
   */
  public Shoe (String type,String color, String brand, Double size) {
    this.type = type;
    this.color = color;
    this.brand = brand;
    this.size = size;
  }
  /**
   * Getter method to retrieve the type of the shoe.
   * @return The type of the shoe.
   */
  public String getType() {
    return type;
  }
  /**
   * Getter method to retrieve the color of the shoe.
   * @return The color of the shoe.
   */
  public String getColor() {
    return color;
  }
  /**
   * Getter method to retrieve the brand of the shoe.
   * @return The brand of the shoe.
   */
  public String getBrand() {
    return brand;
  }
  /**
   * Getter method to retrieve the size of the shoe.
   * @return The size of the shoe.
   */
  public double getSize() {
    return size;
  }
  /**
   * Returns a string representing of the Shoe object.
   * 
   * @return A string containing the attributes of the shoe.
   */
  public String toString() {
    return "Shoe{" +
        "type='" + this.type + '\'' +
        ", color='" + this.color + '\'' +
        ", brand='" + this.brand + '\'' +
        ", size=" + this.size +
        '}';
  }
}
