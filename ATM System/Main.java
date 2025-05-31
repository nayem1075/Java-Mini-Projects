
package ATM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Welcome to Simple ATM System ===");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter card number: ");
        String cardNumber = input.nextLine();

        System.out.print("Set a 4-digit PIN: ");
        String pin = input.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double initialBalance = input.nextDouble();

        Bank bank = new Bank("EasyBank");
        BankAccount account = new BankAccount(cardNumber, initialBalance);
        User user = new User(name, cardNumber, pin, account);

        ATM atm = new ATM();
        atm.startATM(user);

        input.close();
    }
}

