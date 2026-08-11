package MusicPlayer;

public class Song {
    private String songId;
    private String songName;
    private boolean isPlaying;

    public Song(String songId, String songName){
        this.songId = songId;
        this.songName = songName;
        this.isPlaying = false;
    }

    public String getSongId(){
        return this.songId;
    }

    public String getSongName(){
        return this.songName;
    }

    public void playSong(){
        if(this.isPlaying == false){
            this.isPlaying = true;
        }
    }

    public void pauseSong(){
        if(this.isPlaying == true){
            this.isPlaying = false;
        }
    }
}
