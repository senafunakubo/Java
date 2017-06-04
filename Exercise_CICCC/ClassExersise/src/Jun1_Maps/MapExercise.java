package Jun1_Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by senafunakubo on 2017-06-03.
 */
public class MapExercise {

    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<Integer, String>();

        // add
        m1.put(101, "178");
        m1.put(105, "monooki");
        m1.put(103, "Lol");
        m1.put(178, "kuma");


        // remove
        m1.remove(105);


        // Iterator
        Iterator<Map.Entry<Integer, String>> entries = m1.entrySet().iterator();

        while (entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("");


        // copy
        Map<Integer, String> map2 = new HashMap<Integer,String>(m1);
        Iterator<Map.Entry<Integer, String>> copySet = map2.entrySet().iterator();
        while (copySet.hasNext()) {
            Map.Entry<Integer, String> entry = copySet.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("");


        // Search a value
        System.out.println(m1.get(178));

        // Search a key
        System.out.println(m1.containsValue("kuma"));
        System.out.println("");

        // Get all keys
        for (Integer key : m1.keySet()) {
            System.out.println("val : " + m1.get(key));
        }
        System.out.println("");

        // Get entryset
        for (Entry<Integer, String> entry : m1.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}
