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
        try {
            account.withdraw(700);
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
