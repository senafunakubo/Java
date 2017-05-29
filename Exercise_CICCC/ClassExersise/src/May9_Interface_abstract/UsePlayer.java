package May9_Interface_abstract;

/**
 * Created by senafunakubo on 2017-05-28.
 */
public class UsePlayer {

    public static void main(String[] args) {
        Child child = new Child();
        Musician musician = new Musician();
        Actor actor = new Actor();

        child.play();
        musician.play();
        actor.play();
    }
}
