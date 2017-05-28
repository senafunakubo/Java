package May5_getter_setter;

/**
 * Created by senafunakubo on 2017-05-27.
 */
public class TestCircle {

    public static void main(String[] args){
        Circle smallC = new Circle();
        smallC.setRadius(2.0);
        System.out.println(smallC.getRadius());
        System.out.println(smallC + "\n");

        Circle bigC = new Circle();
        bigC.setRadius(10.0);
        System.out.println(bigC.getRadius());
        System.out.println(bigC + "\n");

        Circle normal = new Circle();
        System.out.println(normal.getRadius());
        System.out.println(normal + "\n");
    }
}
