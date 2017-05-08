package com.example.java;

/**
 * Created by senafunakubo on 2017-05-07.
 */

public class Service {

    private String description;
    private float price;
    private int time;

    //The constructor method
    public Service(String description, float price, int time)
    {
        this.description = description;
        this.price = price;
        this.time = time;
    }

    public String getDescription()
    {
        return this.description;
    }

    public float getPrice()
    {
        return this.price;
    }

    public int getTime()
    {
        return this.time;
    }

    @Override
    public String toString() {
        return this.description + ", " + this.price + ", " +this.time;
    }

//    public void displayServiceDetails()
//    {
//        System.out.println("Service description: " + description);
//        System.out.println("Service price: $" + price);
//        System.out.println("Service time: " + time + "m");
//    }

    public static void main(String[] args)
    {
//       Service cut = new Service("Cut",8.00f,15);
//       Service shampoo = new Service("Shampoo",4.00f,10);
//       Service manicure = new Service("Manicure",18.00f,30);
//       Service style = new Service("Style",48.00f,55);
//       Service permanent = new Service("Permanent",18.00f,35);
//       Service trim = new Service("Trim",6.00f,5);
//
//       cut.displayServiceDetails();
//       shampoo.displayServiceDetails();
//       manicure.displayServiceDetails();
//       style.displayServiceDetails();
//       permanent.displayServiceDetails();
//       trim.displayServiceDetails();
    }
}
