import java.time.LocalDateTime;

public class BankAccountTransaction implements TransactionInterface{
    private int id;
    private LocalDateTime datetime;
    private String type;
    private double amount;
    private String description;
    private BankAccount account;

    public BankAccountTransaction(int id, LocalDateTime datetime, String type, double amount, String description, BankAccount account) {
        this.id = id;
        this.datetime = datetime;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.account = account;
    }

    @Override
    public void execute() {
        switch (type) {
            case "Deposit":
                account.deposit(amount);
                break;
            case "Withdrawal":
                account.withdraw(amount);
                break;
            default:
                System.out.println("Unsupported transaction type");
        }
    }

    public void executeTransaction(TransactionInterface transaction) {
        transaction.execute();
    }
}
