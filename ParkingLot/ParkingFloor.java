package ParkingLot;
import java.util.*;

public class ParkingFloor {
    private int floor;
    private List<ParkingSlot> slots = new ArrayList<>();

    public ParkingFloor(int floor){
        this.floor = floor;
    }

    public int getFloor(){
        return this.floor;
    }

    public void addSlot(ParkingSlot slot){
        slots.add(slot);
    }

    public ParkingSlot findSlot(Vehicle vehicle){
        for(ParkingSlot slot : slots){
            if(slot.getSlotStatus() == ParkingSlotStatus.EMPTY && slot.isCompatible(vehicle)){
                slot.assignSlot(vehicle);
                return slot;
            }
        }
        return null;
    }   
}
