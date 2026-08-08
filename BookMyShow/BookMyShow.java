package BookMyShow;
import java.util.*;

public class BookMyShow {
    private ArrayList<Theatre> theatres;
    private ArrayList<Movie> movies;

    public BookMyShow(ArrayList<Theatre> theatres, ArrayList<Movie> movies){
        this.theatres = theatres;
        this.movies = movies;
    }

    public ArrayList<Theatre> getAllTheatres(){
        return this.theatres;
    }

    public ArrayList<Movie> getAllMovies(){
        return this.movies;
    }
}
