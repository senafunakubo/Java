package May9_Interface_abstract;

/**
 * Created by senafunakubo on 2017-05-28.
 */
public class Weather implements Turner{

    @Override
    public void turn() {
        System.out.println("Changing the weather");
    }
}
