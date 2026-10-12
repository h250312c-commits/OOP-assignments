public abstract class Account {
    private double balance;

    protected Account(double initialBalance) {
        if (!Double.isFinite(initialBalance) || initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance must be finite and non-negative.");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Deposit must be finite and positive.");
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double monthlyFee();
}
