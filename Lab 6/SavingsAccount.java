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

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500.0);
        sa.deposit(100.0);
        System.out.printf("SavingsAccount balance: %.2f, fee: %.2f%n", sa.getBalance(), sa.monthlyFee());
    }
}
