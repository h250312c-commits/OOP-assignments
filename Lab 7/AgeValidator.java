/** Applies the age range used by the checked-exception example. */
public class AgeValidator {
    /** Throws when an age falls outside the inclusive 0–120 range. */
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
    }
}
