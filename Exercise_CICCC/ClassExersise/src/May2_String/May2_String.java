package May2_String;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-24.
 */
public class May2_String {

    public static void main(String[] args) {
        vowel();
        palindrom();
        count();
        quote();

        sub();
    }

    public static void sub() {
        ////This quiz is for lecture////
        String s1 = "introduction to java";
        String s2 = "Class march 2017";
        int len = s1.length();
        System.out.println("Length is = " + len);
        System.out.println(s1.toUpperCase());
        System.out.println(s1 + s2);
        System.out.println(s1.substring(13, 20));
        System.out.println(s1.replace('o', 'Z'));
        /////////////////////////////////
    }


    //Q1
    public static void vowel(){

        Scanner word = new Scanner(System.in);
        System.out.println("Please type a word to check the number of vowels:");
        String vowelCheck = word.nextLine();

        int vowelCount = 0;
        int consonantsCount = 0;
        for(int j = 0; j < vowelCheck.length(); ++j)
        {
            switch(vowelCheck.toLowerCase().charAt(j))
            {
                case'a':
                case'i':
                case'u':
                case'e':
                case'o':
                    vowelCount++;
                    break;
                default:
                    consonantsCount++;
                    break;
            }
        }//The end of for loop

        System.out.println("The number of vowel:" + vowelCount);
        System.out.println("The number of consonant:" + consonantsCount);
        System.out.println("");

    }//The end of sub class


    //Q2
    public static void palindrom(){
        Scanner word = new Scanner(System.in);
        System.out.println("Check if your word is a palindrom or not :");
        String palindrom = word.nextLine();

        if (isPalindrom(palindrom)) {
            System.out.println("It's a palindrom.");
            System.out.println("");
        } else {
            System.out.println("It's not a palindrom.");
            System.out.println("");
        }
    }


    public static boolean isPalindrom(String word)
    {
        int length = word.length();
        if (length < 2) //If the string only has 1 char or is empty
        {
            return true;
        }
        else
        {
            if(word.charAt(0)!= word.charAt(length - 1))
                return false;
            else
                return true;
        }

    }

    //Q3
    public static void count(){
        String vowelCheck = "Home is the place, when you have to go there, they have to take you in.  Robert Frost";

        int vowelCount = 0;
        int consonantsCount = 0;
        for(int j = 0; j < vowelCheck.length(); ++j)
        {
            switch(vowelCheck.toLowerCase().charAt(j))
            {
                case'a':
                case'i':
                case'u':
                case'e':
                case'o':
                    vowelCount++;
                    break;
                case' ':
                    break;
                default:
                    consonantsCount++;
                    break;
            }
        }//The end of for loop

        System.out.println("The number of vowel:" + vowelCount);
        System.out.println("The number of consonant:" + consonantsCount);
        System.out.println("");
    }

    //Q4
    public static void quote(){
        String mark= "It is better to deserve honours and not have them than to have them and not deserve them. – Mark Twain.";
        System.out.println(mark.indexOf('h'));
        System.out.println(mark.charAt(14));
        System.out.println(mark.endsWith("Twain"));
        System.out.println(mark.replace('a', 'A'));
        System.out.println("");
    }



}//End of all
