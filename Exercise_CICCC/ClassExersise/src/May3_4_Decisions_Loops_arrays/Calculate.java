package May3_4_Decisions_Loops_arrays;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-25.
 */

//Q6
public class Calculate {

    public static void main(String[] args){
        Scanner operation = new Scanner(System.in);
        System.out.println("Type one of your favorite number: ");
        int ope1 = operation.nextInt();
        System.out.println("");

        Scanner operation2 = new Scanner(System.in);
        System.out.println("Type one of your favorite number: ");
        int ope2 = operation2.nextInt();
        System.out.println("");

        Scanner chooseSystem = new Scanner(System.in);
        System.out.println("Choose the number you wanna execute.");
        System.out.println("[1] Add");
        System.out.println("[2] Subtract");
        System.out.println("[3] Multiply");
        System.out.println("[4] Divide");
        int choose = chooseSystem.nextInt();
        System.out.println("");


        if(choose<=0 || choose>=5 || choose == 4 && ope2 ==0)
        {
            System.out.println("Error.");
        }

        while (choose<4 && choose>0) {
            switch (choose) {
                case 1:
                    System.out.println(ope1 + ope2);
                    break;
                case 2:
                    System.out.println(ope1 - ope2);
                    break;
                case 3:
                    System.out.println(ope1 * ope2);
                    break;
                case 4:
                    System.out.println(ope1 / ope2);
                    break;
                default:
                    break;


            }

            System.out.println("");
            System.out.println("Push the button:");
            choose = chooseSystem.nextInt();
        }
    }
}
