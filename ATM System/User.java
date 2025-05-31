
package ATM;


public class User {
    
    private String name;
    private String cardNumber;
    private String pin;
    private BankAccount account;

    public User(String name, String cardNumber, String pin, BankAccount account) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }
    
        public boolean checkPin(String inputPin) {
        return pin.equals(inputPin);
    }
}

