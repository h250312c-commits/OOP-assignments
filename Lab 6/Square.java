/** Rectangle specialization whose width and height are always equal. */
public class Square extends Rectangle {
    /** Creates a square using the side length for both dimensions. */
    public Square(double side) {
        super(side, side);
    }
}
