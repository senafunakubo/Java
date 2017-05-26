package May3_4_Decisions_Loops_arrays;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-25.
 */

//Q3
public class Diamond {
    public static void main(String[] args){
        Scanner starNum = new Scanner(System.in);
        System.out.println("Type one of your favorite number: ");
        int star = starNum.nextInt();
        System.out.println("");


        for (int i = 0; i <= star; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
