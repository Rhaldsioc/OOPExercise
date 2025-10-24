package exercise07_Account;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void removeAccount(String accNum) {
        accounts.removeIf(a -> a.toString().contains(accNum));
    }

    public void showAccounts() {
        for (Account a : accounts) {
            System.out.println(a);
        }
    }
}
