public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        if (!Double.isFinite(radius) || radius < 0) {
            throw new IllegalArgumentException("Radius must be finite and non-negative.");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
