package FoodDeliverySystem;
import java.util.*;

public class FoodDeliverySystem {
    ArrayList<User> users;
    ArrayList<Restaurant> restaurants;
    ArrayList<DeliveryPartner> deliveryPartners;

    public FoodDeliverySystem(ArrayList<User> users, ArrayList<Restaurant> restaurants, ArrayList<DeliveryPartner> deliveryPartners){
        this.users = users;
        this.restaurants = restaurants;
        this.deliveryPartners = deliveryPartners;
    }

    public OrderStatus assignOrderToRestaurant(Order order, Restaurant restaurant){
        return restaurant.processOrder(order);
    }

    public void placeOrder(Order order, Restaurant restaurant){
        OrderStatus status =  assignOrderToRestaurant(order,restaurant);
        if(status == OrderStatus.ACCEPTED){
            assignDeliveryPartner(order);
        }
    }

    public void assignDeliveryPartner(Order order){
        for(DeliveryPartner deliveryPartner : deliveryPartners){
            if(deliveryPartner.getPartnerStatus() == DeliveryPartnerStatus.FREE){
                deliveryPartner.assignOrder(order);
                return;
            }
        }
    }

}
