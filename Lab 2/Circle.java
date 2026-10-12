public class Circle {
    private static int circleCount;

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        circleCount++;
    }

    public Circle() {
        this(1.0);
    }

    public double getRadius() {
        return radius;
    }

    public static int getCircleCount() {
        return circleCount;
    }
}
