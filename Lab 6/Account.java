/** Base class for accounts that maintain a balance and define a monthly fee. */
/** Base for accounts that maintain a balance and define a monthly fee. */
public abstract class Account {
    /** Current funds held in the account. */
    /** Current account balance. */
    private double balance;

    /** Creates an account with a finite, non-negative initial balance. */
    protected Account(double initialBalance) {
        if (!Double.isFinite(initialBalance) || initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance must be finite and non-negative.");
        }
        balance = initialBalance;
    }

    /** Adds a finite, positive amount to the balance. */
    /** Adds a finite, positive amount to the balance. */
    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Deposit must be finite and positive.");
        }
        balance += amount;
    }

    /** Returns the current balance. */
    /** Returns the current balance. */
    public double getBalance() {
        return balance;
    }

    /** Returns the fee charged each month by a concrete account type. */
    public abstract double monthlyFee();

    public static void main(String[] args) {
        Account acc = new Account(100.0) {
            @Override
            public double monthlyFee() {
                return 5.0;
            }
        };
        acc.deposit(50.0);
        System.out.printf("Account demo balance: %.2f, monthly fee: %.2f%n", acc.getBalance(), acc.monthlyFee());
    }
}
