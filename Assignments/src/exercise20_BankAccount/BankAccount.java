package exercise20_BankAccount;

public class BankAccount {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance! - BankAccount.java:22");
        }
    }

    public void showBalance() {
        System.out.println(holderName + "'s Balance: - BankAccount.java:27" + balance);
    }
}
 
