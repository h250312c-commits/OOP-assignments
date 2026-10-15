/** Savings account that charges no monthly fee in this example. */
public class SavingsAccount extends Account {
    /** Opens a savings account with the supplied initial balance. */
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    /** Returns zero because this account has no monthly fee. */
    public double monthlyFee() {
        return 0;
    }
}
