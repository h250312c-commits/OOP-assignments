public class CurrentAccount extends Account {
    private static final double MONTHLY_FEE = 12.50;

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double monthlyFee() {
        return MONTHLY_FEE;
    }
}
