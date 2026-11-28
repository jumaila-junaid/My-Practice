// BankAccount class using encapsulation.

public class BankAccount {
    // private, so they can only be changed through methods
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // returns the value
    public int getAccountNumber() {
        return accountNumber;
    }

    // sets the value
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // returns the value
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // sets the value
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // returns the value
    public double getBalance() {
        return balance;
    }

    // sets the value
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // deposit only if the amount is more than 0
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // withdraw only if the amount is valid and the balance is enough
    public void withdraw(double amount) {
        // amount must be more than 0
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

}