package May24_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;

/**
 * Created by senafunakubo on 2017-05-29.
 */

public class ArrayIterators {
    public static void main(String[] args) {
        //Q1. Create one program for ArrayList iterator
        printArrayIterator();

        //Q2. Create one program for LinkedList iterator
        printLinkedIterator();

        //Q3. Create one program that demonstrate the use of comparator and comparable interface
        demoComparator();
    }

    public static void printArrayIterator() {
        List<String> arrayListDemo = new ArrayList<String>();
        arrayListDemo.add("Aseem");
        arrayListDemo.add("Sena");
        arrayListDemo.add("O-min");
        arrayListDemo.add("Annri");

        Iterator<String> itr = arrayListDemo.iterator();

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.print(str + "  ");
        }
        System.out.println("");
    }

    public static void printLinkedIterator() {
        List<String> linkedListDemo = new LinkedList<String>();
        linkedListDemo.add("Aseem");
        linkedListDemo.add("Sena");
        linkedListDemo.add("O-min");
        linkedListDemo.add("Annri");

        Iterator<String> itr = linkedListDemo.iterator();

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.print(str + "  ");
        }
        System.out.println("");
    }

    public static void demoComparator() {
        List<String> arrayListDemo = new LinkedList<String>();
        arrayListDemo.add("Aseeeeeem");
        arrayListDemo.add("Sena");
        arrayListDemo.add("O-min");
        arrayListDemo.add("Annnnnnnnnnri");

        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                if (t1.length() > t2.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        arrayListDemo.sort(lengthComparator);
        arrayListDemo.forEach(s -> System.out.print(s + "  "));
        System.out.println("");
    }


}
