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

        while(choose<10) {
            switch (choose) {
                case 1:
                    nowPlaying();
                    break;
                case 2:
                    wholeCDs();
                    break;
                case 3:
                    wholeSongs();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("It's invalid.");
                    break;
            }
            System.out.println("");
            System.out.println("Type here:");
            choose = chooseService.nextInt();
        }

        if(choose ==10){
            System.out.println("See you next time!");
        }
    }

    public static void nowPlaying(){
//        Songlist songNow = new Songlist();
//        songNow.addsongs("Party Monster","The Weeknd");
//        System.out.println(songNow.songDetails());
    }

    public static void wholeCDs(){
        CDCollection music = new CDCollection();
        music.addCD("Starboy",18,12.88,"R&B",2016);
        music.addCD("Ae Dil Hai Mushkil",6,9.75,"SoundTrack",2016);
        music.addCD("The lost Children",16,5.99,"HeavyMetal",2011);
        music.addCD("ROSENROT",11,23.39,"HeavyMetal",2005);

        System.out.println(music.toString());
    }


    public static void wholeSongs(){
        Songlist songs = new Songlist();
        songs.addsongs("Starboy","The Weeknd");
        songs.addsongs("Bulleya","Amit Mishra, Shilpa Rao");
        songs.addsongs("ROSENROT","Rammstein");
        songs.addsongs("Hell","Disturbed");

        System.out.println(songs.songDetails());
    }


    public static void chooseMenu(){
        System.out.println("[1] Now I'm playing this song from this CD!");
        System.out.println("[2] Whole CDs details");
        System.out.println("[3] Whole Songs details");
        System.out.println("[4] ");
        System.out.println("[5] ");
        System.out.println("[6] ");
        System.out.println("[7] ");
        System.out.println("[8] ");
        System.out.println("[9] ");
        System.out.println("[10] Power Off");
        System.out.println("");
        System.out.println("Push the button :");

    }

}
