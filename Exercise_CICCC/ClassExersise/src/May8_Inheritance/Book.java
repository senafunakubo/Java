package May8_Inheritance;

/**
 * Created by senafunakubo on 2017-05-24.
 */
public class Book {

    private String title;
    private int pages;

    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public String toString()
    {
        return "Book: " + getTitle() + " Pages: " + getPages();
    }
}
