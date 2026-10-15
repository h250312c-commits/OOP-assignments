public class Circle {
    private static int circleCount;

    private final double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException("Radius must be finite and positive.");
        }

        this.radius = radius;
        circleCount++;
    }

    public double getRadius() {
        return radius;
    }

    public static int getCircleCount() {
        return circleCount;
    }
}
