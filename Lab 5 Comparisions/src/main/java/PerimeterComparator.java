import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape shape1, Shape shape2) {
        // Calculate the perimeters of both shapes
        double perimeter1 = shape1.perimeter();
        double perimeter2 = shape2.perimeter();

        // Use Double.compare to compare the perimeters, as it handles floating point numbers correctly
        return Double.compare(perimeter1, perimeter2);
    }
}
