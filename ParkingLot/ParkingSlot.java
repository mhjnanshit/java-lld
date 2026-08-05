package ParkingLot;

public class ParkingSlot {
    private String slotId;
    private ParkingSlotType slotType;
    private ParkingSlotStatus status;
    private int floor;
    private Vehicle vehicle = null;

    public ParkingSlot(String slotId, ParkingSlotType slotType, ParkingSlotStatus status, int floor){
        this.slotId = slotId;
        this.slotType = slotType;
        this.status = status;
        this.floor = floor;
    }

    public String getSlotId(){
        return this.slotId;
    }

    public ParkingSlotType getSlotType(){
        return this.slotType;
    }

    public ParkingSlotStatus getSlotStatus(){
        return this.status;
    }

    public int getFloor(){
        return this.floor;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public boolean isCompatible(Vehicle vehicle){
        if(vehicle.getVehicleType() == VehicleType.BIKE){
            return true;
        }
        else if(vehicle.getVehicleType() == VehicleType.CAR){
            if(getSlotType() == ParkingSlotType.MEDIUM || getSlotType() == ParkingSlotType.LARGE){
                return true;
            }
        }
        else{
            if(getSlotType() == ParkingSlotType.LARGE){
                return true;
            }
        }

        return false;
    }

    public boolean assignSlot(Vehicle vehicle){
        if(getSlotStatus() != ParkingSlotStatus.EMPTY) return false;
        this.vehicle = vehicle;
        this.status = ParkingSlotStatus.FILLED;
        return true;
    }

    public boolean vacateSlot(){
        if(getSlotStatus() != ParkingSlotStatus.FILLED) return false;
        this.vehicle = null;
        this.status = ParkingSlotStatus.EMPTY;
        return true;
    }

}
