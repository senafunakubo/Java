package May3_4_Decisions_Loops_arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 * Created by senafunakubo on 2017-05-26.
 */

//Q4
public class SortDoubles {

    public static void main(String[] args){
        int i =0;
        double[] array = new double[15];

        System.out.println("Please Enter 15 numbers.");
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Number " + (i + 1) + "/15:");
            double userInput = input.nextDouble();

            try {
                array[i] = userInput;
                i++;
            } catch (Exception e) {
                System.out.println("Error: " + userInput + " is not a valid number");
            }

        }while (i < 15);

        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();

        while (choose<3) {
            switch (choose) {
                case 1:
                    Arrays.sort(array);

                    System.out.print("\n\nAscending: ");
                    for (Double n : array) {
                        System.out.print(n + "  ");
                    }
                    break;
                case 2:

                    System.out.println("\n\nDescending: ");
                    for (Double n : array){
                        System.out.println(n + "  ");
                    }
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
