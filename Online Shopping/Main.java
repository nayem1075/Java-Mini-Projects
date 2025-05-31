
package OnlineShopping;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         
        Product[] products = {
            new Product("Laptop", 50000),
            new Product("iPhone", 70000),
            new Product("Computer", 40000),
            new Product("Android Phone", 30000),
            new Product("Smart Watch", 15000)
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        User user = new User(userName);

        System.out.println("Available products:");
        for (Product p : products) {
            System.out.println("- " + p.getName() + " (" + p.getPrice() + " Taka)");
        }

        System.out.print("Enter the product name you want to buy: ");
        String chosenProductName = input.nextLine();

        Product chosenProduct = null;
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(chosenProductName)) {
                chosenProduct = p;
                break;
            }
        }

        if (chosenProduct != null) {
            Cart cart = new Cart(chosenProduct);
            Order order = new Order(user, cart);
            order.showOrder();
            System.out.println("Your order has been placed successfully!");
        } else {
            System.out.println("Sorry! Product not available.");
        }

        input.close();
    } 
}
