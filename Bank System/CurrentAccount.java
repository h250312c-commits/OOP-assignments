public class CurrentAccount extends Account {
    private static final double MONTHLY_MAINTENANCE_FEE = 5.00;

    private final double overdraftLimit;

    public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        if (overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft limit cannot be negative.");
        }

        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.printf("Withdrawal rejected for current account %s: amount must be positive.%n",
                    accountNumber);
            return false;
        }
        if (balance - amount < -overdraftLimit) {
            System.out.printf(
                    "Withdrawal rejected for current account %s: overdraft limit is $%.2f.%n",
                    accountNumber, overdraftLimit);
            return false;
        }

        balance -= amount;
        System.out.printf("Withdrew $%.2f from current account %s.%n", amount, accountNumber);
        return true;
    }

    @Override
    public void endOfMonth() {
        balance -= MONTHLY_MAINTENANCE_FEE;
        System.out.printf("Current account %s was charged a $%.2f maintenance fee.%n",
                accountNumber, MONTHLY_MAINTENANCE_FEE);
    }
}
