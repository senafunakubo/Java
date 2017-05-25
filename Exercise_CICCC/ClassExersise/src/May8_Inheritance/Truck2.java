package May8_Inheritance;

public class Truck2 extends Car {
    public void m1() {
        System.out.println("truck 1");
    }

    public void m2() {
        //parent class = Car.java
        //so here this code calls "car 1"
        super.m1();
    }

    public String toString() {
        return super.toString() + super.toString();
    }

    public static void main(String[] args){
        Truck mycar = new Truck();

        //calls string in parent class
        System.out.println(mycar);

        mycar.m1();
        mycar.m2();
    }
}