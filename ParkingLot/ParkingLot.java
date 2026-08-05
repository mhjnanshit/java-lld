package ParkingLot;
import java.util.*;

public class ParkingLot {
    private List<ParkingFloor> floors = new ArrayList<>();
    private Map<String,Ticket> tickets = new HashMap<>();

    public void addFloor(ParkingFloor floor){
        floors.add(floor);
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingFloor floor : floors){
            ParkingSlot slot = floor.findSlot(vehicle);
            if(slot != null){
                String ticketId = UUID.randomUUID().toString();
                Ticket ticket = new Ticket(ticketId);
                ticket.issueTicket(vehicle,slot);
                tickets.put(ticketId,ticket);
                return true;
            }
        }
        return false;
    }

    public boolean exitVehicle(Ticket ticket){
        if(!tickets.containsKey(ticket.getTicketId())){
            return false;
        }
        if(tickets.get(ticket.getTicketId()).getTicketStatus() == TicketStatus.EXITED){
            return false;
        }

        ParkingSlot slot = ticket.getSlot();
        boolean slotVacated = slot.vacateSlot();
        if(!slotVacated){
            return false;
        }
        ticket.exitVehicle();
        return true;
    }
}
