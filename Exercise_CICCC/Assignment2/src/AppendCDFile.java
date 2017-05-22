//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * Created by senafunakubo on 2017-05-18.
// */
//
//public class AppendCDFile {
//
//
//    public static String append() {
//
//        String addCDTitle = "";
//        String addCDArtist = "";
//        int addCDTracks = 0;
//        double addCDPrice = 0.0;
//        String addCDGenre = "";
//        int addCDYear = 0;
//
//        CDCollection addMusic = null;
//        try {
//            File file = new File("cd.txt");
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            FileWriter fw = new FileWriter(file, true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);           //This will add a new line to the file content
//
//            System.out.println("Enter the CD Title: ");
//            Scanner chooseCDTitle = new Scanner(System.in);
//            addCDTitle = chooseCDTitle.nextLine();
//            System.out.println("");
//
//            System.out.println("Enter the artist name: ");
//            Scanner chooseCDArtist = new Scanner(System.in);
//            addCDArtist = chooseCDArtist.nextLine();
//            System.out.println("");
//
//            System.out.println("Enter the number of tracks: ");
//            Scanner chooseCDTracks = new Scanner(System.in);
//            addCDTracks = chooseCDTracks.nextInt();
//            System.out.println("");
//
//            System.out.println("Enter a price of the CD: ");
//            Scanner chooseCDPrice = new Scanner(System.in);
//            addCDPrice = chooseCDPrice.nextDouble();
//            System.out.println("");
//
//            System.out.println("Enter a genre of the CD: ");
//            Scanner chooseCDGenre = new Scanner(System.in);
//            addCDGenre = chooseCDGenre.nextLine();
//            System.out.println("");
//
//            System.out.println("Enter a year of The CD: ");
//            Scanner chooseCDYear = new Scanner(System.in);
//            addCDYear = chooseCDYear.nextInt();
//            System.out.println("");
//
//
//            addMusic = new CDCollection();
//            ArrayList<Song[]> songArray = new ArrayList<Song[]>();
//            addMusic.addCD(songArray,addCDTitle, addCDArtist, addCDTracks, addCDPrice, addCDGenre, addCDYear);
//            pw.println(addMusic.toString());
//            pw.close();
//
//            System.out.println("");
//            System.out.println("You add the CD successfully.");
//            System.out.println("");
//
//        } catch (IOException ioe) {
//            System.out.println("Exception occurred:");
//            ioe.printStackTrace();
//        }
//        return addMusic.toString();
//    }
//}
