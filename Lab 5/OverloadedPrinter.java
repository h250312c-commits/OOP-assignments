import java.util.Arrays;

/** Prints values using overloads selected by the argument's compile-time type. */
public class OverloadedPrinter {
    /** Prints an integer with its type label. */
    public void print(int value) {
        System.out.println("int: " + value);
    }

    /** Prints a floating-point number with its type label. */
    public void print(double value) {
        System.out.println("double: " + value);
    }

    /** Prints a string with its type label. */
    public void print(String value) {
        System.out.println("String: " + value);
    }

    /** Prints an integer array as a readable list. */
    public void print(int[] values) {
        System.out.println("int[]: " + Arrays.toString(values));
    }

    public static void main(String[] args) {
        OverloadedPrinter printer = new OverloadedPrinter();
        printer.print(42);
        printer.print(3.14);
        printer.print("Hello");
        printer.print(new int[] {1, 2, 3});
    }
}
