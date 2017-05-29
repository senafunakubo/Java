package May23_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.*;

/**
 * Created by senafunakubo on 2017-05-29.
 */
public class ListExercise {

        public static void main(String a[]) {

//          Q1.ArrayList implements which of the following?
//             D.  all the above(List , Random Access,  Cloneable)

//          Q2.What should we use when add and remove operations are more frequent than get operations?
//             B.  ArrayList


//          Q1. How to read all elements in ArrayList by using iterator?
            ArrayList<String> arr = new ArrayList<String>();
            arr.add("First");
            arr.add("Second");
            arr.add("Third");
            arr.add("Random");
            Iterator<String> itr = arr.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
            System.out.println("\n");


//          Q2. How to copy or clone a ArrayList?
            ArrayList<String> arr2 = new ArrayList<String>();
            arr2.add("First");
            arr2.add("Second");
            arr2.add("Third");
            arr2.add("Random");
            System.out.println("Actual ArrayList:" + arr2);

            ArrayList<String> copy = (ArrayList<String>) arr2.clone();
            System.out.println("Cloned ArrayList:" + copy);
            System.out.println("\n");


//          Q3. How to find does ArrayList contains all list elements or not
            ArrayList<String> arr3 = new ArrayList<String>();
            arr3.add("First");
            arr3.add("Second");
            arr3.add("Third");
            arr3.add("Random");

            List<String> list = new ArrayList<String>();
            list.add("Second");
            list.add("Random");
            System.out.println("Does ArrayList contains all list elements?: " //true
                    + arr3.containsAll(list));
            list.add("one");

            System.out.println("Does ArrayList contains all list elements?: " //addしたのでfalse
                    + arr3.containsAll(list));
            System.out.println("\n");


//          Q4. Perform sort and reverse sort on arraylist
            ArrayList<String> unsortedList = new ArrayList<String>();
            unsortedList.add("Java");
            unsortedList.add("Objective-C");
            unsortedList.add("CSS");

            System.out.println("unsorted ArrayList in Java : " + unsortedList);

            //Sorting ArrayList in ascending Order in Java
            Collections.sort(unsortedList);
            System.out.println("Sorted ArrayList in Java - Ascending order : " + unsortedList);

            //Sorting ArrayList in descending order in Java
            Collections.sort(unsortedList, Collections.reverseOrder());
            System.out.println("Sorted ArrayList in Java - Descending order : " + unsortedList);
            System.out.println("\n");


//          Q5. Write a Java program to compare two array lists.
            ArrayList<String> al1 = new ArrayList<String>();
            al1.add("hi");
            al1.add("How are you");
            al1.add("Good Morning");

            ArrayList<String> al2 = new ArrayList<String>();
            al2.add("hi");
            al2.add("Good Evening");
            al2.add("bye");

            //Storing the comparison output in ArrayList<String>
            ArrayList<String> al3 = new ArrayList<String>();
            for (String temp : al1)
                al3.add(al2.contains(temp) ? "Yes" : "No");
            System.out.println(al3);
            System.out.println("\n");


            System.out.println("Q6.------------------");
            LinkedList<Integer> z = new LinkedList<Integer>();
            z.add(5); z.add(7); z.add(3); z.add(12); z.add(8);
            System.out.println("The sum of a is " + sumlist(z));
            System.out.println("\n");


            System.out.println("Q7.------------------");
            LinkedList<Integer> w = reverse(z);
            for (Integer e: w)
                System.out.println(e);
            System.out.println("\n");


//          Q8. Write a Java program to append the specified element to the end of a linked list.
            System.out.println("Q8.------------------");
            // create an empty linked list
            LinkedList<String> l_list = new LinkedList<String>();

            // use add() method to add values in the linked list
            l_list.add("Red");
            l_list.add("Green");
            l_list.add("Black");
            System.out.println("Original linked list:" + l_list);

            // Add an element at the end of a linked list
            l_list.offerLast("Pink");
            System.out.println("Final linked list:" + l_list);
            System.out.println("\n");


//          Q9. Write a Java program of swap two elements in an linked list.
            System.out.println("Q9.------------------");
            LinkedList<String> listJ = new LinkedList<String>();
            listJ.add("Java");
            listJ.add("Play");
            listJ.add("Watch");
            listJ.add("Glass");
            listJ.add("Movie");
            listJ.add("Girl");
            System.out.println("Original results: ");
            for(String str: listJ){
                System.out.println(str);
            }
            System.out.println("");

            Collections.swap(listJ, 2, 5);
            System.out.println("Results after swap operation:");
            for(String str: listJ){
                System.out.println(str);
            }
            System.out.println("\n");


//          Q10. Write a Java program to join two linked lists.
            System.out.println("Q10.------------------");
            LinkedList <String> c1 = new LinkedList <String> ();

            c1.add("Red");
            c1.add("Green");
            c1.add("Black");
            c1.add("White");
            c1.add("Pink");
            System.out.println("List of first linked list: " + c1);

            LinkedList <String> c2 = new LinkedList <String> ();
            c2.add("Red");
            c2.add("Green");
            c2.add("Black");
            c2.add("Pink");
            System.out.println("List of second linked list: " + c2);

            // Let join above two list
            LinkedList <String> arra = new LinkedList <String> ();
            arra.addAll(c1);
            arra.addAll(c2);
            System.out.println("New linked list: " + arra);
        }


//  Q6. Write a function sumlist(LinkedList<Integer> lst) that adds up a list of Integer.
    public static int sumlist(LinkedList<Integer> lst) {
        int sum = 0;
        for (Integer x: lst)
            sum += x;
        return sum;
    }

//  Q7. Write a function reverse(LinkedList<Object> lst) that produces a new list in the reverse order of the input list.
    public static <E>LinkedList<E> reverse(LinkedList<E> lst) {
        LinkedList<E> array = new LinkedList<E>();
        for (E e: lst)
            //こうすると逆順に
            array.addFirst(e);
        return array;

    }
}
