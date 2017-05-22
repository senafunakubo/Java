import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-18.
 */
public class WriteCDFile {

    private static ArrayList<Song> songListOfStarboy;
    private static ArrayList<Song> songListOfAeDil;
    ArrayList<CD> cdArray;

    public ArrayList<CD> getCdArray() {
        return this.cdArray;
    }

    public ArrayList<Song[]> getSongArray() {
        ArrayList<Song[]> songArray = new ArrayList<Song[]>();
        return songArray;
    }

    public void addCDAndSong(){

//     // Starboy
//        Song songSt1 = new Song("Starboy","The Weeknd",3.50);
//        Song songSt2 = new Song("Party Monster","The Weeknd",4.04);
//        Song songSt3 = new Song("False Alarm","The Weeknd",3.40);
//        Song songSt4 = new Song("Reminder","The Weeknd",3.38);
//        Song songSt5 = new Song("Rockin'","The Weeknd",3.52);
//        Song songSt6 = new Song("Secrets","The Weeknd",4.25);
//        Song songSt7 = new Song("True Colors","The Weeknd",3.26);
//        Song songSt8 = new Song("Stargirl Interlude","The Weeknd , Lana Del Rey",1.51);
//        Song songSt9 = new Song("Sidewalks","The Weeknd , Kendrick Lamar",3.51);
//        Song songSt10 = new Song("Six Feet Under","The Weeknd",3.57);
//        Song songSt11 = new Song("Love To Lay","The Weeknd",3.43);
//        Song songSt12 = new Song("A Lonely Night", "The Weeknd",3.40);
//        Song songSt13 = new Song("Attention","The Weeknd",3.17);
//        Song songSt14 = new Song("Ordinary Life","The Weeknd",3.41);
//        Song songSt15 = new Song("Nothing Without You","The Weeknd", 3.18);
//        Song songSt16 = new Song("All I Know","The Weeknd , Future", 5.21);
//        Song songSt17 = new Song("Die For You", "The Weeknd",4.20);
//        Song songSt18 = new Song("I Feel It Coming", "The Weeknd , Daft Punk", 4.29);
//
//        ArrayList<Song> songListOfStarboy = new ArrayList<Song>();
//
//        songListOfStarboy.add(songSt1);
//        songListOfStarboy.add(songSt2);
//        songListOfStarboy.add(songSt3);
//        songListOfStarboy.add(songSt4);
//        songListOfStarboy.add(songSt5);
//        songListOfStarboy.add(songSt6);
//        songListOfStarboy.add(songSt7);
//        songListOfStarboy.add(songSt8);
//        songListOfStarboy.add(songSt9);
//        songListOfStarboy.add(songSt10);
//        songListOfStarboy.add(songSt11);
//        songListOfStarboy.add(songSt12);
//        songListOfStarboy.add(songSt13);
//        songListOfStarboy.add(songSt14);
//        songListOfStarboy.add(songSt15);
//        songListOfStarboy.add(songSt16);
//        songListOfStarboy.add(songSt17);
//        songListOfStarboy.add(songSt18);
//
//        CD cdStarboy = new CD(songListOfStarboy,"Starboy","The Weeknd", 18, 12.88, "R&B", 2016);
//
//
//
//     //Ae Dil Hai Mushkil
//        Song songAe1 = new Song("Ae Dil Hai Mushkil","Pritam , Arijit Singh",4.28);
//        Song songAe2 = new Song("Bulleya","Pritam , Amit Mishra , Shilpa Rao",5.48);
//        Song songAe3 = new Song("Channa Mereya","Pritam , Arijit Singh", 4.49);
//        Song songAe4 = new Song("The Breakup Song","Pritam , Arijit Singh , Badshah , Jonita Gandhi , Nakash Aziz",4.12);
//        Song songAe5 = new Song("Cutiepie","Pritam , Pardeep Singh Sran , Nakash Aziz", 3.51);
//        Song songAe6 = new Song("Alizeh", "Pritam , Arijit Singh , Ash King , Shashwat Singh",4.42);
//
//        ArrayList<Song> songListOfAeDil = new ArrayList<Song>();
//
//        songListOfAeDil.add(songAe1);
//        songListOfAeDil.add(songAe2);
//        songListOfAeDil.add(songAe3);
//        songListOfAeDil.add(songAe4);
//        songListOfAeDil.add(songAe5);
//        songListOfAeDil.add(songAe6);
//
//        CD cdAeDilHai = new CD(songListOfAeDil,"Ae Dil Hai Mushkil","Various",6,9.75,"SoundTrack",2016);
//
//        this.cdArray = new ArrayList<CD>();
//        this.cdArray.add(cdStarboy);
//        this.cdArray.add(cdAeDilHai);

    }

    public static void write() {
            BufferedWriter bw = null;
            try {

                CDCollection music = new CDCollection();
                music.addCD(songListOfStarboy,"Starboy", "The Weeknd", 18, 12.88, "R&B", 2016);
                music.addCD(songListOfAeDil,"Ae Dil Hai Mushkil", "Various", 6, 9.75, "SoundTrack", 2016);


                String myContent = music.toString();


                //Specify the file name and path here
                File file = new File("cd.txt");

                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write(myContent);
                System.out.println("");


            } catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {
                try {
                    if (bw != null) {
                        bw.close();
                    }
                } catch (Exception ex) {
                    System.out.println("Error in closing the BufferedWriter" + ex);
                }
            }
        }




    public void selectSongs() {

        for(CD cd:cdArray) {
            for(Song song: cd.getSongArray()) {
                System.out.println(song);
            }
        }
    }


}
