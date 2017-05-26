package May3_4_Decisions_Loops_arrays;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-25.
 */

//Q4
public class Pattern {
    public static void main(String[] args){
        one();
        System.out.println("");
        two();
        System.out.println("");
        three();
    }

    public static void one(){
        Scanner starNum = new Scanner(System.in);
        System.out.println("Type one of your favorite number: ");
        int star = starNum.nextInt();
        System.out.println("");

        int num = 1;

        for (int i = 0; i <= star; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(num);
            }
            num++;
            System.out.println("");
        }

    }

    public static void two(){
        Scanner starNum = new Scanner(System.in);
        System.out.println("Type one of your favorite number: ");
        int star = starNum.nextInt();
        System.out.println("");

        int num = 1;

        for (int i = 0; i <= star; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(num);
                num++;
            }
            System.out.println("");
        }
    }

    //difficult
    public static void three(){
        Scanner starNum = new Scanner(System.in);
        System.out.println("Type one of your favorite number: ");
        int star = starNum.nextInt();
        System.out.println("");

        String s = "1";
        for (int i = 1; i < star; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.println(s);

                if (s.startsWith("1"))
                {
                    s = "0" + s;
                }
                else
                {
                    s = "1" + s;
                }
            }

        }
    }
}
