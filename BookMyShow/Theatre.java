package BookMyShow;
import java.util.*;

public class Theatre {
    private ArrayList<Screen> screens;

    public Theatre(ArrayList<Screen> screens){
        this.screens = screens;
    }

    public void addScreen(Screen screen){
        this.screens.add(screen);
    }
}
