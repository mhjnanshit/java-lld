package FoodDeliverySystem;
import java.util.*;

public class Restaurant {
    private String restaurantId;
    private String restaurantName;
    private ArrayList<MenuItem> menuItems;

    public Restaurant(String restaurantId, String restaurantName, ArrayList<MenuItem> menuItems){
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.menuItems = menuItems;
    }

    public String getRestaurantId(){
        return this.restaurantId;
    }

    public String getRestaurantName(){
        return this.restaurantName;
    }

    public ArrayList<MenuItem> getAllMenuItems(){
        return this.menuItems;
    }

    public OrderStatus acceptOrder(Order order){
        order.setOrderStatus(OrderStatus.ACCEPTED);
        return OrderStatus.ACCEPTED;
    }

    public OrderStatus rejectOrder(Order order){
        order.setOrderStatus(OrderStatus.REJECTED);
        return OrderStatus.REJECTED;
    }

    public OrderStatus processOrder(Order order){
        // Can accept or reject order
        return acceptOrder(order);
    } 


}
