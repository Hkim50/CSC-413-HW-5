public class Driver {
    public static void main(String[] args) {

        BankCustomer customer = new BankCustomerBuilder()
                    .setFirstName("Gator")
                    .setLastName("SFSU")
                    .setAccountNumber("123456789")
                    .setBalance(1500.0)
                    .build();

        System.out.println("First Name: " + customer.getFirstName());
        System.out.println("Last Name: " + customer.getLastName());
        System.out.println("Account Number: " + customer.getAccountNumber());
        System.out.println("Balance: " + customer.getBalance());
    }
    
}
