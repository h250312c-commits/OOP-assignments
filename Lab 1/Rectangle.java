/** Rectangle with methods for its area and perimeter. */
public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    /** Demonstrates Rectangle functionality. */
    public static void main(String[] args) {
        System.out.println("Testing Rectangle:");
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.printf("Dimensions: %.1f x %.1f%n", rect.width, rect.height);
        System.out.printf("Area: %.1f, Perimeter: %.1f%n", rect.area(), rect.perimeter());
    }
}
