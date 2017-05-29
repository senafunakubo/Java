package May9_Interface_abstract;

/**
 * Created by senafunakubo on 2017-05-28.
 */
public class DemoTurners {
    public static void main(String[] args){
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        Weather weather = new Weather();
        Profit profit = new Profit();

        leaf.turn();
        page.turn();
        pancake.turn();
        weather.turn();
        profit.turn();
    }
}
