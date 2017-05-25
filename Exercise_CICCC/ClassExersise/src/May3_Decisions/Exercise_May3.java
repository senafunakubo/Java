package May3_Decisions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        checkString();

    } //The end of main fun


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


    public static void checkString()
    {
        String string;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string you want to check:");
        string = scan.nextLine();

        if(string.equals("a") || string.equals("A") || string.equals("e") || string.equals("E") ||
                string.equals("i") || string.equals("I") || string.equals("o") || string.equals("O") ||
                string.equals("u") || string.equals("U"))
        {
            System.out.print("Input letter is a Vowel");
        }
        else if(string.matches("^[0-9]+$")) //数字が含まれていたらNG
        {
            System.out.print("This is a letter only.");
        }
        else if(string.length() >= 2) //2文字以上
        {
            System.out.print("Please enter ONE string.");
        }
        else//母音以外
        {
            System.out.println("Input letter is a Consonant.");
        }
    }

} //The end of ALL


//Q1.a if(q>0) System.out.println("XXX");
//Q2.c AAABBB
//Q3.d nothing
//Q4.d &&
//Q5.c ||
//Q6.d break
//Q7.b assigns 2 to x

//One fundamental concept of object-oriented programming in Java is the class.
//A class is a set of instructions that describe how a data structure should behave.
//A class constructor will allow us to create Dog instances. With a class constructor,
//we can set some information about the Dog.

//Class: a blueprint for how a data structure should function
//Constructor: instructs the class to set up the initial state of an object
//Object: instance of a class that stores the state of a class
//Method: set of instructions that can be called on an object
//Parameter: values that can be specified when creating an object or calling a method
//Return value: specifies the data type that a method will return after it runs
//Inheritance: allows one class to use functionality defined in another class