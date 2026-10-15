import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Bank account that validates transactions and retains a read-only history. */
public class BankAccount {
    /** Fixed identifier assigned when the account is opened. */
    private final String accountNumber;
    /** Current spendable balance. */
    private double balance;
    /** Transaction log in chronological order. */
    private final List<String> transactionHistory = new ArrayList<>();

    /** Opens an account and records its initial balance as the first history entry. */
    public BankAccount(String accountNumber, double initialBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be blank.");
        }
        if (!Double.isFinite(initialBalance) || initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance must be finite and non-negative.");
        }

        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        transactionHistory.add(String.format("Opened account with balance %.2f", initialBalance));
    }

    /** Returns the account's identifier. */
    public String getAccountNumber() {
        return accountNumber;
    }

    /** Returns the current balance. */
    public double getBalance() {
        return balance;
    }

    /** Adds a positive finite amount and records the deposit. */
    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Deposit must be finite and positive.");
        }

        balance += amount;
        transactionHistory.add(String.format("Deposited %.2f", amount));
    }

    /** Withdraws a positive finite amount or throws when funds are insufficient. */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be finite and positive.");
        }
        if (amount > balance) {
            transactionHistory.add(String.format("Rejected withdrawal of %.2f (insufficient funds)", amount));
            throw new InsufficientFundsException(
                    String.format("Withdrawal of %.2f exceeds available balance %.2f.", amount, balance));
        }

        balance -= amount;
        transactionHistory.add(String.format("Withdrew %.2f", amount));
    }

    /** Returns an immutable snapshot of transactions recorded so far. */
    public List<String> getTransactionHistory() {
        return Collections.unmodifiableList(new ArrayList<>(transactionHistory));
    }

    /** Demonstrates BankAccount functionality and transaction history. */
    public static void main(String[] args) {
        System.out.println("Testing BankAccount:");
        BankAccount account = new BankAccount("BA-202", 500.00);
        System.out.println("Account Number: " + account.getAccountNumber());
        account.deposit(200.00);
        try {
            account.withdraw(100.00);
            account.withdraw(999.00); // throws InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Expected rejection: " + e.getMessage());
        }
        System.out.println("Transaction history: " + account.getTransactionHistory());
    }
}
