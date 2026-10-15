import java.util.Scanner;

/** Runs the Lab 7 examples for checked and runtime exceptions. */
public class Lab7 {
    /** Runs each Lab 7 demonstration. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ExceptionExamples.divideTwoIntegers(scanner);
        }

        System.out.println("\n2. Array access");
        int[] values = {10, 20, 30};
        ExceptionExamples.printArrayElement(values, 1);
        ExceptionExamples.printArrayElement(values, 5);

        System.out.println("\n3. Checked age validation");
        int[] ages = {25, -1, 121};
        for (int age : ages) {
            try {
                AgeValidator.validateAge(age);
                System.out.println("Valid age: " + age);
            } catch (InvalidAgeException exception) {
                System.out.println("Invalid age " + age + ": " + exception.getMessage());
            }
        }

        System.out.println("\n5. Return and finally");
        int result = ExceptionExamples.returnFromTry();
        System.out.println("Returned value: " + result);
    }
}
