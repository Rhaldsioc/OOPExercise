package exercise20_BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("001", "Bob", 1000, 5);
        sa.showBalance();
        sa.deposit(500);
        sa.applyInterest();
        sa.showBalance();
    }
}
