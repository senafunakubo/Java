package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by senafunakubo on 2017-05-23.
 */
public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        System.out.println("First List " + list);

        Iterator<String> i = list.iterator();

        while(i.hasNext()){
            String num = i.next();
            if(!num.startsWith("10")&&!num.startsWith("20")){
                i.remove();
                System.out.println(list);
            }
        }

         System.out.println("Final List " + list);

    }
}