/**
 * Created by senafunakubo on 2017-05-17.
 */
public class CDApplication {
    public static void main(String[] args) {
        CDCollection music = new CDCollection();
        music.addCD("Starboy",18,12.88,"R&B       ",2016);
        music.addCD("Ae Dil Hai Mushkil",6,9.75,"SoundTrack",2016);
        music.addCD("The lost Children",16,5.99,"HeavyMetal",2011);
        music.addCD("ROSENROT",11,23.39,"HeavyMetal",2005);

        System.out.println(music.toString());
    }
}
