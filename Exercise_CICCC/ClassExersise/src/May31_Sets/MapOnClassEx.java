package May31_Sets;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Created by senafunakubo on 2017-06-01.
 */
public class MapOnClassEx {
    public static void main(String[] args){
        Map<Integer,Book>m1 = new HashMap<>();
        Book b1 = new Book(101,"C","aaa",5);
        Book b2 = new Book(105,"Java","bbb",6);
        Book b3 = new Book(102,"C#","ccc",10);
        Book b4 = new Book(104,"html","qqq",4);
        m1.put(1,b1);
        m1.put(2,b2);
        m1.put(3,b3);
        m1.put(4,b4);

        for(Map.Entry<Integer,Book>entry: m1.entrySet()){
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println("key " + key);
            System.out.println("id: " + b.id + "\ttitle: " + b.title + "\n");
        }
    }
}
