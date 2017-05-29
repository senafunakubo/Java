package May9_Interface_abstract;

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
         BookList.add(new NonFiction("Fiction is so-so"));
         BookList.add(new Fiction("Don't read NonFiction books"));
         BookList.add(new Fiction("At first, READ FICTION"));
         BookList.add(new NonFiction("First Fiction Book"));
         BookList.add(new Fiction("Everything starts from Fiction"));
         BookList.add(new NonFiction("The NonF world is beautiful"));
         BookList.add(new Fiction("Fiction! Fiction!"));
         BookList.add(new NonFiction("Non Fiction!!"));

        for (Book book : BookList){
            System.out.println(book);
        }

    }
}
