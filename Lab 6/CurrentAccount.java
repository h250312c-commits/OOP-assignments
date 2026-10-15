/** Account type with a fixed monthly service fee. */
public class CurrentAccount extends Account {
    /** Fixed fee deducted each month. */
    private static final double MONTHLY_FEE = 12.50;

    /** Opens an account with the supplied initial balance. */
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    /** Returns this account's fixed monthly fee. */
    public double monthlyFee() {
        return MONTHLY_FEE;
    }
}
