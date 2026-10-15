/** Account type that permits withdrawals within an overdraft limit. */
public class CurrentAccount extends Account {
    /** Fixed monthly fee charged to every current account. */
    private static final double MONTHLY_MAINTENANCE_FEE = 5.00;

    /** Maximum amount this account may be overdrawn. */
    private final double overdraftLimit;

    /** Creates an account with the specified overdraft limit. */
    public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        if (overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft limit cannot be negative.");
        }

        this.overdraftLimit = overdraftLimit;
    }

    /** Withdraws funds if the amount is valid and the limit is not exceeded. */
    @Override
    public boolean withdraw(double amount) {
        // Reject invalid amounts before checking available funds.
        if (amount <= 0) {
            System.out.printf("Withdrawal rejected for current account %s: amount must be positive.%n",
                    accountNumber);
            return false;
        }
        // The balance may go below zero, but not beyond the overdraft limit.
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

    /** Deducts the monthly maintenance fee from the balance. */
    @Override
    public void endOfMonth() {
        balance -= MONTHLY_MAINTENANCE_FEE;
        System.out.printf("Current account %s was charged a $%.2f maintenance fee.%n",
                accountNumber, MONTHLY_MAINTENANCE_FEE);
    }

    /** Demonstrates CurrentAccount functionality. */
    public static void main(String[] args) {
        System.out.println("Testing CurrentAccount:");
        CurrentAccount account = new CurrentAccount("CA-909", 100.00, 300.00);
        System.out.printf("Initial balance: $%.2f%n", account.getBalance());
        account.withdraw(250.00);
        System.out.printf("Balance after overdraft: $%.2f%n", account.getBalance());
        account.endOfMonth();
        System.out.printf("Final balance: $%.2f%n", account.getBalance());
    }
}
