// Question 3 Answer. The AbstractShape class implements the Shape interface and includes a comparison method (compareTo) that compares shapes based on their area.With AbstractShape, I only need  to modify the compareTo method within the AbstractShape.java file to compare the perimeter of this shape to the perimeter of another shape (s). Without AbstractShape, each concrete shape class implementing Comparable will need to individually modify its comparison logic to base it on the perimeter. This would result in modifications to at least three files (Circle.java, Rectangle.java, and Triangle.java).

public class Triangle extends AbstractShape {
    private Point2D point1;
    private Point2D point2;

    public Triangle(Point2D reference, Point2D point1, Point2D point2) {
        super(reference);
        if (reference.equals(point1) || reference.equals(point2) || point1.equals(point2)) {
            throw new IllegalArgumentException("Points must be unique");
        }
        this.point1 = point1;
        this.point2 = point2;

        if (isCollinear()) {
            throw new IllegalArgumentException("Points are collinear, not a valid triangle");
        }
    }

    private boolean isCollinear() {
        double area = Math.abs((reference.getX()*(point1.getY() - point2.getY()) +
                point1.getX()*(point2.getY() - reference.getY()) +
                point2.getX()*(reference.getY() - point1.getY())) / 2.0);
        return area == 0;
    }

    @Override
    public double area() {
        double sideA = distance(reference, point1);
        double sideB = distance(point1, point2);
        double sideC = distance(point2, reference);
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        // Sum of all sides
        return distance(reference, point1) + distance(point1, point2) + distance(point2, reference);
    }

    @Override
    public Shape resize(double factor) {

        double centroidX = (this.point1.getX() + this.point2.getX() + this.reference.getX()) / 3;
        double centroidY = (this.point1.getY() + this.point2.getY() + this.reference.getY()) / 3;
        double distanceFactor = Math.sqrt(factor);

        Point2D newPoint1 = new Point2D(
                centroidX + (this.point1.getX() - centroidX) * distanceFactor,
                centroidY + (this.point1.getY() - centroidY) * distanceFactor);
        Point2D newPoint2 = new Point2D(
                centroidX + (this.point2.getX() - centroidX) * distanceFactor,
                centroidY + (this.point2.getY() - centroidY) * distanceFactor);
        Point2D newReference = new Point2D(
                centroidX + (this.reference.getX() - centroidX) * distanceFactor,
                centroidY + (this.reference.getY() - centroidY) * distanceFactor);
        return new Triangle(newReference, newPoint1, newPoint2);
    }


    private Point2D scalePoint(Point2D point, Point2D centroid, double factor) {
        double dx = point.getX() - centroid.getX();
        double dy = point.getY() - centroid.getY();
        return new Point2D(centroid.getX() + dx * Math.sqrt(factor), centroid.getY() + dy * Math.sqrt(factor));
    }

    private double distance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    @Override
    public String toString() {
        return String.format("Triangle: reference (%.3f,%.3f), point1 (%.3f,%.3f), point2 (%.3f,%.3f), area: %.3f, perimeter: %.3f",
                this.reference.getX(), this.reference.getY(),
                this.point1.getX(), this.point1.getY(),
                this.point2.getX(), this.point2.getY(),
                this.area(), this.perimeter());
    }
}
