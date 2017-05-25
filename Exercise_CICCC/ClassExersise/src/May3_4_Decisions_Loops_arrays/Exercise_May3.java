package May3_4_Decisions_Loops_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author senafunakubo
 */


public class Exercise_May3 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        checkNum();
        System.out.println("");
        checkString();

    } //The end of main fun


    //Q1
    public static void checkNum()
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        boolean valid = false;
        while(! valid )
        {
            try
            {
                n = s.nextInt();
                if(n > 0)
                {
                    valid = true;
                    System.out.println("The given number "+n+" is Positive.");
                }
                else
                {
                    valid = true;
                    System.out.println("The given number "+n+" is Negative.");
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Not a valid number.");
                break;
            }
        }//The end of while loop

    }//The end of checkNum


    //Q2
    public static void checkString()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ONE character you want to check:");
        String a = scan.nextLine();

        if(a.toLowerCase().equals("a") || a.toLowerCase().equals("e") || a.toLowerCase().equals("i") ||
                a.toLowerCase().equals("o") || a.toLowerCase().equals("u"))
        {
            System.out.print("Input letter is a Vowel.");
        }
        else if(a.matches("^[0-9]+$")) //数字が含まれていたらNG
        {
            System.out.print("This is a letter only.");
        }
        else if(a.length() >= 2) //2文字以上
        {
            System.out.print("Please enter ONE string.");
        }
        else//母音以外
        {
            System.out.println("Input letter is a Consonant.");
        }
    }

} //The end of ALL