package Jun1_Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by senafunakubo on 2017-06-04.
 */

public class ProductSales {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Product> map = new TreeMap<String, Product>();

        Scanner scan = new Scanner(new File("product.txt"));

        String code;
        Product product;

        while (scan.hasNext()){
            code = scan.nextLine(); //1行ずつファイルから読み取り
            product = map.get(code); //この段階だとnull

            if(product == null){ //map入力前
                map.put(code,new Product(code)); //key: TJ991 , value: TJ991[1]など //Productのカウントは1で設定済み
            }
            else{ //mapにあったら
                product.addSalesNO();
            }
        }

        System.out.println("Products:");
        for (Product prod: map.values()){
            System.out.println(prod); //ここでtoString呼び出し
        }

    }

}
