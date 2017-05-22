/**
 * Created by senafunakubo on 2017-05-17.
 */
public class Songlist {
    private Song[] songs;
    private int count;

    //constructor
    public Songlist()
    {
        songs= new Song[10];
        count = 0;
    }


    public void addsongs(String songTitle, String artist, double songTime)
    {
       songs[count] = new Song(songTitle,artist,songTime);
       count++;
    }


    public String songDetails(){
        System.out.println("");
        String songDetail = "** Songs list **" + "\n\n";

        for(int i=0; i<count;i++) {
            songDetail += i+1 + "." + songs[i].songDisplay() + "\n";
        }
        return songDetail;
    }

}
