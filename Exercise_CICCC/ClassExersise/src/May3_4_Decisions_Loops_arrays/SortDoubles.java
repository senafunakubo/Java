package May3_4_Decisions_Loops_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by senafunakubo on 2017-05-26.
 */

//Q4
public class SortDoubles {

    public static void main(String[] args){
        int i =0;
        double[] array = new double[15];
        ArrayList arrayList = new ArrayList();

        System.out.println("Please Enter 15 numbers.");
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Number " + (i + 1) + "/15:");
            double userInput = input.nextDouble();

            try {
                array[i] = userInput;
                arrayList.add(userInput);
                i++;
            } catch (Exception e) {
                System.out.println("Error: " + userInput + " is not a valid number");
            }

        }while (i < 15);

        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("[1] Ascending:");
        System.out.println("[2] Descending:");
        int choose = scan.nextInt();

        while (choose<3) {
            switch (choose) {
                case 1:
                    Arrays.sort(array);

                    System.out.print("\n\nAscending: ");
                    for (Double n : array) {
                        System.out.print(n + "  ");
                    }
                    System.out.println("");
                    break;
                case 2:
                    Comparator comparator = Collections.reverseOrder();
                    Collections.sort(arrayList,comparator);
                    System.out.println("\n\nDescending: ");
                    System.out.println(arrayList + "  ");
                    System.out.println("");
                    break;
                default:
                    System.out.println("It's invalid.");
                    break;
            }
            System.out.println("");
            System.out.println("Push the button:");
            choose = scan.nextInt();
        }

    }
}
