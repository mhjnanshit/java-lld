package FoodDeliverySystem;
import java.util.*;

public class Cart {
    private ArrayList<MenuItem> items;

    public Cart(){
        this.items = new ArrayList<>(); 
    }

    public void addItemToCart(MenuItem item){
        items.add(item);
    }
    
    public void removeItemFromCart(MenuItem item){
        items.remove(item);
    }

    public ArrayList<MenuItem> getItemsInCart(){
        return this.items;
    }
}
