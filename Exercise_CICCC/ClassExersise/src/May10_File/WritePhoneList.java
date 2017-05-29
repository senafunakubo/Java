package May10_File;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-28.
 */
public class WritePhoneList {

    public static void main(String[] args) {
        System.out.println("Type First name");
        Scanner scanFirst = new Scanner(System.in);
        String firstName = scanFirst.nextLine();

        System.out.println("Type last name");
        Scanner scanLast = new Scanner(System.in);
        String lastName = scanLast.nextLine();

        System.out.println("Type phone Numbers");
        Scanner scanNum = new Scanner(System.in);
        int phoneNum = scanNum.nextInt();
    }
}
