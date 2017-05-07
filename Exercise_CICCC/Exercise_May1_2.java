/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author senafunakubo
 */
public class Exercise_May1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //part1
        System.out.println("Hello");
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9)%9);
        System.out.println(20 + -3*5 /8);
        System.out.println(5+15/3*2-8%3);

        int a = 125;
        int b = 24;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        float c =(float) 7.5;
        float d =(float) 3.1415926;
        System.out.println((c+c)*d);
        System.out.println(c*c*d);

        //I don't know if it's correct way or not
        System.out.println(2+5);


        //Part2
        System.out.println((212 - 32)/1.8);
        System.out.println(5+6+5);

        SimpleDateFormat gmtDateFormat = new SimpleDateFormat("HH:mm:ss");
         gmtDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

         //Current Date Time in GMT
         System.out.println("Current Date and Time in GMT time zone: " + gmtDateFormat.format(new Date()));

         sub();

         String word = "momo";

         if(isPalindrom(word)) {
            System.out.println("It's a palindrom.");
        } else {
            System.out.println("It's not a palindrom.");
       }

    }//The end of main fun

public static void sub()
{
    //This quiz is for lecture
    String s1 = "introduction to java";
    String s2 = "Class march 2017";
     int len = s1.length();
     System.out.println("Length is = "+len);
     System.out.println(s1.toUpperCase());
       System.out.println(s1 + s2);
       System.out.println(s1.substring(13,20));
       System.out.println(s1.replace('o', 'Z'));

    //This is for string excercize
    String s3 = "inabacker24".toLowerCase();
    int vowelCount = 0;
    int consonantsCount = 0;
    for(int j = 0; j < s3.length(); ++j)
    {
       switch(s3.charAt(j))
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

  }//The end of sub class

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

}//The end of all
