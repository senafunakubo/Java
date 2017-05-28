package May3_4_Decisions_Loops_arrays;

/**
 * Created by senafunakubo on 2017-05-27.
 */

//Q5
public class TemperatureTest {

    public static void main(String[] args){
        double[] dailyTemp = {70,61,64,71,66,68,62};
        for(int i= 0; i<dailyTemp.length; i++){
            System.out.println(dailyTemp[i]);
        }
        System.out.println("\nThe average temperature:" + average(dailyTemp));
    }

    public static double average (double[] aDouble){
        double total = 0.0;
        for(double d : aDouble){
            total += d;
        }
        return total/ aDouble.length;
    }
}
