package Jun1_Maps;

import java.util.Map;
import java.util.TreeMap;
import  java.util.Iterator;
import  java.util.Set;

/**
 * Created by senafunakubo on 2017-06-04.
 */
public class Frequency {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 3, 5, 10, 3, 5, 10};
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            int arrayNum = arr[i];
            if (!map.containsKey(arrayNum)) {
                map.put(arrayNum, 1);
            } else {
                map.put(arrayNum, (map.get(arrayNum) + 1)); //map.get(arrayNum)でkeyを得てvalueに1プラス
                //既に存在するキーの場合は値は上書きされる
            }
        }

        Set<Integer> stInts = map.keySet(); //keyを取得
        Iterator<Integer> itrInts = stInts.iterator(); //Iterator

        while (itrInts.hasNext()) {
            int iValue = itrInts.next();
            int iHits = map.get(iValue);
            System.out.println("Frequency of " + iValue + " is " + iHits);
        }
    }
}