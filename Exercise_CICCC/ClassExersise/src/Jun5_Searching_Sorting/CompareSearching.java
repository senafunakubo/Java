package Jun5_Searching_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.time.Instant;
import java.time.Duration;

/**
 * Created by senafunakubo on 2017-06-06.
 */

// Q6
// Compare the linear search and binary search algorithm on int array values of 1000.
//  Take ex 1 and ex 4, create a comparison table with target value to find and number of comparison and time taken by each method.
//  Use the following code to measure execution time. Put your comment about both the algorithms
//        Instant start = Instant.now();
//        Instant end = Instant.now();
//        System.out.println(Duration.between(start, end));

public class CompareSearching {

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

    public static void linear(List arraylist, int[] nums){

        Instant start = Instant.now();

        //show up arrayList of before sorting
        System.out.print("before sorting: ");
        System.out.println(arraylist);

        //for Sequential search
        System.out.print("[Sequential Search] Type a integer to find it in the array:");
        Scanner scan1 = new Scanner(System.in);
        int SearchNum = scan1.nextInt();

        int index = toDoSequentialSearch(nums,SearchNum);
        System.out.println("index: " + index);

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));

    }

    public static void binary(List arraylist, int[] nums){

        Instant start = Instant.now();

        // show up sorted arrayList
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

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));

    }

    public static void main(String[] args)
    {
        List arraylist = new ArrayList();
        int[] nums = new int[1000];

        for (int i = 0; i < nums.length; i++) {
            int ran = (int) (Math.random() * 1000); //forが回るたびに変わる
            nums[i] = ran;
            arraylist.add(nums[i]);
        }

        binary(arraylist,nums);
        System.out.println("\n");
        linear(arraylist,nums);
    }

}
