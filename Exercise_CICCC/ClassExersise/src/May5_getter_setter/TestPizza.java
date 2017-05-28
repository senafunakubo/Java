package May5_getter_setter;

/**
 * Created by senafunakubo on 2017-05-27.
 */
public class TestPizza {

    public static void main(String[] args){
        Pizza test = new Pizza();
        test.setToppings("Pepperoni");
        test.setDiameter(12);
        test.setPrice(13.99);

        System.out.println("Topping: " + test.getToppings());
        System.out.println("Diameter: " + test.getDiameter() + " inch");
        System.out.println("Price: $" + test.getPrice());
    }
}
