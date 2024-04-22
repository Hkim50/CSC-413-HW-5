import java.time.LocalDateTime;

public class Driver2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1500.0);

        BankAccountTransaction transaction = new BankAccountTransaction(1, LocalDateTime.now(), "Deposit", 500.0, "Salary deposit", account);

        transaction.executeTransaction(new DepositTransaction(account, 500.0));

        System.out.println("Balance after deposit: " + account.getBalance());

        transaction.executeTransaction(new WithdrawTransaction(account, 200.0));

        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}