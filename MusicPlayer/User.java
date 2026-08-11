package MusicPlayer;
import java.util.*;
public class User {
    private String userId;
    private List<Playlist> playlists;
    private Playback playback;

    public User(String userId){
        this.userId = userId;
        this.playlists = new ArrayList<>();
    }

    public String getUserId(){
        return this.userId;
    }

    public void createPlaylist(Playlist playlist){
        playlists.add(playlist);
    }

    public void deletePlaylist(Playlist playlist){
        playlists.remove(playlist);
    }

    public Playback playPlaylist(Playlist playlist){
        Playback newPlayback = new Playback(playlist);
        this.playback =  newPlayback;
        return playback;
    }
}
