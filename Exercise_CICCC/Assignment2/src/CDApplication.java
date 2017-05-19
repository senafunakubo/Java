import java.io.File;
import java.util.Scanner;

import static java.util.Comparator.comparing;

/**
 * Created by senafunakubo on 2017-05-17.
 */
public class CDApplication {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Hello, I'm a musical juke box.");
        System.out.println("");
        chooseMenu();

        int choose;
        Scanner chooseService = new Scanner(System.in);
        choose = chooseService.nextInt();

        while(choose<9) {
            switch (choose) {
                case 1:
                    System.out.println("");
                    System.out.println("** My CD Collection **");

                    WriteCDFile.write();
                    ReadCDFile.read();
                    chooseSeeTracks();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("** Adding CD **");
                    System.out.println("");

                    // ※ setterか何かでcountをいじる必要あり
                    WriteCDFile.write();
                    AppendCDFile.append();
                    ReadCDFile.read();
                    break;
                case 3:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("It's invalid.");
                    break;
            }
            System.out.println("");
            System.out.println("Push the button:");
            choose = chooseService.nextInt();
        }

        if(choose ==9){
            System.out.println("See you next time!");
        }

        if(choose>9){
            System.out.println("");
            System.out.println("It's invalid. Bye!");
        }
    }

public static void chooseSeeTracks(){
    System.out.println(">>> Do you want to see the Tracks of the CD?");
    System.out.println("[1] Yes");
    System.out.println("[2] No");

    int yesNO;
    Scanner chooseSeeTrack = new Scanner(System.in);
    yesNO = chooseSeeTrack.nextInt();

    if(yesNO == 1){

    }
    else {
        System.out.println(">>> OK. Go back the menu.");
    }
}

//    public static void wholeSongs(){
//        Songlist songs = new Songlist();
//        songs.addsongs("Ae dil Hai Mushkil","Pritam, Arijit Singh");
//        songs.addsongs("Starboy","The Weeknd");
//        songs.addsongs("Bulleya","Amit Mishra, Shilpa Rao");
//        songs.addsongs("ROSENROT","Rammstein");
//        songs.addsongs("Hell","Disturbed");
//
//        System.out.println(songs.songDetails());
//    }


    public static void chooseMenu(){
        System.out.println("[1] My CD collection");
        System.out.println("[2] Add a CD");
        System.out.println("[3] Delete a CD");
        System.out.println("[9] Power Off");
        System.out.println("");
        System.out.println("Push the button :");

    }

}
