import java.io.*;
import java.util.List;

/**
 * Created by senafunakubo on 2017-05-18.
 */
public class WriteCDFile {

        public static void write() {
            BufferedWriter bw = null;
            try {

                CDCollection music = new CDCollection();
                music.addCD("Starboy", "The Weeknd", 18, 12.88, "R&B", 2016);
                music.addCD("Ae Dil Hai Mushkil", "Various", 6, 9.75, "SoundTrack", 2016);
                music.addCD("The lost Children", "Disturbed", 16, 5.99, "HeavyMetal", 2011);
                music.addCD("ROSENROT", "Rammstein", 11, 23.39, "HeavyMetal", 2005);

                String myContent = music.toString();

//            String myContentDetail = music.Mycollection();

                //Specify the file name and path here
                File file = new File("cd.txt");

                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write(myContent);
                System.out.println("");
//            System.out.println(myContentDetail);


            } catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {
                try {
                    if (bw != null) {
                        bw.close();
                    }
                } catch (Exception ex) {
                    System.out.println("Error in closing the BufferedWriter" + ex);
                }
            }
        }

}
