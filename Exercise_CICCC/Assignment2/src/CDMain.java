/**
 * Created by senafunakubo on 2017-05-17.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CDMain {
    private String cdTitle;
    private String artistName;
    private int tracks;
    private Double price;
    private String genre;
    private int year;

    public CDMain(String cdTitle, String artistName, int tracks, double price, String genre, int year){
        this.cdTitle = cdTitle;
        this.artistName = artistName;
        this.tracks = tracks;
        this.price = price;
        this.genre = genre;
        this.year = year;
    }

    public String getcdTitle(){
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


//    public void writeFile(String file, List<CDMain> cds) throws IOException {
//        PrintWriter pw = null;
//        try {
//            pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
//            for (CDMain cd : cds) {
//                pw.print(cd.cdTitle);
//                pw.print(cd.artistName);
//                pw.print(cd.tracks);
//                pw.print(cd.price);
//                pw.print(cd.genre);
//                pw.print(cd.year);
//            }
//        } finally {
//            if (pw != null) {
//                pw.close();
//            }
//        }
//    }
//
//    public void addCD(String file_name, List<CDMain> cds, String cdTitle, String artistName, int tracks, double price, String genre, int year)
//            throws IOException {
//        String id = "List:" + (cds.size() + 1);
//        CDMain cd = new CDMain(cdTitle, artistName, tracks, price, genre, year);
//        System.out.print(id + "/t");
//        cds.add(cd);
//        writeFile(file_name, cds);
//    }
//
//    private void showWholeCDs(List<CDMain> list) {
//        for (CDMain cd : list) {
//            System.out.print(cd.getcdTitle());
//            System.out.print(cd.getArtistName());
//            System.out.print(cd.getTracks());
//            System.out.print(cd.getPrice());
//            System.out.print(cd.getGenre());
//            System.out.print(cd.getYear());
//        }
//    }


    public String Display()
    {
        String desc;
        desc = this.cdTitle +"\t"+ this.artistName + "\n" + this.genre + "\t$" + this.price + "\t" + this.tracks + "songs\t" + this.year +"\n";
        return desc;
    }

}
