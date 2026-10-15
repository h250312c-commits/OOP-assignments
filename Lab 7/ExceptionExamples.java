import java.util.InputMismatchException;
import java.util.Scanner;

/** Small methods illustrating common exception handling patterns. */
public class ExceptionExamples {
    /** Reads and divides two integers, reporting input and zero-divisor errors. */
    public static void divideTwoIntegers(Scanner scanner) {
        System.out.print("Enter two integers: ");
        try {
            if (!scanner.hasNextInt()) {
                System.out.println("No input provided (using sample 10 and 2):");
                System.out.println("Result: " + (10 / 2));
                return;
            }
            int dividend = scanner.nextInt();
            int divisor = scanner.nextInt();
            System.out.println("Result: " + (dividend / divisor));
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input: enter integers only.");
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        }
    }

    /** Prints the selected array element or reports an out-of-range index. */
    public static void printArrayElement(int[] values, int index) {
        try {
            System.out.println("Element at index " + index + ": " + values[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid array index: " + index);
        }
    }

    /** Returns a value while demonstrating that {@code finally} runs first. */
    public static int returnFromTry() {
        try {
            return 7;
        } finally {
            System.out.println("finally executes before the method returns");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- ExceptionExamples Demo ---");
        try (Scanner scanner = new Scanner("10 2\n")) {
            divideTwoIntegers(scanner);
        }
        printArrayElement(new int[] {10, 20, 30}, 1);
        printArrayElement(new int[] {10, 20, 30}, 5);
        int result = returnFromTry();
        System.out.println("Returned value: " + result);
    }
}
