import java.util.List;

/** Runs example withdrawals and month-end processing for two account types. */
public class BankDemo {
    /** Creates sample accounts and displays their balances before and after processing. */
    public static void main(String[] args) {
        List<Account> accounts = List.of(
                new SavingsAccount("AB1001", 1000.00, 200.00),
                new CurrentAccount("CB2123", 100.00, 300.00));

        double[] withdrawals = {850.00, 250.00};

        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            System.out.printf("%nProcessing account %s (starting balance: $%.2f)%n",
                    account.getAccountNumber(), account.getBalance());

            account.withdraw(withdrawals[i]);
            account.endOfMonth();

            System.out.printf("Ending balance for account %s: $%.2f%n",
                    account.getAccountNumber(), account.getBalance());
        }
    }
}
