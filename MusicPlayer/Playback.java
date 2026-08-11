package MusicPlayer;
import java.util.*;

public class Playback {
    private Playlist playlist;
    private boolean loopEnabled;
    private List<Song> playbackQueue;
    private int currIndex;

    public Playback(Playlist playlist){
        this.playlist = playlist;
        this.loopEnabled = false;
        this.currIndex = 0;
        for(Song song: playlist.getSongs()){
            playbackQueue.add(song);
        }
    }

    public void shufflePlayback(){
        Collections.shuffle(playbackQueue);
        this.currIndex = 0;
        playSong();
    }

    public void enableLoop(){
        this.loopEnabled = true;
    }

    public void playSong(){
        Song song = playbackQueue.get(currIndex);
        song.playSong();
    }

    public void pauseSong(){
        Song song = playbackQueue.get(currIndex);
        song.pauseSong();
    }

    public void playNextSong(){
        if(currIndex == playbackQueue.size() - 1 && this.loopEnabled == false) return;
        this.currIndex = (this.currIndex + 1) % playbackQueue.size();
        Song song = playbackQueue.get(currIndex);
        song.playSong(); 
    }

    public void playPreviousSong(){
        if(currIndex == 0 && this.loopEnabled == false) return;
        this.currIndex = playbackQueue.size() - 1;
        Song song = playbackQueue.get(currIndex);
        song.playSong();
    }
}
