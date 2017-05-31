package May31_Sets;

import java.util.HashSet; //For dictionary 
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by senafunakubo on 2017-05-31.
 */
public class BookSetDemo {
    public static void main(String[] args){
        HashSet<Book> book = new HashSet<>();
        Book b1 = new Book(101,"Let's teach C","aaaa",1);
        Book b2 = new Book(102,"Java","qqqq",2);
        Book b3 = new Book(103,"HTML","cccc",3);
        book.add(b1);
        book.add(b2);
        book.add(b3);

        for (Book b : book){
            System.out.println(b.id + " " + b.title + " " + b.author + " " + b.quantity);
        }
    }
}
