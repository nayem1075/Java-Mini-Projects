
package BankingSystem;

public class ATM {
    
     private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void performTransaction(int accNumber, String type, double amount) {
        Account acc = bank.getAccountByNumber(accNumber);
        if (acc != null) {
            System.out.println("Customer: " + acc.getCustomer().getName());
            if (type.equalsIgnoreCase("deposit")) {
                acc.deposit(amount);
            } else if (type.equalsIgnoreCase("withdraw")) {
                acc.withdraw(amount);
            } else {
                System.out.println("Invalid transaction type.");
            }
            System.out.println("Current Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
    
}
