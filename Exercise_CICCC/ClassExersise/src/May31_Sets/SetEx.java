package May31_Sets;


import java.util.*;

/**
 * Created by senafunakubo on 2017-05-31.
 */

public class SetEx {
    public static void main(String[] args){
        Set<String> ex = new HashSet<String>();
        ex.add("aaaa");
        ex.add("xxxx");
        ex.add("cccc");
        ex.add("zzzz");
        ex.add("pppp");

        System.out.println("its size " + ex.size());
        System.out.println("values are " + ex);
        System.out.println("");

        Set<String> ex1 = new LinkedHashSet<String>();
        ex1.add("aaaa");
        ex1.add("xxxx");
        ex1.add("cccc");
        ex1.add("zzzz");
        ex1.add("pppp");

        System.out.println("its size " + ex1.size());
        System.out.println("values are " + ex1);
        System.out.println("");

        Set<String> ex2 = new TreeSet<String>();
        ex2.add("aaaa");
        ex2.add("xxxx");
        ex2.add("cccc");
        ex2.add("zzzz");
        ex2.add("pppp");
        ex2.remove("zzzz");

        System.out.println("its size " + ex2.size());
        System.out.println("values are " + ex2);
        System.out.println("");

        //ONLY unique values
        List<Integer> no = Arrays.asList(3,9,3,9,2,2,1,1,18,5,4,6,6,6,7,7);
        Set<Integer> uniqueNO = new HashSet<>(no);
        System.out.println("values:" + uniqueNO);

    }
}
