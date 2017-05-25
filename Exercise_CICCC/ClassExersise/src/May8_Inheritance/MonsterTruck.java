package May8_Inheritance;

/**
 * Created by senafunakubo on 2017-05-24.
 */
public class MonsterTruck extends Truck{

    public void m1() {
        System.out.println("monster 1");
    }

    public void m2() {

        //extendなしならこれでもOK
//        Truck track = new Truck();
//        track.m1();
//        track.m2();

        super.m1();
        super.m2();
    }

    //名前をtoStringにしないとちゃんと動かない
    public String toString(){
        return "monster " + super.toString();
    }
}
