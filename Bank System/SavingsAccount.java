/** Savings account that protects a minimum balance and earns monthly interest. */
public class SavingsAccount extends Account {
    /** Monthly interest rate applied to the current balance. */
    private static final double INTEREST_RATE = 0.03;

    /** Lowest balance permitted after a withdrawal. */
    private final double minimumBalance;

    /** Creates a savings account with a valid minimum balance. */
    public SavingsAccount(String accountNumber, double initialBalance, double minimumBalance) {
        super(accountNumber, initialBalance);
        if (minimumBalance < 0 || initialBalance < minimumBalance) {
            throw new IllegalArgumentException(
                    "Minimum balance must be non-negative and no greater than the initial balance.");
        }

        this.minimumBalance = minimumBalance;
    }

    /** Withdraws only when the amount is positive and the minimum remains intact. */
    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.printf("Withdrawal rejected for savings account %s: amount must be positive.%n",
                    accountNumber);
            return false;
        }
        if (balance - amount < minimumBalance) {
            System.out.printf(
                    "Withdrawal rejected for savings account %s: balance must remain at least $%.2f.%n",
                    accountNumber, minimumBalance);
            return false;
        }

        balance -= amount;
        System.out.printf("Withdrew $%.2f from savings account %s.%n", amount, accountNumber);
        return true;
    }

    /** Adds interest calculated from the balance before interest is credited. */
    @Override
    public void endOfMonth() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.printf("Savings account %s earned $%.2f interest.%n", accountNumber, interest);
    }

    /** Demonstrates SavingsAccount functionality. */
    public static void main(String[] args) {
        System.out.println("Testing SavingsAccount:");
        SavingsAccount account = new SavingsAccount("SA-101", 1000.00, 200.00);
        System.out.printf("Initial balance: $%.2f%n", account.getBalance());
        account.withdraw(850.00); // rejected due to minimum balance
        account.withdraw(300.00); // accepted
        account.endOfMonth();     // interest credited
        System.out.printf("Final balance: $%.2f%n", account.getBalance());
    }
}
