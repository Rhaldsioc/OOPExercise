package exercise07_Account;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance! - Account.java:20");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account " + accountNumber + " | Balance: " + balance;
    }
}
