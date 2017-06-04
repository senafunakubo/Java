package Jun1_Maps;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by senafunakubo on 2017-06-03.
 */
public class MapExercise {

    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<Integer, String>();
        Map<Integer, String> m2 = new LinkedHashMap<Integer, String>();
        Map<Integer, String> m3 = new TreeMap<Integer, String>();

        // add
        m1.put(101, "178");
        m1.put(105, "monooki");
        m1.put(103, "Lol");
        m1.put(178, "kuma");

        m2.put(201, "Objective-C");
        m2.put(205, "Java");
        m2.put(203, "Swift");

        m3.put(302, "I miss ELS");
        m3.put(301, "I got lots of friends from many countries");
        m3.put(304, "2016 is the best year ever");

        // remove
        m1.remove(105);
        m2.remove(203);


        // Iterator
        Iterator<Map.Entry<Integer, String>> entries = m1.entrySet().iterator();

        while (entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("");

        Iterator<Map.Entry<Integer, String>> entriesForLinked = m2.entrySet().iterator();

        while (entriesForLinked.hasNext()){
            Map.Entry<Integer, String> entry = entriesForLinked.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("");

        Iterator<Map.Entry<Integer, String>> entriesTree = m3.entrySet().iterator();

        while (entriesTree.hasNext()){
            Map.Entry<Integer, String> entry = entriesTree.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("");

        // copy
        Map<Integer, String> map2 = new HashMap<Integer,String>(m1);
        Iterator<Map.Entry<Integer, String>> copySet = map2.entrySet().iterator();
        System.out.println("** Copied HashMap **");
        while (copySet.hasNext()) {
            Map.Entry<Integer, String> entry = copySet.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("");


        // Search a value
        System.out.println("** Search a value **");
        System.out.println(m1.get(178));
        System.out.println(m2.get(201));
        System.out.println(m3.get(302));
        System.out.println("");

        // Search a key
        System.out.println("** Search a key **");
        System.out.println(m1.containsValue("kuma"));
        System.out.println(m2.containsValue("Swift"));
        System.out.println(m3.containsValue("momomooooo"));
        System.out.println("");

        // Get all keys
        System.out.println("** Get all keys **");
        for (Integer key : m1.keySet()) {
            System.out.println("val : " + m1.get(key));
        }
        System.out.println("");

        for (Integer key : m2.keySet()){
            System.out.println("val : " + m2.get(key));
        }
        System.out.println("");

        for (Integer key : m3.keySet()){
            System.out.println("val : " + m3.get(key));
        }
        System.out.println("");


        // Get entryset
        System.out.println("** Get entryset **");
        for (Entry<Integer, String> entry : m1.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("");

        for (Entry<Integer,String> entry : m2.entrySet()){
            System.out.println(entry.getValue());
        }
        System.out.println("");

        for (Entry<Integer,String> entry : m3.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
