package Jun5_Searching_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-06-05.
 */

// Q1 & Q4

public class SequentialSearch {

    public static int toDoSequentialSearch(int[] elements, int target)
    {
        for (int i = 0; i < elements.length; i++)
        {
            if (elements[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        List arraylist = new ArrayList();

        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            int ran = (int) (Math.random() * 100); //forが回るたびに変わる
            nums[i] = ran;

            //for binary search
            arraylist.add(nums[i]);
        }

        //show up arrayList of before sorting
        System.out.print("before sorting: ");
        System.out.println(arraylist);


        //show up sorted arrayList
        Collections.sort(arraylist);
        System.out.print("sorted: ");
        for (Object ob : arraylist) {
            System.out.print(ob + " ");
        }
        System.out.println("\n");


        //for Binary search
        System.out.print("[Binary Search] Type a integer to find it in the array:");
        Scanner scan = new Scanner(System.in);
        int searchNum = scan.nextInt();
        int discover = Collections.binarySearch(arraylist, searchNum);
        System.out.println("index: " + discover);
        System.out.println("\n");

        //for Sequential search
        System.out.print("[Sequential Search] Type a integer to find it in the array:");
        Scanner scan1 = new Scanner(System.in);
        int SearchNum = scan1.nextInt();

        int index = toDoSequentialSearch(nums,SearchNum);
        System.out.println("index: " + index);
    }
}
