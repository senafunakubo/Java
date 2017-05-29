package May24_Iterators;

/**
 * Created by senafunakubo on 2017-05-29.
 */
import java.util.Comparator;

public class Fruits implements Comparable<Fruits>{

    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruits(String fruitName, String fruitDesc, int quantity) {
        super();
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }

    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    public String getFruitDesc() {
        return fruitDesc;
    }
    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int compareTo(Fruits compareFruit) {

        int compareQuantity = ((Fruits) compareFruit).getQuantity();

        //ascending order
        return this.quantity - compareQuantity;

        //descending order
        //return compareQuantity - this.quantity;

    }

    public static Comparator<Fruit> FruitNameComparator
            = new Comparator<Fruit>() {

        public int compare(Fruit fruit1, Fruit fruit2) {

            String fruitName1 = fruit1.getFruitName().toUpperCase();
            String fruitName2 = fruit2.getFruitName().toUpperCase();

            //ascending order
            return fruitName1.compareTo(fruitName2);

            //descending order
            //return fruitName2.compareTo(fruitName1);
        }

    };
}
