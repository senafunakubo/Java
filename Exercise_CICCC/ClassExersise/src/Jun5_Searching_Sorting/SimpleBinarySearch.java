package Jun5_Searching_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by senafunakubo on 2017-06-05.
 */


public class SimpleBinarySearch {

        public static void main(String[] args) {

            List arraylist = new ArrayList();
            arraylist.add(5);
            arraylist.add(2);
            arraylist.add(3);

            System.out.println("arrayList: " + arraylist + "\n");
            System.out.println("昇順ソート");
            Collections.sort(arraylist);

            for (Object ob : arraylist) {
                System.out.print(ob + " ");
            }
            System.out.println("\n");

            int discover = Collections.binarySearch(arraylist, 2);
            int notdiscover = Collections.binarySearch(arraylist, 1);

            System.out.println("先頭に同じ整数を発見");
            System.out.println(discover);
            System.out.println("\n該当する整数がない");
            System.out.println(notdiscover);
        }
}
