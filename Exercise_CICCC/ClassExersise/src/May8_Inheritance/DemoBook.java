package May8_Inheritance;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-09.
 */
public class DemoBook {
    public static void main(String[] args) {

        //Book
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a title of Book:");
        String title = scan.nextLine();
        System.out.println("Type a number of pages: ");
        int number = scan.nextInt();
        Book bookInstance = new Book(title,number);
        String keepItByString = bookInstance.toString();
        System.out.println(keepItByString);
        System.out.println("");

        //Textbook
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Type a title of Textbook:");
        String titleForTb = scan2.nextLine();
        System.out.println("Type a number of pages: ");
        int numForTb = scan2.nextInt();
        System.out.println("Type a grade: ");
        int gradeOfBook = scan2.nextInt();
        Textbook tbInstance = new Textbook(titleForTb,numForTb, gradeOfBook);
        String keepItByString2 = tbInstance.toString();
        System.out.println(keepItByString2);

    }
}
