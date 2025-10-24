package exercise07_Account;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc1 = new Account("001", 1000);
        Account acc2 = new Account("002", 2000);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        acc1.deposit(500);
        acc2.withdraw(1000);

        System.out.println("Accounts in bank: - BankMain.java:16");
        bank.showAccounts();
    }
}
