package Exercise_May9;
import java.util.ArrayList;

/**
 * Created by senafunakubo on 2017-05-11.
 */

public class BookArray {
    public static void main(String[] args) {
        ArrayList<Book> BookList = new ArrayList();

        //http://stackoverflow.com/questions/36357287/initialize-arraylist-of-type-abstract-class
         BookList.add(new Fiction("Fiction is amazing"));
         BookList.add(new NonFiction("NonFiction is wonderful"));
         BookList.add(new NonFiction("Fiction is so-so, NonFiction is best"));
         BookList.add(new Fiction("Don't read NonFiction books"));
         BookList.add(new Fiction("At first, READ FICTION"));

        for (Book n : BookList){
            System.out.println(n);
        }

    }
}
