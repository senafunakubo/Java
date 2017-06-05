package Jun5_Searching_Sorting;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-06-05.
 */

//Java program for linear search: Linear search is very simple,
// To check if an element is present in the given list we compare search element with every element in the list.
// If the number is found then success occurs otherwise the list doesn't contain the element we are searching.


public class TestOfLinearSearch {

   public static void main(String args[])
   {
       System.out.println("Type a number of the service.");
       System.out.println("[1] LinearSearch of int");
       System.out.println("[2] LinearSearch of String");
       System.out.println("[3] LinearSearch of Int");
       Scanner scan = new Scanner(System.in);
       int s = scan.nextInt();

       switch (s) {
           case 1:
               LinearSearchSmallInt();
               break;
           case 2:
               LinearSearchString();
               break;
           case 3:
               LinearSearchInt();
               break;
           default:
               System.out.println("error");
               break;
       }

   }


   public static void LinearSearchSmallInt(){
       int c, num, search, array[];

       Scanner scanIn = new Scanner(System.in);
       System.out.print("\nEnter number of elements:");
       num = scanIn.nextInt();
       array = new int[num];

       System.out.println("\nEnter " + num + " integers");

       for (c = 0; c < num; c++) {
           array[c] = scanIn.nextInt();
       }

       System.out.println("\nEnter value to find");
       search = scanIn.nextInt();
       System.out.println("");

       for (c = 0; c < num; c++)
       {
           if (array[c] == search)     /* Searching element is present */
           {
               System.out.println(search + " is present at location " + (c + 1) + ".");
               break;
           }
       }
       if (c == num)  /* Searching element is absent */
           System.out.println(search + " is not present in array.");
   }

   public static void LinearSearchString(){
       int b,num;

       Scanner scanIn2 = new Scanner(System.in);
       System.out.print("\nEnter number of elements:");
       num = scanIn2.nextInt();
       String[] stringArray = new String[num];

       System.out.println("\nEnter " + num + " Strings");

       Scanner scanIn3 = new Scanner(System.in);
       for (b = 0; b < stringArray.length; b++)
           stringArray[b] = scanIn3.nextLine();

       System.out.println("\nEnter value to find");
       String search = scanIn3.nextLine();
       System.out.println("");

       for (b = 0; b < stringArray.length; b++)
       {
           if (stringArray[b].equals(search))     /* Searching element is present */
           {
               System.out.println(search + " is present at location " + (b + 1) + ".");
               break;
           }
           else{
               System.out.println(search + " is not present at location " + (b + 1) + ".");
           }
       }

   }

    public static void LinearSearchInt(){
       int num,a;

        Scanner scanIn4 = new Scanner(System.in);
        System.out.print("\nEnter number of elements:");
        num = scanIn4.nextInt();
        Integer[] integersArray = new Integer[num];

        System.out.println("\nEnter " + num + " Integers");

        Scanner scanIn5 = new Scanner(System.in);
        for (a = 0; a < integersArray.length; a++)
            integersArray[a] = scanIn5.nextInt();

        System.out.println("\nEnter value to find");
        Integer search = scanIn5.nextInt();
        System.out.println("");

        for (a = 0; a < integersArray.length; a++)
        {
            if (integersArray[a].equals(search))     /* Searching element is present */
            {
                System.out.println(search + " is present at location " + (a + 1) + ".");
                break;
            }
            else{
                System.out.println(search + " is not present at location " + (a + 1) + ".");
            }
        }
    }

}
