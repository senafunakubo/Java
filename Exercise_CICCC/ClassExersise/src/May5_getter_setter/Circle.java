package May5_getter_setter;

/**
 * Created by senafunakubo on 2017-05-27.
 */
public class Circle {

    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        this.radius = 1;
        this.diameter = 2 * 1;  //直径
        this.area = 1 * 1 * 3.1415;      //面積
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
        this.area = radius * radius * 3.1415;
    }

    public double getRadius() {
        return this.radius;
    }

    public String toString(){
        String circle;
        circle = "Radius: " + this.radius + "  Diameter: " + this.diameter + "  Area: " + this.area;
        return circle;
    }

}
