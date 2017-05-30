package May25_Stack;

import java.util.Iterator;

/**
 * Created by senafunakubo on 2017-05-30.
 */
public class Main {

    public static void main(String[] args){
        ExForQueue exQ = new ExForQueue();
        String ice1 = "GreenTea";
        String ice2 = "Orange";
        exQ.enqueue(ice1);
        exQ.enqueue(ice2);
        exQ.itr();

        exQ.dequeue();
        exQ.itr();
    }
}
