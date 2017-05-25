package May1_Basic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Scanner;

/**
 *
 * @author senafunakubo
 */
public class May1_Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Part1

        //Q1
        System.out.println("Hello");
        System.out.println("Sena");
        System.out.println("\n");


        //Q2
        System.out.println(1 + 1);
        System.out.println(1 * 1);
        System.out.println(1 / 1);
        System.out.println(1 - 1);
        System.out.println("\n");


        //Q3
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        System.out.println("\n");


        //Q4
        int a = 125;
        int b = 24;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("\n");


        //Q5
        float radius = (float) 7.5;
        float d = (float) 3.1415926;
        System.out.println("Perimeter is " + (radius + radius) * d); //周長
        System.out.println("Area is " + radius * radius * d); //面積
        System.out.println("\n");


        //Q6
        int twoDigit = 25;
        int sumDigit = (twoDigit / 10) + (twoDigit % 10);
        System.out.println(sumDigit);
        System.out.println("\n\n");


        //Part2

        //Q1
        double fahrenheit = 212;
        System.out.println((fahrenheit - 32) / 1.8);
        System.out.println("\n");


        //Q2
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

                                  ////EX 500
        int firstDigit = num % 10;     //0
        int remainingNumber = num / 10;  //50
        int SecondDigit = remainingNumber % 10;//0
        remainingNumber = remainingNumber / 10; //5
        int thirdDigit = remainingNumber % 10;  //5

        int sum = thirdDigit + SecondDigit + firstDigit;

        System.out.println("The sum of all digits in " + num + " is " + sum);
        System.out.println("\n");


        //Q3
        SimpleDateFormat gmtDateFormat = new SimpleDateFormat("HH:mm:ss");
        gmtDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("\n");


        //Q4
        //Current Date Time in GMT
        System.out.println("Current Date and Time in GMT time zone: " + gmtDateFormat.format(new Date()));
        System.out.println("\n");


        //Q5
        float distanceMeters = 2500;
        float hour = 5;
        float minutes = 56;
        float seconds = 23;
        //5h56m23s

        float perSecondsMeters =  distanceMeters/(seconds + (hour * 60 *60) + (minutes * 60));
        System.out.println("Your speed in m/s is " + perSecondsMeters);

        float perKMHour = (distanceMeters / 1000) / (hour + (minutes/60) + (seconds / 3600));
        System.out.println("Your speed in km/h is " + perKMHour);

        float perMileHour = (distanceMeters / 1609) / (hour + (minutes/60) + (seconds / 3600));
        System.out.println("Your speed in miles/h is " + perMileHour);
        System.out.println("\n");


        //Q6
        System.out.println("a : " + (4 + 6 * 3));
        System.out.println("b : " + (6 / 3 * 7));
        System.out.println("c : " + (18 / 2 + 14 / 2));
        System.out.println("d : " + (16 / 2));
        System.out.println("e : " + (17 / 2));
        System.out.println("f : " + (28 / 5));
        System.out.println("g : " + (16 % 2));
        System.out.println("h : " + (17 % 2));
        System.out.println("i : " + (28 % 5));
        System.out.println("j : " + (28 % 5 * 3 + 1));
        System.out.println("k : " + ((2 + 3) * 4));
        System.out.println("l : " + (20 / ( 4 + 1)));
        System.out.println("");

        System.out.println("a. (4 > 1) is " + (4 > 1));
        System.out.println("b. (5 <= 18) is " + (5 <= 18));
        System.out.println("c. (43 >= 43) is " + (43 >= 43));
        System.out.println("d. (2 == 3) is " + (2 == 3));
        System.out.println("e. (2 + 5 == 7) is " + (2 + 5 == 7));
        System.out.println("f. (3 + 8 <= 10) is " + (3 + 8 <= 10));
        System.out.println("g. (3 != 9) is " + (3 != 9));
        System.out.println("h. (13 != 13) is " + (13 != 13));
        System.out.println("i. (-4 != 4) is " + (-4 != 4));
        System.out.println("j. (2 + 5 * 3 == 21) is " + (2 + 5 * 3 == 21));
    }

}//The end of all

