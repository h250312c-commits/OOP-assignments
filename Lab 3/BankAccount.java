import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final List<String> transactionHistory = new ArrayList<>();

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

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Deposit must be finite and positive.");
        }

        balance += amount;
        transactionHistory.add(String.format("Deposited %.2f", amount));
    }

    public boolean withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be finite and positive.");
        }
        if (amount > balance) {
            transactionHistory.add(String.format("Rejected withdrawal of %.2f (insufficient funds)", amount));
            return false;
        }

        balance -= amount;
        transactionHistory.add(String.format("Withdrew %.2f", amount));
        return true;
    }

    public List<String> getTransactionHistory() {
        return Collections.unmodifiableList(new ArrayList<>(transactionHistory));
    }
}
