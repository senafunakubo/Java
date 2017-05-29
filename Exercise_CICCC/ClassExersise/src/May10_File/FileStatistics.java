package May10_File;

import java.io.*;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Created by senafunakubo on 2017-05-28.
 */

public class FileStatistics {
    public static void main(String[] args) {
        File file = new File("fileTest.txt");

          try{
//             //データを格納する配列の生成
//             byte data[] = "Javaaaaaa".getBytes();
//
//             //FileOutputStreamオブジェクトの生成
//             FileOutputStream fo = new FileOutputStream(file);
//
//             //ファイルに書き出し
//              for(int i = 0; i < data.length; i++){
//                 fo.write(data[i]);
//              }

              PrintWriter writer = new PrintWriter("fileTest.txt", "UTF-8");
              writer.println(file.getName());
              writer.println(file.getAbsolutePath());
              writer.println(file.length());
              writer.println(file.getAbsoluteFile().getParentFile().getName());

              SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
              writer.println(sdf.format(file.lastModified()));
              writer.close();

               System.out.println("finished writing the file.");
//               fo.close();

                }catch(IOException e) {

                System.out.println("IOException : " + e);

        }

        System.out.println("");
        System.out.println("File name: " + file.getName());
        System.out.println("File path : "+ file.getAbsolutePath());
        System.out.println("File size: " + file.length());
        System.out.println("Folder name : " + file.getAbsoluteFile().getParentFile().getName());

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("time of last modification : " + sdf.format(file.lastModified()));

    }
}
