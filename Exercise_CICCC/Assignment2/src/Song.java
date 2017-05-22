/**
 * Created by senafunakubo on 2017-05-17.
 */

public class Song {
    private String songTitle;
    private String artist;
    private double songTime;


    public Song(String songTitle, String artist, double songTime){
     this.songTitle = songTitle;
     this.artist = artist;
     this.songTime = songTime;

    }

    public String getSongTitle(){
        return this.songTitle;
    }

    public String getArtist(){
        return this.artist;
    }

    public double getSongTime(){
        return this.songTime;
    }

    public String songDisplay()
    {
        String songDetail;
        songDetail = this.songTitle +"\t\t"+ this.artist + "\t" + this.songTime;
        return songDetail;
    }
}
