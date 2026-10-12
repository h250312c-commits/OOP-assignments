import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab3 {
    public static void main(String[] args) {
        System.out.println("1-2. Student");
        Student student = new Student("Jordan", 85);
        System.out.printf("%s: %d marks, grade %c%n",
                student.getName(), student.getMarks(), student.getGrade());
        try {
            student.setMarks(101);
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid marks rejected: " + exception.getMessage());
        }

        System.out.println("\n3. Bank account transaction history");
        BankAccount account = new BankAccount("BA1001", 500);
        System.out.println("Account number: " + account.getAccountNumber());
        account.deposit(125);
        try {
            account.withdraw(80);
        } catch (InsufficientFundsException exception) {
            System.out.println("Withdrawal rejected: " + exception.getMessage());
        }
        List<String> history = account.getTransactionHistory();
        System.out.println("History snapshot: " + history);
        account.deposit(25);
        System.out.println("Snapshot stays unchanged after another transaction: " + history);
        try {
            history.add("Attempt to alter history");
        } catch (UnsupportedOperationException exception) {
            System.out.println("Returned history cannot be modified.");
        }

        System.out.println("\n4. Immutable person");
        ImmutablePerson person = new ImmutablePerson("Taylor", 30);
        System.out.printf("%s is %d years old.%n", person.getName(), person.getAge());

        System.out.println("\n5. Temperature");
        Temperature roomTemperature = new Temperature(300);
        System.out.printf("300 K = %.2f C, %.2f F%n",
                roomTemperature.getCelsius(), roomTemperature.getFahrenheit());
        try {
            new Temperature(-1);
        } catch (IllegalArgumentException exception) {
            System.out.println("Temperature below absolute zero rejected: " + exception.getMessage());
        }
    }
}

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        this.marks = marks;
    }

    public char getGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        }
        return 'F';
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private final String accountNumber;
    private double balance;
    private final List<String> transactionHistory = new ArrayList<>();

    public BankAccount(String accountNumber, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        transactionHistory.add("Opening balance: " + initialBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        transactionHistory.add("Deposit: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal of " + amount);
        }
        balance -= amount;
        transactionHistory.add("Withdrawal: " + amount);
    }

    public List<String> getTransactionHistory() {
        return Collections.unmodifiableList(new ArrayList<>(transactionHistory));
    }
}

final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Temperature {
    private final double kelvin;

    public Temperature(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero.");
        }
        this.kelvin = kelvin;
    }

    public double getCelsius() {
        return kelvin - 273.15;
    }

    public double getFahrenheit() {
        return (getCelsius() * 9.0 / 5.0) + 32.0;
    }
}
