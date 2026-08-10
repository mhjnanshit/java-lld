package FoodDeliverySystem;

public class MenuItem {
    private String itemName;
    private double price;

    public MenuItem(String itemName, double price){
        this.itemName = itemName;
        this.price = price;
    }

    public String getMenuItemName(){
        return this.itemName;
    }

    public double getMenuItemPrice(){
        return this.price;
    }
}
