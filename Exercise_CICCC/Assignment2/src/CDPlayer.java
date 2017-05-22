import java.io.File;
import java.util.Scanner;

import static java.util.Comparator.comparing;

/**
 * Created by senafunakubo on 2017-05-17.
 */
public class CDPlayer {

    private int count = 1;

    public void displaySongs(CD cd) {
        for (Song song : cd.getSongArray()) {
            System.out.println(count + ". " + song.getSongTitle());
            count++;
        }
        count = 1;
    }

}
