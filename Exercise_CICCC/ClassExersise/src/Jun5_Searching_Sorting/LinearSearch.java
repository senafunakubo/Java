package Jun5_Searching_Sorting;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-06-05.
 */

//Q3

//Java program for linear search:
// Linear search is very simple, To check if an element is present in the given list
// we compare search element with every element in the list.
// If the number is found then success occurs otherwise the list doesn't contain the element we are searching.

public class LinearSearch {
    public static void main(String args[]) {
      int c, n, search, array[];

      Scanner in = new Scanner(System.in);
      System.out.print("Enter number of elements: ");
      n = in.nextInt();
      array = new int[n];

      System.out.println("\nEnter " + n + " integers");

      for (c = 0; c < n; c++)
        array[c] = in.nextInt();

      System.out.println("\nEnter value to find");
      search = in.nextInt();

      for (c = 0; c < n; c++)
      {
        if (array[c] == search)
        {
            System.out.println("\n" + search + " is present at location " + (c + 1) + ".");
            break;
        }
      }
      if (c == n)
        System.out.println("\n" + search + " is not present in array.");
    }
}
