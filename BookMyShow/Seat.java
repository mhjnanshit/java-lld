package BookMyShow;

public class Seat {
    private String seatNo;
    private SeatStatus status;

    public Seat(String seatNo){
        this.seatNo = seatNo;
        this.status = SeatStatus.EMPTY;
    }

    public String getSeatNo(){
        return this.seatNo;
    }

    public SeatStatus getSeatStatus(){
        return this.status;
    }

    public void setSeatStatusFilled(){
        this.status = SeatStatus.FILLED;
    }
}
