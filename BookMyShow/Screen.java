package BookMyShow;
import java.util.*;

public class Screen {
    private int screenNo;
    private ArrayList<Show> shows;

    public Screen(int screenNo){
        this.screenNo = screenNo;
        this.shows = new ArrayList<>();
    }

    public int getScreenNo(){
        return this.screenNo;
    }

    public void addShow(Show show){
        this.shows.add(show);
    }
    
    public void removeShow(Show show){
        this.shows.remove(show);
    }
}
