package May3_4_Decisions_Loops_arrays;


import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by senafunakubo on 2017-05-26.
 */

//Q2
public class Median {

    public static void main(String[] args) {
        System.out.println("Please Enter nine number.");
        Scanner input = new Scanner(System.in);
        double[] num = new double[9];
        int i = 0;

        do {
            System.out.print("Number" + (i + 1) + "/9:");
            double inputNum = input.nextDouble();

            try {
                num[i] = inputNum;
                i++;
            } catch (Exception e) {
                System.out.println("Error: " + inputNum + " is not a valid number");
            }

        } while (i < 9);

        //低←　→高
        Arrays.sort(num);

        System.out.print("\n\nYou entered: ");
        for (Double n : num) {
            System.out.print(n + "  ");
        }

        System.out.println("\nThe median value is " + num[4]);


    }
}