package May3_4_Decisions_Loops_arrays;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-25.
 */

//Q5
public class Admission {

    public static void main(String[] args){
        Scanner admission = new Scanner(System.in);
        System.out.println("Type your high school grade point average here: ");
        double gpa = admission.nextDouble();
        System.out.println("");

        Scanner exam = new Scanner(System.in);
        System.out.println("Type your admission test score here: ");
        int score = exam.nextInt();
        System.out.println("");

        if(gpa>=3.0 && gpa<4.0 && score>=60 && score<100 || gpa>0 && gpa<=3.0 && score>=80 && score<100){
            System.out.println("Accept.");
        }
        else if(gpa<=0||gpa>=4.0||score<=0||score>=100)
        {
            System.out.println("Error.");
        }
        else
        {
            System.out.println("Reject.");
        }
    }
}
