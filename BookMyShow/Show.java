package BookMyShow;
import java.util.*;
import java.time.LocalDateTime;

public class Show {
    private Movie movie;
    private Screen screen;
    private LocalDateTime startTime;
    private ArrayList<Seat> seats;
    private HashMap<String,Booking> bookings;

    public Show(Movie movie, Screen screen, LocalDateTime startTime){
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        seats = new ArrayList<>();
        bookings = new HashMap<>();
    }

    public String getMovie(){
        return this.movie.getMovieName();
    }

    public int getScreenNo(){
        return this.screen.getScreenNo();
    }

    public LocalDateTime getStartTime(){
        return this.startTime;
    }

    public ArrayList<Seat> areSeatsAvailable(int totalSeats){
        ArrayList<Seat> allotedSeats = new ArrayList<>();
        for(Seat seat : seats){
            if(seat.getSeatStatus() == SeatStatus.EMPTY) allotedSeats.add(seat);
            if(allotedSeats.size() == totalSeats) return allotedSeats;
        }
        return allotedSeats;
    }

    public void markSeatsFilled(ArrayList<Seat> allotedSeats){
        for(Seat seat : allotedSeats){
            seat.setSeatStatusFilled();
        }
    }

    public Booking bookSeats(User user, int totalSeats){
        ArrayList<Seat> allotedSeats = areSeatsAvailable(totalSeats);
        if(allotedSeats.size() < totalSeats) return null;

        markSeatsFilled(allotedSeats);
        String bookingId = UUID.randomUUID().toString();
        Booking newBooking = new Booking(bookingId, user, this, allotedSeats);
        addBooking(bookingId,newBooking);
        return newBooking;
    }

    public void addBooking(String bookingId, Booking booking){
        this.bookings.put(bookingId,booking);
    }

    public boolean cancelBooking(String bookingId){
        if(!bookings.containsKey(bookingId)) return false;
        bookings.remove(bookingId);
        return true;
    }

}
