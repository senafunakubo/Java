package Jun1_Maps;

import java.util.*;

/**
 * Created by senafunakubo on 2017-06-01.
 */

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(101, "aaa");
        m1.put(105, "zzz");
        m1.put(103, "ccc");
        m1.put(110, "ppp");
        System.out.println("Data is " + m1);
        //今はkey順になるけど、linkedにすると順番通りになる

        Map<Integer, String> m2 = new TreeMap<>();
        m2.put(110,"ppp");
        m2.put(101,"aaa");
        m2.put(105,"zzz");
        System.out.println("Data is " + m2);
    }
}
