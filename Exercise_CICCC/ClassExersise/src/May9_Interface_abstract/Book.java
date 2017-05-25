package May9_Interface_abstract;

/**
 * Created by senafunakubo on 2017-05-11.
 */

public abstract class Book
{
    //ここをprivateにすると他クラスで引っ張れない
     String title;
     double price;

    public Book(String titleOfBook)
    {
        this.title = titleOfBook;
    }

    public String getTitle()
    {
        return this.title;
    }

    public double getPrice()
    {
        return this.price;
    }

    //abstract method
    abstract public void setPrice();

    public String toString()
    {
        return "The Title of book:" + title + "   The price:$" + price;
    }

}
