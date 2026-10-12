import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExamples {
    public static void divideTwoIntegers(Scanner scanner) {
        System.out.print("Enter two integers: ");
        try {
            int dividend = scanner.nextInt();
            int divisor = scanner.nextInt();
            System.out.println("Result: " + (dividend / divisor));
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input: enter integers only.");
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void printArrayElement(int[] values, int index) {
        try {
            System.out.println("Element at index " + index + ": " + values[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid array index: " + index);
        }
    }

    public static int returnFromTry() {
        try {
            return 7;
        } finally {
            System.out.println("finally executes before the method returns");
        }
    }
}
