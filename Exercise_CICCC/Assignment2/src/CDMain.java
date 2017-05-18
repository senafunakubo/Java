/**
 * Created by senafunakubo on 2017-05-17.
 */

public class CDMain {
    private String title;
    private int tracks;
    private Double price;
    private String genre;
    private int year;

    public CDMain(String title, int tracks, double price, String genre, int year){
        this.title = title;
        this.tracks = tracks;
        this.price = price;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }

    public int getTracks(){
        return this.tracks;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getYear(){
        return this.year;
    }

    public String Display()
    {
        String desc;
        desc = this.title +"\n"+ this.genre + "\t\t$" + this.price + "\t" + this.tracks + "songs\t\t" + this.year +"\n";
        return desc;
    }

}
