package May25_Stack;

import java.util.Arrays;

/**
 * Created by senafunakubo on 2017-06-22.
 */
public class TheStack {

    private String[] stackArray;

    private int stackSize;

    private int topOfStack = -1;

    TheStack(int size){

        stackSize =size;
        stackArray = new String[size];
        Arrays.fill(stackArray,"-1");
    }

    public void push(String input){

        if(topOfStack +1 < stackSize){

            topOfStack++;
            stackArray[topOfStack] = input;
        }
        else {
            System.out.println("Sorry But Stack is Full");
        }

        displayTheStack();

        System.out.println("Push " + input + " was Added to the Stack.");
    }

    public String pop(){

        if(topOfStack >= 0){
            displayTheStack();

            System.out.println("POP " + stackArray[topOfStack] + " was Removed from the stack");

            stackArray[topOfStack] = "-1";

            return stackArray[topOfStack--];
        }
        else{
            displayTheStack();

            System.out.println("Sorry but the stack is empty");
            return  "-1";
        }
    }

    public String peek(){
        displayTheStack();
        System.out.println("PEEK " + stackArray[topOfStack] + " is at the Top of the Stack" );
         return stackArray[topOfStack];
    }

    public void pushMany(String multipleValues){
        String[] tempString = multipleValues.split(" ");

        for (int i =0; i< tempString.length; i++){
            push(tempString[i]);
        }
    }

    public void popAll(){
       for(int i = topOfStack; i>=0; i--){
           pop();
       }
    }

    public void displayTheStack(){

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < stackSize; n++){

            System.out.format("| %2s "+ " ", n);

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < stackSize; n++){



            if(stackArray[n].equals("-1")) System.out.print("|     ");

            else System.out.print(String.format("| %2s "+ " ", stackArray[n]));

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

    }

    public static void main(String[] args){
        TheStack theStack = new TheStack(10);
        theStack.push("10");
        theStack.push("15");
        theStack.peek();
        theStack.pop();
        theStack.displayTheStack();
        System.out.println("");
        theStack.pushMany("12 13 14 15");
        theStack.popAll();
        theStack.displayTheStack();
    }
}
