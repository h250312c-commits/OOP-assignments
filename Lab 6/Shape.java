/** Base shape contract requiring area and perimeter calculations. */
public abstract class Shape {
    /** Returns the shape's area in square units. */
    public abstract double area();

    /** Returns the shape's boundary length in units. */
    public abstract double perimeter();
}
