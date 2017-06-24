package May25_Stack;

import java.util.Arrays;

/**
 * Created by senafunakubo on 2017-06-22.
 */
public class TheQueue {

    public String[] queueArray;

    private int queueSize;

    private int front, rear, numberOfItems = 0;

    TheQueue(int size){
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray,"-1");
    }

    public void insert(String input){
        if (numberOfItems + 1 <= queueSize){
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            displayTheQueue();
            System.out.println("INSERT " + input + " Was Added to the Queue\n");
        }else {
            System.out.println("Sorry But the Queue is full.");
        }
    }

    public void remove(){
        if(numberOfItems > 0){
            System.out.println("REMOVE " + queueArray[front] + " Was Removed ");
            queueArray[front] ="-1";
            front++;
            numberOfItems--;
        }
        else {
            System.out.println("Sorry But the Queue is empty");
        }
    }

    public void peek(){
        System.out.println("The First Element is " + queueArray[front]);
    }

    public void displayTheQueue(){

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < queueSize; n++){

            System.out.format("| %2s "+ " ", n);

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < queueSize; n++){



            if(queueArray[n].equals("-1")) System.out.print("|     ");

            else System.out.print(String.format("| %2s "+ " ", queueArray[n]));

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

    }

    public void priorityInsert(String input){
        int i;

        if(numberOfItems == 0){
            insert(input);
        }
        else{
            for(i = numberOfItems-1; i>=0; i--){
//                System.out.println("i = " + Integer.toString(i));
                if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){
                    queueArray[i+1] = queueArray[i];
                    displayTheQueue();
                }else break;
            }
//            System.out.println("i = " + Integer.toString(i));
            queueArray[i+1] = input;
            displayTheQueue();
            rear++;
            numberOfItems++;
        }
    }

    public static void main(String[] args){
       TheQueue theQueue = new TheQueue(10);
       theQueue.insert("10");
        theQueue.insert("15");
        theQueue.insert("11");
//        theQueue.priorityInsert("10");
//        theQueue.priorityInsert("19");
        theQueue.displayTheQueue();
//        theQueue.priorityInsert("15");
//        theQueue.priorityInsert("11");

        theQueue.remove();
        theQueue.remove();
        theQueue.displayTheQueue();
        theQueue.peek();
    }
}
