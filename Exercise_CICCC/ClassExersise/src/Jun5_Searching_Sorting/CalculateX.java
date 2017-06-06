package Jun5_Searching_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-06-06.
 */

// Q7.
// Given a sorted array and a number x, find a pair in array whose sum is closest to x.
//     Examples:
//      Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
//      Output: 22 and 30
//
//      Input: arr[] = {1, 3, 4, 7, 10}, x = 15
//      Output: 4 and 10

public class CalculateX {
    public static void main(String[] args)
    {
        List arraylist = new ArrayList();

        int[] nums = new int[15];
        for (int i = 0; i < nums.length; i++) {
            int ran = (int) ((Math.random()+0.1) * 10);
            nums[i] = ran;

            arraylist.add(nums[i]);
        }
        System.out.print("Array: ");
        Collections.sort(arraylist);
        for (Object ob : arraylist) {
            System.out.print(ob + " ");
        }

        System.out.print("\nType a integer to set X: ");
        Scanner scan1 = new Scanner(System.in);
        int searchNum = scan1.nextInt();
        System.out.println("\n");

        findPairWithClosestToX(nums, searchNum);
    }

    public static void findPairWithClosestToX(int arr[],int X) {

        int minimumDiff = Math.abs(arr[0]+arr[1]-X);
        int pair1stIndex = 0;
        int pair2ndIndex = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                int tempDiff = Math.abs(arr[i]+arr[j]-X); //絶対値(+)

                if(tempDiff< minimumDiff)
                {
                    pair1stIndex = i;
                    pair2ndIndex = j;
                    minimumDiff = tempDiff; //0になった時の2つのindexが答えになる(minimumDiffが1度0になったらifはもう回らないので)
                }
            }
        }
        System.out.println("The pair whose sum is closest to X(" + X +") is : "+arr[pair1stIndex]+" + "+ arr[pair2ndIndex]);

    }
}
