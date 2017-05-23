/**
 * Created by senafunakubo on 2017-05-11.
 */

public class DemoSquare {
    public static void main(String[] args)
    {
        Square square1 = new Square();
        square1.setHeight(10);
        square1.setWidth(50);
        System.out.println("This surface area of square is " + square1.computeSurfaceArea() + ".");

        Cube cube1 = new Cube();
        cube1.setHeight(10);
        cube1.setWidth(20);
        cube1.setDepth(30);
        System.out.println("This surface area of cube is " + cube1.computeSurfaceArea() + ".");
    }
}
