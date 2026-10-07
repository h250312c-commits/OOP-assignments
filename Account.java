public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be blank.");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.printf("Deposit rejected for account %s: amount must be positive.%n", accountNumber);
            return;
        }

        balance += amount;
        System.out.printf("Deposited $%.2f into account %s.%n", amount, accountNumber);
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean withdraw(double amount);

    public abstract void endOfMonth();
}
