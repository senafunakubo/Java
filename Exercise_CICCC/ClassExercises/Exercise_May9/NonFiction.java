package Exercise_May9;

/**
 * Created by senafunakubo on 2017-05-11.
 */

public class NonFiction extends Book{

    public NonFiction(String title)
    {
        super(title);
        setPrice();
    }

    public void setPrice()
    {
        super.price = 37.99;
    }

    public String toString()
    {
        return super.toString();
    }
}
