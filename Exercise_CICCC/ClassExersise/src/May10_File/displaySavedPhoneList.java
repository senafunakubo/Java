package May10_File;

import java.io.*;

/**
 * Created by senafunakubo on 2017-05-28.
 */
public class displaySavedPhoneList {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("WritePhoneList.txt"));
            String str = br.readLine();

            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        finally
        {
            try
            {
                if (br != null)
                {
                    br.close();
                }
            }
            catch (IOException ioe)
            {
                System.out.println("Error");
            }
        }
    }
}