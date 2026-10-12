import java.util.List;

public class BankDemo {
    public static void main(String[] args) {
        List<Account> accounts = List.of(
                new SavingsAccount("AB1001", 1000.00, 200.00),
                new CurrentAccount("CB2123", 100.00, 300.00));

        double[] withdrawals = {850.00, 250.00};

        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            System.out.printf("%nProcessing account %s (starting balance: $%.2f)%n",
                    account.accountNumber, account.getBalance());

            account.withdraw(withdrawals[i]);
            account.endOfMonth();

            System.out.printf("Ending balance for account %s: $%.2f%n",
                    account.accountNumber, account.getBalance());
        }
    }
}
