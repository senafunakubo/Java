package May11_Exceptions;

/**
 * Created by senafunakubo on 2017-05-29.
 */
public class Propagation {
    public static void main(String[] args) {
        ExceptionScope demo = new ExceptionScope();

        System.out.println("Program beginning");
        demo.level1();
        System.out.println("Program ending");
    }
}
