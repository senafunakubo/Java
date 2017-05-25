package May2_String;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-24.
 */
public class May2_String {

    public static void main(String[] args) {

        System.out.println("Q1");
        vowel();

        System.out.println("Q2");
        palindrom();

        System.out.println("Q3");
        count();

        System.out.println("Q4");
        quote();

        System.out.println("Q5");
        String s="Welcome to Java Programming";
        System.out.println(s);
        char arr[]=s.toLowerCase().toCharArray();
        System.out.println("Remove the duplicate characters in a string:");
        removeDuplicates(arr);
        System.out.println("\n");

        System.out.println("Q6");
        String s1 = "sumitjain";
        String s2 = "tjainsumi";
        System.out.println("Is '" + s1 + "' and '" + s2 + "' are rotated? : " + isRotated(s1, s2));
        System.out.println("\n\n");

        //In class exercise
        System.out.println("ClassEx:");
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
        System.out.println(vowelCheck);

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
        String mark= "It is better to deserve honours and not have them than to have them and not deserve them. – Mark Twain";
        System.out.println(mark);
        System.out.println("indexOf('h'): " + mark.indexOf('h'));
        System.out.println("charAt(14): " + mark.charAt(14));
        System.out.println("endsWith(\"Twain\"): " + mark.endsWith("Twain"));
        System.out.println("replace a to A: " + mark.replace('a', 'A'));
        System.out.println("");
    }

    //Q5
    public static final void removeDuplicates(char[] str)
    {
    /*
     * If the str is not instantiated, or there is maximum 1 char there is no need to remove duplicates as
     * it is just impossible to have duplicate with 1 char.
    */
        if (str == null || str.length < 2)
            return;

        //loop over each char
        for(int i = 0; i < str.length; i++)
        {
            //no need to check with earlier character as they were already checked, so we start at i + 1
              //2つめのforが回り終わるまで、1つめのforのiは0のまま
            for(int j = i + 1; j < str.length; j++)
            {
                //if they match we clear
                if(str[j] == str[i])
                    str[j] = ' ';
            }
        }

        System.out.println(str);
    }

    //Q6
    public static boolean isRotated(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String sAdd = s1 + s1;
        if(sAdd.contains(s2)){
            return true;
        }else{
            return false;
        }
    }

}//End of all
