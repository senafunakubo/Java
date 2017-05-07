/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author senafunakubo
 */
public class Circle {
    
    private int radius;
    private double diameter;
    private double area;

    public Circle() {
        this.radius = 1;
        this.diameter = 2 * 1 * 3.1415;
        this.area = 1 * 1 * 3.1415;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        this.diameter = 2 * radius * 3.1415;
        this.area = radius * radius * 3.1415;
    }

    public int getRadius() {
        return this.radius;
    }
}
