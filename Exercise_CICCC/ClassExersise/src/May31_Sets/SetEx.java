package May31_Sets;


import java.util.*;

/**
 * Created by senafunakubo on 2017-05-31.
 */

public class SetEx {

    public static <T> boolean isSubset(Set<T> setA, Set<T> setB) {
        return setB.containsAll(setA);
    }

    public static void main(String[] args){
        Set<String> ex = new HashSet<String>();
        ex.add("aaaa");
        ex.add("xxxx");
        ex.add("cccc");
        ex.add("zzzz");
        ex.add("pppp");
        ex.remove("cccc");


        System.out.println("** HashSet **");
        System.out.println("its size " + ex.size());
        System.out.println("values are " + ex);
        System.out.println("");


        Set<String> ex1 = new LinkedHashSet<String>();
        ex1.add("aaaa");
        ex1.add("xxxx");
        ex1.add("cccc");
        ex1.add("zzzz");
        ex1.add("pppp");
        ex.remove("aaaa");

        System.out.println("** LinkedHashSet **");
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

        System.out.println("** TreeSet **");
        System.out.println("its size " + ex2.size());
        System.out.println("values are " + ex2);
        System.out.println("\n\n");

        //ONLY unique values
        List<Integer> no = Arrays.asList(3,9,3,9,2,2,1,1,18,5,4,6,6,6,7,7);
        Set<Integer> uniqueNO = new HashSet<>(no);
        System.out.println("values:" + uniqueNO);
        System.out.println("\n\n");



        List<Integer> a = new ArrayList<Integer>();
        a.add(20);

        List<Integer> b = new ArrayList<Integer>();
        b.add(30);
        b.add(10);

        List<Integer> c = new ArrayList<Integer>();
        c.add(50);
        c.add(40);

        Set<Integer> set = new HashSet<Integer>(a);
        Set<Integer> setLinked = new LinkedHashSet<Integer>(a);
        Set<Integer> setTree = new TreeSet<Integer>(a);


        System.out.println("** addAll **");
        set.addAll(b);//適当
        set.addAll(c);

        setLinked.addAll(b);//入れた順
        setLinked.addAll(c);

        setTree.addAll(b); //若い順
        setTree.addAll(c);

        System.out.println(set);
        System.out.println(setLinked);
        System.out.println(setTree);
        System.out.println("isSubset: " + isSubset(set, setLinked));
        System.out.println("isEmpty: " + set.isEmpty());
        System.out.println("size: " + setLinked.size());
        System.out.println("\n\n");


        System.out.println("** retainAll **");
        set.retainAll(b);
        setLinked.retainAll(b);
        setTree.retainAll(b);

        System.out.println(set);
        System.out.println(setLinked);
        System.out.println(setTree);
        System.out.println("isEmpty: " + setLinked.isEmpty());
        System.out.println("size: " + setTree.size());
        System.out.println("\n\n");


        System.out.println("** removeAll **");
        set.removeAll(c);
        setLinked.removeAll(c);
        setTree.removeAll(c);

        System.out.println(set);
        System.out.println(setLinked);
        System.out.println(setTree);
        System.out.println("isEmpty: " + setTree.isEmpty());
        System.out.println("size: " + set.size());
        System.out.println("\n\n");

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println("Value: "+iterator.next() + " ");
        }
        System.out.println("\n");

        Iterator iterator1 = setLinked.iterator();
        while (iterator1.hasNext()) {
            System.out.println("Value: " + iterator1.next() + " ");
        }
        System.out.println("\n");

        Iterator iterator2 = setTree.iterator();
        while (iterator2.hasNext()){
            System.out.println("Value: "+iterator2.next() + " ");
        }

    }
}
