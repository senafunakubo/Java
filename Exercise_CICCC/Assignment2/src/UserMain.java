import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-21.
 */

public class UserMain {

    ArrayList<CD> cdList;

    public UserMain(ArrayList<CD> cdList){
        this.cdList = cdList;
    }

    public ArrayList<CD> getCDList() {
        return this.cdList;
    }

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Hello, I'm a musical juke box!");
        System.out.println("");
        chooseMenu();

        int choose;
        Scanner chooseService = new Scanner(System.in);
        choose = chooseService.nextInt();


        //インスタンス立ち上げ重要！！！！！！
        CDPlayer player = new CDPlayer();


        // Starboy
        Song songSt1 = new Song("Starboy","The Weeknd",3.50);
        Song songSt2 = new Song("Party Monster","The Weeknd",4.04);
        Song songSt3 = new Song("False Alarm","The Weeknd",3.40);
        Song songSt4 = new Song("Reminder","The Weeknd",3.38);
        Song songSt5 = new Song("Rockin'","The Weeknd",3.52);
        Song songSt6 = new Song("Secrets","The Weeknd",4.25);
        Song songSt7 = new Song("True Colors","The Weeknd",3.26);
        Song songSt8 = new Song("Stargirl Interlude","The Weeknd , Lana Del Rey",1.51);
        Song songSt9 = new Song("Sidewalks","The Weeknd , Kendrick Lamar",3.51);
        Song songSt10 = new Song("Six Feet Under","The Weeknd",3.57);
        Song songSt11 = new Song("Love To Lay","The Weeknd",3.43);
        Song songSt12 = new Song("A Lonely Night", "The Weeknd",3.40);
        Song songSt13 = new Song("Attention","The Weeknd",3.17);
        Song songSt14 = new Song("Ordinary Life","The Weeknd",3.41);
        Song songSt15 = new Song("Nothing Without You","The Weeknd", 3.18);
        Song songSt16 = new Song("All I Know","The Weeknd , Future", 5.21);
        Song songSt17 = new Song("Die For You", "The Weeknd",4.20);
        Song songSt18 = new Song("I Feel It Coming", "The Weeknd , Daft Punk", 4.29);


        //Ae Dil Hai Mushkil
        Song songAe1 = new Song("Ae Dil Hai Mushkil","Pritam , Arijit Singh",4.28);
        Song songAe2 = new Song("Bulleya","Pritam , Amit Mishra , Shilpa Rao",5.48);
        Song songAe3 = new Song("Channa Mereya","Pritam , Arijit Singh", 4.49);
        Song songAe4 = new Song("The Breakup Song","Pritam , Arijit Singh , Badshah , Jonita Gandhi , Nakash Aziz",4.12);
        Song songAe5 = new Song("Cutiepie","Pritam , Pardeep Singh Sran , Nakash Aziz", 3.51);
        Song songAe6 = new Song("Alizeh", "Pritam , Arijit Singh , Ash King , Shashwat Singh",4.42);


        ArrayList<Song> songList1 = new ArrayList<Song>();
                        songList1.add(songAe1);
                        songList1.add(songAe2);
                        songList1.add(songAe3);
                        songList1.add(songAe4);
                        songList1.add(songAe5);
                        songList1.add(songAe6);

        ArrayList<Song> songlist2 = new ArrayList<Song>();
                        songlist2.add(songSt1);
                        songlist2.add(songSt2);
                        songlist2.add(songSt3);
                        songlist2.add(songSt4);
                        songlist2.add(songSt5);
                        songlist2.add(songSt6);
                        songlist2.add(songSt7);
                        songlist2.add(songSt8);
                        songlist2.add(songSt9);
                        songlist2.add(songSt10);
                        songlist2.add(songSt11);
                        songlist2.add(songSt12);
                        songlist2.add(songSt13);
                        songlist2.add(songSt14);
                        songlist2.add(songSt15);
                        songlist2.add(songSt16);
                        songlist2.add(songSt17);
                        songlist2.add(songSt18);

        CD album = new CD(songlist2,"Starboy", "The Weeknd", 18, 12.88, "R&B", 2016);
        CD album2 = new CD(songList1,"Ae Dil Hai Mushkil", "Various", 6, 9.75, "SoundTrack", 2016);

        ArrayList<CD> cdList1 = new ArrayList<CD>();
        cdList1.add(album);
        cdList1.add(album2);

        UserMain user = new UserMain(cdList1);


        while(choose<9) {
            switch (choose) {
                case 1:
                    System.out.println("");
                    System.out.println("** My CD Collection **");
                    System.out.println("");
                    player.displayAlbums(user);
                    chooseSeeTracks(album,album2,player);
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("** Adding CD **");
                    System.out.println("");
                    CD newCD = player.addCd();
                    cdList1.add(newCD);
                    System.out.println("*****You added this CD successfully !*****");
                    System.out.println("\n\n");
//                    player.displayAlbums(user);

                    break;
                case 3:
                    System.out.println("");
                    player.deleteCD(user);
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

    }//main

    public static void chooseSeeTracks(CD album,CD album2, CDPlayer player){
        System.out.println("");
        System.out.println(">>> Do you want to see the Tracks of the CD?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");

        int yesNO;
        Scanner chooseSeeTrack = new Scanner(System.in);
        yesNO = chooseSeeTrack.nextInt();

        if(yesNO == 1){
            System.out.println("");
            player.displaySongs(album);
            System.out.println("");
            player.displaySongs(album2);
        }
        else {
            System.out.println(">>> OK. Go back the menu.");
        }
    }

    public static void chooseMenu(){
        System.out.println("[1] My CD collection");
        System.out.println("[2] Add a CD");
        System.out.println("[3] Delete a CD");
        System.out.println("[9] Power Off");
        System.out.println("");
        System.out.println("Push the button :");

    }

}
