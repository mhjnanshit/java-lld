package FoodDeliverySystem;

public class DeliveryPartner {
    private String partnerId;
    private String partnerName;
    private Order order;
    private DeliveryPartnerStatus deliveryPartnerStatus;

    public DeliveryPartner(String partnerId, String partnerName){
        this.partnerId = partnerId;
        this.partnerName = partnerName;
        this.deliveryPartnerStatus = DeliveryPartnerStatus.FREE;
    }

    public String getPartnerId(){
        return this.partnerId;
    }

    public String getPartnerName(){
        return this.partnerName;
    }

    public DeliveryPartnerStatus getPartnerStatus(){
        return this.deliveryPartnerStatus;
    }

    public void assignOrder(Order order){
        this.order = order;
        this.deliveryPartnerStatus = DeliveryPartnerStatus.OCCUPIED;
    }

    public void pickUpOrder(){
        this.order.setOrderStatus(OrderStatus.PICKED_UP);
    }

    public void deliverOrder(){
        this.order.setOrderStatus(OrderStatus.DELIVERED);
        this.deliveryPartnerStatus = DeliveryPartnerStatus.FREE;
    }
}
