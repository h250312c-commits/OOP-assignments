/** Rectangular shape whose dimensions are shared with the square subtype. */
public class Rectangle extends Shape {
    /** Horizontal extent, also used as the square's side length. */
    protected final double width;
    /** Vertical extent, also used as the square's side length. */
    protected final double height;

    /** Creates a rectangle with finite, non-negative dimensions. */
    public Rectangle(double width, double height) {
        if (!Double.isFinite(width) || width < 0
                || !Double.isFinite(height) || height < 0) {
            throw new IllegalArgumentException("Width and height must be finite and non-negative.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    /** Returns width multiplied by height. */
    public double area() {
        return width * height;
    }

    @Override
    /** Returns the sum of all four side lengths. */
    public double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4.0, 3.0);
        System.out.printf("Rectangle: area = %.2f, perimeter = %.2f%n", rect.area(), rect.perimeter());
    }
}
