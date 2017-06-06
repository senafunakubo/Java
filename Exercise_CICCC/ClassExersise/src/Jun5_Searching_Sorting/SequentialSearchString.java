package Jun5_Searching_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-06-05.
 */

//Q2 & Q5

public class SequentialSearchString {

    public static int toDoSequentialSearch(String[] elements, String target)
    {
        for (int i = 0; i < elements.length; i++)
        {
            if (elements[i].equals(target))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        List arraylist = new ArrayList();

        String[] stringArray = {"a","c","b","o","d","e","f","s","g","h","i","j","k"};
        System.out.print("StringArray: ");
        for (Object ob : stringArray) {
            System.out.print(ob + " ");
        }

        //for binary search
        for (int i = 0; i < stringArray.length; i++) {
            arraylist.add(stringArray[i]);
        }

        Collections.sort(arraylist);
        System.out.print("\nSortedArray: ");
        for (Object ob : arraylist) {
            System.out.print(ob + " ");
        }
        System.out.println("\n");


        //for Binary search
        System.out.print("[Binary Search] Type a String to find it in the array:");
        Scanner scan1 = new Scanner(System.in);
        String searchSt = scan1.nextLine();
        int discover = Collections.binarySearch(arraylist, searchSt);
        System.out.println("index: " + discover);
        System.out.println("\n");

        // for Sequential Search
        System.out.print("[Sequential Search] Type a String to find it in the array:");
        Scanner scan = new Scanner(System.in);
        String SearchSt = scan.nextLine();
        int index = toDoSequentialSearch(stringArray,SearchSt);
        System.out.println("index: " + index);
    }
}
