package Jun1_Maps;


/**
 * Created by senafunakubo on 2017-06-04.
 */
public class Product{
    private String code;
    private int salesNO;

    public Product(String code) {
        this.code = code;
        this.salesNO = 1;
    }

    public void addSalesNO() {
        salesNO++;
    }

    public String toString(){
        return code + "[" + salesNO + "]";
    }

}
