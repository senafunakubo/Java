package May3_4_Decisions_Loops_arrays;

/**
 * Created by senafunakubo on 2017-05-25.
 */

//Q2
public class EvenNums {

    public static void main(String[] args) {

        for(int i=2; i<101;i++)
        {
            if(i%2==0) {
                System.out.println(i);
            }
        }

        System.out.println("");

        for(int i=2; i<100;i++)
        {
            if (i % 20 == 0) {
                System.out.println(i);
            }
        }
    }
}
