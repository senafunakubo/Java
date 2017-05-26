package May3_4_Decisions_Loops_arrays;

/**
 * Created by senafunakubo on 2017-05-25.
 */

//Q5
public class FlipCoin {

    public static void main(String[] args) {
        boolean isLock = true;
        int count = 0;
        int start = 1;
        int end = 10;

        while (isLock) {

            double num =  Math.random(); //0.0以上1.0未満の実数
            if(num < 0.5){
                System.out.println("heads");
                count+=1;                //headsの回数をカウント
            }else{
                System.out.println("tails");
            }

            if(start >= end){
                System.out.println("");
                isLock = false;

                count = count * 10;
                System.out.println("Percentage: " + count + "%");
                System.out.println("Bye-bye.");
            }

            start++;                    //10回だけまわす
        }

    }
}
