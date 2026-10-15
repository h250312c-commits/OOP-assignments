/** Applies the age range used by the checked-exception example. */
public class AgeValidator {
    /** Throws when an age falls outside the inclusive 0–120 range. */
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
    }

    public static void main(String[] args) {
        int[] testAges = {25, -1, 150};
        for (int age : testAges) {
            try {
                validateAge(age);
                System.out.println("Age " + age + " is valid.");
            } catch (InvalidAgeException e) {
                System.out.println("Age " + age + " is invalid: " + e.getMessage());
            }
        }
    }
}
