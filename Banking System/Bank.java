
package BankingSystem;

   import java.util.ArrayList;

public class Bank {
  private String name;
    private Account[] accounts;
    private int totalAccounts = 0;

    public Bank(String name, int size) {
        this.name = name;
        accounts = new Account[size];
    }

    public void addAccount(Account acc) {
        if (totalAccounts < accounts.length) {
            accounts[totalAccounts++] = acc;
        }
    }

    public Account getAccountByNumber(int accNumber) {
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].getAccountNumber() == accNumber) {
                return accounts[i];
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
    
}
