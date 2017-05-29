package May10_File;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * Created by senafunakubo on 2017-05-28.
 */
public class WritePhoneList {

    public static void main(String[] args) {

        ArrayList<User> arrayList = new ArrayList();

        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "/2");
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

            User user = new User(firstName, lastName, phoneNum);
            System.out.println("\n");

            arrayList.add(user);

        }

        BufferedWriter bw = null;
        try {

            File file = new File("WritePhoneList.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (User user : arrayList) {
                bw.write(user.toString());
                bw.newLine();
            }

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
    }
}
