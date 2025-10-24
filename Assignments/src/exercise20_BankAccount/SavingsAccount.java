package exercise20_BankAccount;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accNum, String name, double balance, double interestRate) {
        super(accNum, name, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * (interestRate / 100);
    }
}
