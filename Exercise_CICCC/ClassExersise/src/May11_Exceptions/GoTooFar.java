package May11_Exceptions;

/**
 * Created by senafunakubo on 2017-05-29.
 */
public class GoTooFar {
    public static void main(String[] args) {
        int array[] = {12, 24, 36, 47, 178};

        try {
            for (int i=0; i<10;i++){
                System.out.println(array[i]);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Now you’ve gone too far.");
        }
    }
}
