package May11_Exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by senafunakubo on 2017-05-29.
 */
public class NegativeArray {
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Type a number :");
                int code = scan.nextInt();
                int[] array = new int[code];
                System.out.println("success to create array");
            } catch (NegativeArraySizeException e) {
                System.out.println("failed to create array! You typed a negative value.\t" + e);
            } catch (NumberFormatException e) {
                System.out.println("failed to create array! It's included non numeric value.\t" + e);
            }catch (InputMismatchException e) {
                System.out.println("failed to create array! It's a non numeric value!\t" + e);
            }
    }
}
