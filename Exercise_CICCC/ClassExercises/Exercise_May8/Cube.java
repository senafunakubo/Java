package Exercise_May8;

/**
 * Created by senafunakubo on 2017-05-11.
 */
public class Cube extends Square {

    private int depth;
    private int surfaceArea;

    public void setDepth(int depths)
    {
        this.depth = depths;
    }

    public int computeSurfaceArea()
    {
        this.surfaceArea = super.computeSurfaceArea() * this.depth;
        return this.surfaceArea;
    }
}
