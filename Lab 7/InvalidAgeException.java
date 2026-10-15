/** Checked exception indicating that an age failed validation. */
public class InvalidAgeException extends Exception {
    private static final long serialVersionUID = 1L;

    /** Creates the exception with a reason for the invalid age. */
    public InvalidAgeException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        InvalidAgeException ex = new InvalidAgeException("Test exception message.");
        System.out.println("InvalidAgeException instantiated: " + ex.getMessage());
    }
}
