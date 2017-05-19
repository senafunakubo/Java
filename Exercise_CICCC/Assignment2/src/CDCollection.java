/**
 * Created by senafunakubo on 2017-05-17.
 */

public class CDCollection {
    private CDMain[] collection;
    private int count;
    private double totalCost;

    //constructor
    public CDCollection(){
        collection= new CDMain[10];
        count = 0;
        totalCost =0.0;
        //If I have time, I need to change double to BigDecimal
    }

    //Add a cd to collection
    public void addCD(String cdTitle, String artistName, int tracks, double price, String genre, int year){
        collection[count] = new CDMain(cdTitle,artistName,tracks,price,genre,year);
        totalCost = totalCost + price;
        count++;
    }

//    public String Mycollection()
//    {
//        System.out.println("");
//        String coll = "\nNumber Of CDs \t"+ count + "\nTOTAL Cost\t\t"+ "$" +totalCost + "\nAVERAGE Cost\t" + "$" + (totalCost/count)+"\n\n";
//        return coll;
//    }

    public String toString()
    {
        String report = "";
        for(int i=0; i<count;i++) {
            report += (i+1)+ ". " + collection[i].Display() + "\n";
        }
        return report;
    }

}