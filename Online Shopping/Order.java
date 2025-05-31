
package OnlineShopping;

public class Order {
   
    private User user;
    private Cart cart;
    
    public Order(User user, Cart cart) {
        this.user = user;
        this.cart = cart;
    }
    public void showOrder() {
        System.out.println(user.getName() + " ordered " + cart.getProduct().getName() +
                           " for " + cart.getProduct().getPrice() + " Taka.");
        System.out.println("Order confirmed! Thank you for shopping with us.");
    }
    
}
