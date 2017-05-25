/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author senafunakubo
 */

public class Pizza{

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
    
//    public void setPizza(String pizzaToppings, int pizzaDiameter , double pizzaPrice)
//    {
//       this.toppings = pizzaToppings;
//       this.diameter = pizzaDiameter;
//       this.price = pizzaPrice;
//    }
//    
//    public String getPizza()
//    { 
//        String Pizza;
//        Pizza = this.toppings + this.diameter + this.price;
//        return Pizza;
//    } 

}