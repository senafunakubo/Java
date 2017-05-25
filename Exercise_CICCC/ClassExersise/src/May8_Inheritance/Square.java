package May8_Inheritance;

/**
 * Created by senafunakubo on 2017-05-11.
 */

public class Square {

    private int height;
    private int width;
    private int surfaceArea;

    public int computeSurfaceArea()
    {
       this.surfaceArea = this.height * this.width;
       return  this.surfaceArea;
    }

    public void setHeight(int heights)
    {
        this.height = heights;
    }

    public void setWidth(int widths)
    {
        this.width = widths;
    }
}
