package com.example.java;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-07.
 */

public class SortDoublesWithOption
{

    public static void main(String[] args)
    {
        System.out.println("Hi, you can choose list type.");
        System.out.println("Type 1: Ascending list");
        System.out.println("Type 2: decending list");
        System.out.println("Type here:");

        int choose;
        Scanner chooseType = new Scanner(System.in);
        choose = chooseType.nextInt();
        switch (choose) {
            case 1:
                AscendingList();
                break;
            case 2:
                decendingList();
                break;
            default:
                System.out.println("It's invalid.");
                break;
        }
    }

    public static void AscendingList()
    {
        //initializing unsorted array
        double doubleArray[] = {3.7, 2.5, 2.0, 1.0, 9.0, 6.5, 4.8, 1.5, 9.0, 12.8, 2.7, 5.5, 3.4, 17.8, 3.7};

        // let us print all the elements available in list
        for (double number : doubleArray)
        {
            System.out.println("Number = " + number);
        }

        // sorting array
        Arrays.sort(doubleArray);

        // let us print all the elements available in list
        System.out.println("The sorted array :");

        for (double number : doubleArray)
        {
            System.out.println("Number = " + number);
        }
    }

    public static void decendingList()
    {
        //initializing unsorted array
        Double[] doubleArray = new Double[]{
                new Double(3.7),
                new Double(2.5),
                new Double(2.0),
                new Double(1.0),
                new Double(9.0),
                new Double(6.5),
                new Double(4.8),
                new Double(1.5),
                new Double(9.3),
                new Double(12.8),
                new Double(2.7),
                new Double(5.5),
                new Double(3.4),
                new Double(17.8),
                new Double(3.9),
        };

        // let us print all the elements available in list
        for (double number : doubleArray)
        {
            System.out.println("Number = " + number);
        }

        // sorting array
        Arrays.sort(doubleArray, Collections.reverseOrder());

        // let us print all the elements available in list
        System.out.println("The sorted array :");

        for (double number : doubleArray)
        {
            System.out.println("Number = " + number);
        }
    }

}
