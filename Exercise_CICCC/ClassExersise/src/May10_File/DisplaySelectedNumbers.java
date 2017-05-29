package May10_File;

/**
 * Created by senafunakubo on 2017-05-28.
 */

import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


//COPY, It"s difficult for me now
public class DisplaySelectedNumbers {

    public static void main(String[] args) {

        String fileName = ("WritePhoneList2.txt");

        int i;
        for (i = 0; i < 2; i++) {
            StringBuilder str = new StringBuilder("");

            System.out.print("Type First name:");
            Scanner scanFirst = new Scanner(System.in);
            String firstName = scanFirst.nextLine();

            System.out.print("Type last name:");
            Scanner scanLast = new Scanner(System.in);
            String lastName = scanLast.nextLine();

            System.out.print("Type phone Numbers:");
            Scanner scanNum = new Scanner(System.in);
            int phoneNum = scanNum.nextInt();
            System.out.println("");

            //write in a file
            BufferedWriter bw = null;
            try {
                //Specify the file name and path here
                File file = new File("WritePhoneList2.txt");

                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(str.toString());
                System.out.println("File written Successfully");

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
            System.out.println("------------------------------------------");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Input given name: ");
        CharSequence given = scan.nextLine();
        System.out.println("------------------------------------------");

        //read the file//
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileName));

            String readStr = br.readLine();

            while (readStr != null) {
                if (readStr.contains(given)) {
                    System.out.println(readStr);
                }
                readStr = br.readLine();
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