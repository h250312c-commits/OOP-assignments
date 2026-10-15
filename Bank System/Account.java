/** Shared account data and operations for specific bank account types. */
public abstract class Account {
    /** Identifier used to distinguish this account in transaction messages. */
    protected String accountNumber;
    /** Current balance, which subclasses update when processing transactions. */
    protected double balance;

    /** Creates an account with a number and non-negative starting balance. */
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

    /** Adds a positive amount to the account and reports the result. */
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.printf("Deposit rejected for account %s: amount must be positive.%n", accountNumber);
            return;
        }

        balance += amount;
        System.out.printf("Deposited $%.2f into account %s.%n", amount, accountNumber);
    }

    /** Returns the account number. */
    public String getAccountNumber() {
        return accountNumber;
    }

    /** Returns the current account balance. */
    public double getBalance() {
        return balance;
    }

    /** Attempts to withdraw an amount; returns whether the withdrawal succeeded. */
    public abstract boolean withdraw(double amount);

    /** Applies this account's monthly processing. */
    public abstract void endOfMonth();
}
