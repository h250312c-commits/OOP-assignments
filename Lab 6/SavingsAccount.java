public class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double monthlyFee() {
        return 0;
    }
}
