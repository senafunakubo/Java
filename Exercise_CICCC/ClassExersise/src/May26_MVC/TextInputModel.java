package May26_MVC;


//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import May10_File.User;

import java.io.*;

/**
 * Created by senafunakubo on 2017-05-31.
 */

public class TextInputModel {

    public String getTextData(String fileName){
        String fileContents = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String str = br.readLine();
            while (str != null) {
                fileContents += str + "\n";
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
        return fileContents;
    }

    public Boolean setTextData(String fileName, String str){
        File file = new File(fileName);
        FileOutputStream fos = null;
        Boolean isSaved = false;

        try {
            fos = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] bytesArray = str.getBytes();
            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                    isSaved = true;
                }
            } catch (IOException ioe) {
                isSaved = false;
                System.out.println("Error in closing the Stream");
            }
        }
        return isSaved;
    }

}
