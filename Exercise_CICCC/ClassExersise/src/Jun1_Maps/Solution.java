package Jun1_Maps;

import java.util.Scanner;
import java.util.HashSet;

/**
 * Created by senafunakubo on 2017-06-04.
 */

public class Solution {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        int count = 0;

        System.out.print("Type a num:");
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        System.out.println("");

        for(int i = 0;i < numCases;i++){
            if(hs.add(sc.nextLine())){
                count++;
            }
            System.out.println(count);
        }

    }
}
