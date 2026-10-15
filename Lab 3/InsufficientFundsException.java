/** Checked exception raised when a withdrawal exceeds the account balance. */
public class InsufficientFundsException extends Exception {
    private static final long serialVersionUID = 1L;

    /** Creates the exception with a description of the rejected withdrawal. */
    public InsufficientFundsException(String message) {
        super(message);
    }
}
