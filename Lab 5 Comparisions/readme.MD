
## Question 3 Answer 
It can be found in `Triangle.java`.

The AbstractShape class implements the Shape interface and includes a comparison method (compareTo) that compares shapes based on their area.With AbstractShape, I only need  to modify the compareTo method within the AbstractShape.java file to compare the perimeter of this shape to the perimeter of another shape (s). Without AbstractShape, each concrete shape class implementing Comparable will need to individually modify its comparison logic to base it on the perimeter. This would result in modifications to at least three files (Circle.java, Rectangle.java, and Triangle.java).

## Getting Started