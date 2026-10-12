import java.util.Arrays;

public class OverloadedPrinter {
    public void print(int value) {
        System.out.println("int: " + value);
    }

    public void print(double value) {
        System.out.println("double: " + value);
    }

    public void print(String value) {
        System.out.println("String: " + value);
    }

    public void print(int[] values) {
        System.out.println("int[]: " + Arrays.toString(values));
    }
}
