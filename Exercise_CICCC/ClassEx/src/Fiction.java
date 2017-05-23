/**
 * Created by senafunakubo on 2017-05-11.
 */

public class Fiction extends Book{

    public Fiction(String title)
    {
        super(title);
        setPrice();
    }

    public void setPrice()
    {
        super.price = 24.99;
    }

    public String toString()
    {
        return super.toString();
    }
}