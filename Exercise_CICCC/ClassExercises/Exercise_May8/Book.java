package Exercise_May8;

/**
 * Created by senafunakubo on 2017-05-09.
 */

//Parent class
public class Book {

    private String title;
    private int pages;

    //Constructor
    public Book(String titleOfBooks,int pagesOfBooks)
    {
        this.title = titleOfBooks;
        this.pages = pagesOfBooks;
    }

    //set...voidで引数もち
    public void setTitle(String titleOfBooks){
        title =titleOfBooks;
    }

    public void setpages(int pagesOfBooks){
        pages = pagesOfBooks;
    }


    //get
    public String getTitle()
    {
        return this.title;
    }

    public  int getPages()
    {
        return this.pages;
    }

    public String toString(){
        return "Book: " + getTitle() + " Pages: " + getPages();
    }

}
