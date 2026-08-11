package MusicPlayer;
import java.util.*;

public class Playlist {
    private String playlistId;
    private String playlistName;
    private List<Song> songs;

    public Playlist(String playlistId, String playlistName){
        this.playlistId = playlistId;
        this.playlistName = playlistName;
        this.songs = new ArrayList<>();
    }

    public String getPlaylistId(){
        return this.playlistId;
    }

    public String getPlaylistName(){
        return this.playlistName;
    }

    public List<Song> getSongs(){
        return this.songs;
    }

    public void addSongToPlaylist(Song song){
        this.songs.add(song);
    }

    public void removeSongFromPlaylist(Song song){
        this.songs.remove(song);
    }

}
