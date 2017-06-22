package Jun15_Recursion;

/**
 * Created by senafunakubo on 2017-06-20.
 */

public class BasicOfRecursion {
//   What is a Recursive method?
//    A Method that calls itself
//    With each method call the problem becomes simpler
//    Must have a condition that leads to the method no longer making another method call itself


//     if(num==1)
//     {
//       return 1;
//     }
//     else
//     {
//       return (num + getTriNum(num-1));
//     }

//    if num is 6, 6+? -> 21 ... Final Answer
//              5, 5+? -> 15 GO UP
//              4, 4+? -> 10 GO UP
//              3, 3+? -> 6 GO UP
//              2, 2+? -> 3 GO UP
//              1 GO UP

    public static void main(String[] args) {



        BasicOfRecursion recursionTool = new BasicOfRecursion();



        // Demonstrate what a triangular number is

        // Triangular numbers can be visualized as triangles

        // Equals itself plus every number before it to 1

        // TN of 5 = 5+4+3+2+1



        recursionTool.calculateSquaresToPrint(10);

        System.out.println("\n\nTriangular Number: " + recursionTool.getTriangularNum(3) + "\n\n");

        System.out.println("\nGET TRIANGULAR NUMBER");
        System.out.println("Recursion Triangular Number: " + recursionTool.getTriangularNumR(6));

        System.out.println("\nGET FACTORIAL");
        System.out.println("Factorial: " + recursionTool.getFactorial(3));
    }

        // Calculate triangular number not using recursion

    public int getTriangularNum(int number){

        int triangularNumber = 0;

        while(number > 0){
            triangularNumber = triangularNumber + number;
            number--;

        }

        // If number equals 3, you find TN by adding 3+2+1 = 6

        return triangularNumber;

    }

        // Calculate triangular number using recursion

    public int getTriangularNumR(int number){

        // Every recursive method must have a condition that
        // leads to the method no longer making another method
        // call on itself. This is known as the base case
        System.out.println("Method " + number);


        if(number == 1){
            System.out.println("Returned 1");
            return 1;
        } else {

//        【重要】 numberが1になるまでは、このresult前ででストップする
            int result = number + getTriangularNumR(number - 1);
            System.out.print("Return " + result);
            System.out.println(" : " + number + " + getFactorial(" + number + " - 1)");
            return result;

        }

    }


        // Returns the factorial of a number (階乗)
        // factorial(3) = 3 * 2 * 1

    public int getFactorial(int number){

        System.out.println("Method " + number);

        if(number == 1){
            System.out.println("Returned 1");

            return 1;

        } else {

            int result = number * getFactorial(number - 1);

            System.out.print("Return " + result);
            System.out.println(" : " + number + " * getFactorial(" + number + " - 1)");

            return result;

        }

    }

        // USED TO DEMONSTRATE TRIANGULAR NUMBERS --------------------

        // Draws the number of squares that are passed in horizontally

    public void drawSquares(int howManySquares){

        for(int i = 0; i < howManySquares; i++) System.out.print(" --  ");
        System.out.println();

        for(int i = 0; i < howManySquares; i++) System.out.print("|" + howManySquares + " | ");
        System.out.println();

        for(int i = 0; i < howManySquares; i++) System.out.print(" --  ");
        System.out.println("\n");

    }

        // Outputs the number of squares to print to represent a triangle

    public void calculateSquaresToPrint(int number){

        for(int i = 1; i <= number; i++){

            for(int j = 1; j < i; j++){

                drawSquares(j);

            }

            System.out.println("Triangular Number: " + calcTriangularNum(i));

        }

    }


    public double calcTriangularNum(int number){
        return .5 * number * (1 + number);

    }

}
