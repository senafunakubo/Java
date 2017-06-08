package Jun6_Sorting;

/**
 * Created by senafunakubo on 2017-06-07.
 */
public class BubbleSort {

        public static void BubbleSort(int[] num) { //上の要素と比較し、上のほうが大きければ互いに交換する
            int j;
            boolean flag = true;   // set flag to true to begin first pass
            int temp;   //holding variable

            while (flag) {
                flag= false;

                for( j=0;  j < num.length -1;  j++ )
                {
                    if ( num[j] < num[j+1] )   // change to > for ascending sort
                    {
                        temp = num[j];                //swap elements
                        num[j] = num[j+1];
                        num[j+1] = temp;
                        flag = true;              //shows a swap occurred
                    }
                }

            }
        }

        public static void SelectionSort(int[] num) {
            for (int i = 0; i < num.length - 1; i++)
            {
                int index = i;
                for (int j = i + 1; j < num.length; j++){
                    if (num[j] < num[index]){
                        index = j;//searching for lowest index
                    }
                }
                int smallerNumber = num[index];
                num[index] = num[i];
                num[i] = smallerNumber;
            }

        }

// The insertion sort, unlike the other sorts, passes through the array only once.
// http://qiita.com/masalennon/items/34dbc194cdf9ba7dea1d

        public static void InsertionSort(int[] num) {
            int j;                     // the number of items sorted so far
            int key;                // the item to be inserted
            int i;

            for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
            {
                key = num[j];
                for(i = j-1; (i >= 0) && (num[i] < key); i--)   // Smaller values are moving up
                {
                    num[i+1] = num[i];
                }
                num[i+1] = key;    // Put the key in its proper location
            }
        }
}
