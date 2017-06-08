package Jun6_Sorting;

/**
 * Created by senafunakubo on 2017-06-07.
 */

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;


public class SetDemo {

        public static void main(String[] args) {
//              int[] num = {12, 45, 7, 42, 89, 99, 54, 23, 63, 52, 41, 75, 65, 54, 94, 68, 62, 43, 49, 89, 40, 60, 50, 70, 223, 336, 225};
            int[] num = new int[1000];
            for (int i = 0; i < 1000; i++) {
                num[i] = (int) (Math.random()*1000);
            }

            //Random order
            System.out.println("[Random order]");
            Instant start = Instant.now();
            BubbleSort.BubbleSort(num);
            Instant end = Instant.now();
            System.out.println("time taken in worst case Bubble sort " + Duration.between(start, end));

            start = Instant.now();
            BubbleSort.SelectionSort(num);
            end = Instant.now();
            System.out.println("time taken in worst case Selection sort " + Duration.between(start, end));

            start = Instant.now();
            BubbleSort.InsertionSort(num);
            end = Instant.now();
            System.out.println("time taken in worst case Insertion sort " + Duration.between(start, end) + "\n\n");



            //Changed it to the normal order
            Arrays.sort(num);



            System.out.println("[Sorted order]");
            start = Instant.now();
            BubbleSort.BubbleSort(num);
            end = Instant.now();
            System.out.println("time taken in avg case Bubble sort " + Duration.between(start, end));

            start = Instant.now();
            BubbleSort.SelectionSort(num);
            end = Instant.now();
            System.out.println("time taken in best case Selection sort " + Duration.between(start, end));

            start = Instant.now();
            BubbleSort.InsertionSort(num);
            end = Instant.now();
            System.out.println("time taken in best case Insertion sort " + Duration.between(start, end) + "\n\n");



            //Changed it to the reversed order
            Collections.reverse(Arrays.asList(num));



            System.out.println("[Reversed order]");
            start = Instant.now();
            BubbleSort.BubbleSort(num);
            end = Instant.now();
            System.out.println("time taken in best case Bubble sort " + Duration.between(start, end));

            start = Instant.now();
            BubbleSort.SelectionSort(num);
            end = Instant.now();
            System.out.println("time taken in avg case Selection sort " + Duration.between(start, end));

            start = Instant.now();
            BubbleSort.InsertionSort(num);
            end = Instant.now();
            System.out.println("time taken in avg case Insertion sort " + Duration.between(start, end) + "\n");

            // do same for all sort algorithms. selection sort and insertion sort
        }

}
