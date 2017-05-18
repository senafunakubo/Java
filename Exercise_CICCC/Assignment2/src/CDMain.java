/**
 * Created by senafunakubo on 2017-05-17.
 */

public class CDMain {
    private String cdTitle;
    private int tracks;
    private Double price;
    private String genre;
    private int year;

    public CDMain(String cdTitle, int tracks, double price, String genre, int year){
        this.cdTitle = cdTitle;
        this.tracks = tracks;
        this.price = price;
        this.genre = genre;
        this.year = year;
    }

    public String getcdTitle(){
        return this.cdTitle;
    }

    public void setCdTitle(String cdTitle){
        this.cdTitle = cdTitle;
    }

    public int getTracks(){
        return this.tracks;
    }

    public void setTracks(int tracks){
        this.tracks = tracks;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String Display()
    {
        String desc;
        desc = this.cdTitle +"\n"+ this.genre + "\t\t$" + this.price + "\t" + this.tracks + "songs\t\t" + this.year +"\n";
        return desc;
    }

}
