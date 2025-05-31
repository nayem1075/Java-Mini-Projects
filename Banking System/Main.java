
package BankingSystem;

import java.util.Scanner;

public class Main {
    
          public static void main(String[] args) {
        Bank bank = new Bank("SmartBank", 5);

        // Pre-define 5 accounts
        bank.addAccount(new Account(1001, new Customer("Alice", "01711111111"), 5000));
        bank.addAccount(new Account(1002, new Customer("Bob", "01722222222"), 4000));
        bank.addAccount(new Account(1003, new Customer("Charlie", "01733333333"), 3000));
        bank.addAccount(new Account(1004, new Customer("David", "01744444444"), 2000));
        bank.addAccount(new Account(1005, new Customer("Eva", "01755555555"), 1000));

        ATM atm = new ATM(bank);
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to " + bank.getName());
        System.out.print("Enter your account number: ");
        int accNum = input.nextInt();
        System.out.print("Enter transaction type (deposit/withdraw): ");
        String type = input.next();
        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        atm.performTransaction(accNum, type, amount);

        input.close();
    }
          
}
