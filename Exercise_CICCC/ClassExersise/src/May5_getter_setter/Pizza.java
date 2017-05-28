package May5_getter_setter;

/**
 * Created by senafunakubo on 2017-05-27.
 */
public class Pizza {

    private String toppings;
    private int diameter;
    private double price;


    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getToppings() {
        return this.toppings;
    }
    public int getDiameter() {
        return this.diameter;
    }
    public double getPrice() {
        return this.price;
    }
}
