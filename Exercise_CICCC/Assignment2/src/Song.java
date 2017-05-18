/**
 * Created by senafunakubo on 2017-05-17.
 */

public class Song {
    private String songTitle;
    private String artist;


    public Song(String songTitle, String artist){
     this.songTitle = songTitle;
     this.artist = artist;

    }

    public String getSongTitle(){
        return this.songTitle;
    }

    public String getArtist(){
        return this.artist;
    }

    public String songDisplay()
    {
        String songDetail;
        songDetail = this.songTitle +"\t\t"+ this.artist;
        return songDetail;
    }
}
