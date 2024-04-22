public class BankCustomer {
    private String firstName;
    private String lastName;
    private String accountNumber;
    private double balance;

    public BankCustomer(String firstName, String lastName, String accountNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
    class BankCustomerBuilder {
        private String firstName;
        private String lastName;
        private String accountNumber;
        private double balance;

        public BankCustomerBuilder() {}

        public BankCustomerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public BankCustomerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public BankCustomerBuilder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public BankCustomerBuilder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public BankCustomer build() {
            return new BankCustomer(firstName, lastName, accountNumber, balance);
        }
    }