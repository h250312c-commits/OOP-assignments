public class Rectangle extends Shape {
    protected final double width;
    protected final double height;

    public Rectangle(double width, double height) {
        if (!Double.isFinite(width) || width < 0
                || !Double.isFinite(height) || height < 0) {
            throw new IllegalArgumentException("Width and height must be finite and non-negative.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
