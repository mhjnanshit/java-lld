package ParkingLot;

public class Vehicle {
    private String vehicleNum;
    private VehicleType type;

    public Vehicle(String vehicleNum, VehicleType type){
        this.vehicleNum = vehicleNum;
        this.type = type;
    }

    public String getVehicleNumber(){
        return this.vehicleNum;
    }

    public VehicleType getVehicleType(){
        return this.type;
    }
}
