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

    /** Demonstrates Circle functionality and static counter. */
    public static void main(String[] args) {
        System.out.println("Testing Circle:");
        Circle c1 = new Circle();
        Circle c2 = new Circle(4.5);
        System.out.println("Circle 1 radius: " + c1.getRadius());
        System.out.println("Circle 2 radius: " + c2.getRadius());
        System.out.println("Total circles created: " + Circle.getCircleCount());
    }
}
