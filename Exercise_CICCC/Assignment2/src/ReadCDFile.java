import java.io.*;

/**
 * Created by senafunakubo on 2017-05-18.
 */
public class ReadCDFile {

    private boolean checkBeforeReadFile(File path) {
        if (path.exists() && path.isFile() && path.canRead()) {
            return true;
        } else {
            return false;
        }
    }

    public static void read() {
        BufferedReader br = null;
        BufferedReader br2 = null;
        try {
            br = new BufferedReader(new FileReader("cd.txt"));

            //One way of reading the file
            String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
            }
        }
    }
}
