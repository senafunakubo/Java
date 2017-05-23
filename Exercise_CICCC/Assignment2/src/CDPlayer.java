import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Comparator.comparing;

/**
 * Created by senafunakubo on 2017-05-17.
 */
public class CDPlayer {

    private int count = 1;
    private int albumCount = 1;
    String addCDTitle = "";
    String addCDArtist = "";
    int addCDTracks = 0;
    double addCDPrice = 0.0;
    String addCDGenre = "";
    int addCDYear = 0;

    public void displaySongs(CD cd) {
        for (Song song : cd.getSongArray()) {
            System.out.println(count + ". " + song.getSongTitle() + "\t");
            count++;
        }
        count = 1;
    }

    public void displayAlbums(UserMain user) {
        BufferedWriter bw = null;
        try {


            //Specify the file name and path here
            File file = new File("cd.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

        for (CD cd : user.getCDList())
        {
            System.out.println(albumCount + ". " + cd.getCdTitle() + "\t" + cd.getArtistName() + "\n" + cd.getGenre() + "\t$" + cd.getPrice() + "\t" + cd.getTracks() + "songs\t" + cd.getYear() + "\n");
            String albums = Integer.toString(albumCount) + "." + cd.getCdTitle() + "\t" + cd.getArtistName() + "\n" + cd.getGenre() + "\t$";
            albums+= Double.toString(cd.getPrice()) + "\t" + Integer.toString(cd.getTracks()) + "songs\t" + Integer.toString(cd.getYear()) + "\n\n";
            bw.write(albums);
            albumCount++;
        }
        albumCount = 1;

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        finally
        {
            try
            {
                if (bw != null)
                {
                    bw.close();
                }
            }
            catch (Exception ex)
            {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }

    public CD addCd() {

        CD addAlbum = null;

        try {
            File file = new File("cd.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            System.out.println("Enter the CD Title: ");
            Scanner chooseCDTitle = new Scanner(System.in);
            addCDTitle = chooseCDTitle.nextLine();
            System.out.println("");

            System.out.println("Enter the artist name: ");
            Scanner chooseCDArtist = new Scanner(System.in);
            addCDArtist = chooseCDArtist.nextLine();
            System.out.println("");

            System.out.println("Enter the number of tracks: ");
            Scanner chooseCDTracks = new Scanner(System.in);
            addCDTracks = chooseCDTracks.nextInt();
            System.out.println("");

            System.out.println("Enter a price of the CD: ");
            Scanner chooseCDPrice = new Scanner(System.in);
            addCDPrice = chooseCDPrice.nextDouble();
            System.out.println("");

            System.out.println("Enter a genre of the CD: ");
            Scanner chooseCDGenre = new Scanner(System.in);
            addCDGenre = chooseCDGenre.nextLine();
            System.out.println("");

            System.out.println("Enter a year of The CD: ");
            Scanner chooseCDYear = new Scanner(System.in);
            addCDYear = chooseCDYear.nextInt();
            System.out.println("");
            System.out.println("******************************************");


            ArrayList<Song> songArray = new ArrayList<Song>();
            songArray.add(null);

            addAlbum = new CD(songArray, addCDTitle, addCDArtist, addCDTracks, addCDPrice, addCDGenre, addCDYear);
            addAlbum.Display();
            pw.println(addAlbum.displayForFile());
            pw.close();

        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
        return addAlbum;

    }

    public void deleteCD(UserMain user) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of CD you wanna eject: ");
        int index = scan.nextInt();
        user.getCDList().remove(index - 1);

    }
}