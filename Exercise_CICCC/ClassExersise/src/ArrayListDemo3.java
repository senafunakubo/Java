import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//http://qiita.com/yoshi389111/items/c24f8beefb7b96cad921

/**
 * Created by senafunakubo on 2017-05-23.
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");

        System.out.println("First List " + list);

        ListIterator<String> i = list.listIterator();

        while(i.hasNext()) {
            String num = i.next();
            if (num.equals("3")||num.equals("6")) {
                i.remove();
                System.out.println(list);
            }
        }

        while (i.hasPrevious()){
            String num = i.previous();
            if(num.equals("2")){
                i.remove();
                System.out.println(list);
            }
        }

        while (i.hasNext()){
            String num = i.next();
            if(num.equals("7")){
                i.remove();
                System.out.println(list);
            }
        }

        while (i.hasPrevious()){
            String num = i.previous();
            if(num.equals("5")){
                i.remove();
                System.out.println(list);
            }
        }
    }
}
