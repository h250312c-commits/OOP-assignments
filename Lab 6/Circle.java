/** Circular shape defined by a non-negative radius. */
public class Circle extends Shape {
    /** Radius used by both area and circumference calculations. */
    private final double radius;

    /** Creates a circle with a finite, non-negative radius. */
    public Circle(double radius) {
        if (!Double.isFinite(radius) || radius < 0) {
            throw new IllegalArgumentException("Radius must be finite and non-negative.");
        }
        this.radius = radius;
    }

    @Override
    /** Returns π multiplied by the squared radius. */
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    /** Returns the circle's circumference. */
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.printf("Circle: area = %.2f, perimeter = %.2f%n", circle.area(), circle.perimeter());
    }
}
