/** Checked exception raised when a withdrawal exceeds the account balance. */
public class InsufficientFundsException extends Exception {
    private static final long serialVersionUID = 1L;

    /** Creates the exception with a description of the rejected withdrawal. */
    public InsufficientFundsException(String message) {
        super(message);
    }

    /** Demonstrates throwing and catching InsufficientFundsException. */
    public static void main(String[] args) {
        System.out.println("Testing InsufficientFundsException:");
        try {
            throw new InsufficientFundsException("Withdrawal of $500 exceeds balance of $100.");
        } catch (InsufficientFundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
