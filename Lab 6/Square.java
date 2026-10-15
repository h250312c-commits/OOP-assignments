/** Rectangle specialization whose width and height are always equal. */
public class Square extends Rectangle {
    /** Creates a square using the side length for both dimensions. */
    public Square(double side) {
        super(side, side);
    }

    public static void main(String[] args) {
        Square square = new Square(3.0);
        System.out.printf("Square: area = %.2f, perimeter = %.2f%n", square.area(), square.perimeter());
    }
}
