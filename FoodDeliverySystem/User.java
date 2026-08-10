package FoodDeliverySystem;
import java.util.*;

public class User {
    private String userId;
    private String userName;
    private Cart cart;
    private Restaurant restaurant = null;
    private FoodDeliverySystem foodDeliverySystem;

    public User(String userId, String userName){
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId(){
        return this.userId;
    }

    public String getUserName(){
        return this.userName;
    }

    public Restaurant selectRestaurant(){
        return this.restaurant;
    }  

    public ArrayList<MenuItem> getAllMenuItems(){
        return this.restaurant.getAllMenuItems();
    }

    public void addItemToCart(MenuItem menuItem){
        cart.addItemToCart(menuItem);
    }

    public void removeItemFromCart(MenuItem menuItem){
        cart.removeItemFromCart(menuItem);
    }

    public Cart getCurrentCart(){
        return this.cart;
    }

    public void placeOrder(Cart cart){
        // resturant object can never be null or cart is not empty
        double totalBill = 0.0;
        for(MenuItem menuItem : cart.getItemsInCart()){
            totalBill += menuItem.getMenuItemPrice();
        }
        Order order = new Order(UUID.randomUUID().toString(), this.userId, this.restaurant.getRestaurantId(), this.cart.getItemsInCart(), totalBill);
        foodDeliverySystem.placeOrder(order,this.restaurant);
    }

    
}
