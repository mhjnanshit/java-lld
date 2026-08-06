package ParkingLot;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private TicketStatus status;
    private ParkingSlot slot;

    public Ticket(String ticketId){
        this.ticketId = ticketId;
        // Assigning will happening in issueTicket();
    }

    public String getTicketId(){
        return this.ticketId;
    }

    public TicketStatus getTicketStatus(){
        return this.status;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public ParkingSlot getSlot(){
        return this.slot;
    }

    public boolean issueTicket(Vehicle vehicle, ParkingSlot slot){
        this.vehicle = vehicle;
        this.slot = slot;
        this.status = TicketStatus.PARKED;
        return true;
    }

    public boolean exitVehicle(){
        this.status = TicketStatus.EXITED;
        return true;
    }

}
