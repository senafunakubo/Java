package com.example.java;
import java.util.Arrays;

public class SortDoubles extends SortDoublesWithOption{

    public static void main(String[] args) {


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
}