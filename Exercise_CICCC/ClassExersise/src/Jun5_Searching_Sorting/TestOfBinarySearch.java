package Jun5_Searching_Sorting;

/**
 * Created by senafunakubo on 2017-06-05.
 */

// **** Recursive ****

public class TestOfBinarySearch {

    public static int BinSearch( int x, int[] A, int low, int high )
    {
        int middle, mySol;

        if ( low > high )
        {
          /* ------------------------------------------------------
	     Solve the base case:
	     ------------------------------------------------------ */
            return( -1 );        // Not found
        }
        else
        {
          /* ------------------------------------------------
	     Solve a non-trivial binary search
             ------------------------------------------------ */

            middle = (low + high)/2;

            if ( x == A[middle] )
            {
                mySol = middle;           // Found at array element index "middle"
            }
            else if ( x < A[middle] )
            {
                mySol = BinSearch( x, A, low, middle-1 );  // smaller problem
            }
            else  //  x > A[middle]
            {
                mySol = BinSearch( x, A, middle+1, high );  // smaller problem
            }

            return ( mySol );
        }
    }

    public static void main (String[] args)
    {
        int[] A = {1, 4, 6, 9, 12, 15, 18, 21, 23, 27, 31, 33};

        int r;

        r = BinSearch( 27, A, 0, A.length);
        System.out.println("Find 27: " + r);

        r = BinSearch( 28, A, 0, A.length);
        System.out.println("\nFind 28: " + r);

    }

}
