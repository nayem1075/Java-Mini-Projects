
package ATM;

import java.util.Scanner;

public class ATM {

    private Scanner input = new Scanner(System.in);

    public void startATM(User user) {
        System.out.println("Welcome to the ATM!");

        System.out.print("Enter your PIN: ");
        String enteredpin = input.nextLine();

        if (!user.checkPin(enteredpin)) {
            System.out.println("Incorrect PIN. Access Denied.");
            return;
        }

        System.out.println("Login successful. Hello, " + user.getName());

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + user.getAccount().getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    user.getAccount().deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    if (user.getAccount().withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Card ejected.");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
