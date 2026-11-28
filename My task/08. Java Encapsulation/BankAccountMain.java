// Main class to test the BankAccount class.

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // set account details using setters
        account.setAccountNumber(1001);
        account.setAccountHolderName("Jumaila");
        account.setBalance(0);

        account.deposit(5000);
        account.withdraw(2000);

        // show the updated details
        account.displayAccountDetails();

    }
}
