/**
 * Created by senafunakubo on 2017-05-17.
 */

import java.util.ArrayList;

public class CD {
    private ArrayList<Song> songArray;
    private String cdTitle;
    private String artistName;
    private int tracks;
    private Double price;
    private String genre;
    private int year;


    public CD(ArrayList<Song>songArray, String cdTitle, String artistName, int tracks, double price, String genre, int year){
        this.songArray = songArray;
        this.cdTitle = cdTitle;
        this.artistName = artistName;
        this.tracks = tracks;
        this.price = price;
        this.genre = genre;
        this.year = year;
    }


    public ArrayList<Song> getSongArray() {
        return songArray;
    }

//    public void setSongArray(ArrayList<Song> songArray){
//        this.songArray = songArray;
//    }

    public String getCdTitle(){
        return this.cdTitle;
    }

//    public void setCdTitle(String cdTitle){
//        this.cdTitle = cdTitle;
//    }

    public String getArtistName(){
        return this.artistName;
    }

//    public void setArtistName(String artistName){
//        this.artistName = artistName;
//    }

    public int getTracks(){
        return this.tracks;
    }

//    public void setTracks(int tracks){
//        this.tracks = tracks;
//    }

    public double getPrice(){
        return this.price;
    }

//    public void setPrice(double price){
//        this.price = price;
//    }

    public String getGenre(){
        return this.genre;
    }

//    public void setGenre(String genre){
//        this.genre = genre;
//    }

    public int getYear(){
        return this.year;
    }

//    public void setYear(int year){
//        this.year = year;
//    }


    public void Display()
    {
        System.out.println(this.cdTitle +"\t"+ this.artistName + "\n" + this.genre + "\t$" + this.price + "\t" + this.tracks + "songs\t" + this.year +"\n");
    }

    public String displayForFile()
    {
        String album = "";
        album = this.cdTitle +"\t"+ this.artistName + "\n" + this.genre + "\t$" + this.price + "\t" + this.tracks + "songs\t" + this.year +"\n";
        return album;
    }

}
