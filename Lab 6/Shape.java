/** Base shape contract requiring area and perimeter calculations. */
public abstract class Shape {
    /** Returns the shape's area in square units. */
    public abstract double area();

    /** Returns the shape's boundary length in units. */
    public abstract double perimeter();

    public static void main(String[] args) {
        Shape shape = new Shape() {
            @Override
            public double area() { return 25.0; }
            @Override
            public double perimeter() { return 20.0; }
        };
        System.out.printf("Shape demo: area = %.2f, perimeter = %.2f%n", shape.area(), shape.perimeter());
    }
}
