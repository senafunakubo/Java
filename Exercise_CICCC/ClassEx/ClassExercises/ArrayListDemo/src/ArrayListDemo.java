import java.util.List;
import java.util.*;

/**
 * Created by senafunakubo on 2017-05-23.
 */
public class ArrayListDemo {

    public static void main(String[] args){
//        List<String> myList = new ArrayList<>();
        List<String> myList = new LinkedList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");

        myList.add(1,"ten");

        for (String s :myList){
            System.out.println(s);
        }
    }
}
