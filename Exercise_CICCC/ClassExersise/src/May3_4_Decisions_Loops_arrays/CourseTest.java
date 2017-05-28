package May3_4_Decisions_Loops_arrays;

import java.util.*;

/**
 * Created by senafunakubo on 2017-05-27.
 */

//Q6
public class CourseTest {
    public static void main(String[] args){
        ArrayList<String> student = new ArrayList<>();
        student.add("Amy");
        student.add("Bob");
        student.add("Cindy");
        student.add("David");
        System.out.println("");
        printOutArrayList(student);
    }

    public static void printOutArrayList(ArrayList<String> arrayList){
        for (String s : arrayList)
        System.out.println(s);
        System.out.println("Size:" + arrayList.size());  //arrayListにおいてはlengthではなくsize
    }
}
