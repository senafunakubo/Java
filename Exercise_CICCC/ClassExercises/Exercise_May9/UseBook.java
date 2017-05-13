package Exercise_May9;

/**
 * Created by senafunakubo on 2017-05-11.
 */

public class UseBook {
    public static void main(String[] args) {

        //Fiction
        Fiction fictionBook = new Fiction("Fiction is NO.1");
        System.out.println(fictionBook);

        System.out.println("");

        //Nonfiction
        NonFiction nonFictionBook = new NonFiction("The World of NonFiction");
        System.out.println(nonFictionBook);

    }
}
