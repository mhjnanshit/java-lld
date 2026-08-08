package BookMyShow;
import java.util.*;

public class Booking {
    private String bookingId;
    private User user;
    private Show show;
    private ArrayList<Seat> seats;

    public Booking(String bookingId, User user, Show show, ArrayList<Seat> seats){
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
        this.seats = seats;
    }

    public String getBookingId(){
        return this.bookingId;
    }

    public String getUser(){
        return this.user.getUserId(); // Can also return name
    }

    public int getShowScreen(){
        return this.show.getScreenNo();
    }

    public ArrayList<Seat> getBookedSeats(){
        return this.seats;
    }


}
