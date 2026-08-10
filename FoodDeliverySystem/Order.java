package FoodDeliverySystem;
import java.util.*;

public class Order {
    private String orderId;
    private String userId;
    private String restaurantId;
    private ArrayList<MenuItem> items;
    private double totalBill;
    private OrderStatus orderStatus;

    public Order(String orderId, String userId, String restaurantId, ArrayList<MenuItem> items, double totalBill){
        this.orderId = orderId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.items = items;
        this.totalBill = totalBill;
        this.orderStatus = OrderStatus.PLACED;
    }

    public String getOrderId(){
        return this.orderId;
    }

    public String getUserId(){
        return this.userId;
    }

    public String getRestaurantId(){
        return this.restaurantId;
    }

    public OrderStatus getOrderStatus(){
        return this.orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus){
        this.orderStatus = orderStatus;
    }
}
