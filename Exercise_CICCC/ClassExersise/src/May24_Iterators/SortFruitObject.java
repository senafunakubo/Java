package May24_Iterators;

/**
 * Created by senafunakubo on 2017-05-29.
 */

import java.util.Arrays;

public class SortFruitObject{

    public static void main(String args[]){

        Fruit[] fruits = new Fruit[4];
        Fruits[] fruits1 = new Fruits[4];

        Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70);
        Fruit apple = new Fruit("Apple", "Apple description",100);
        Fruit orange = new Fruit("Orange", "Orange description",80);
        Fruit banana = new Fruit("Banana", "Banana description",90);

        Fruits p = new Fruits("Pineapple", "Pineapple description",70);
        Fruits a = new Fruits("Apple", "Apple description",100);
        Fruits o = new Fruits("Orange", "Orange description",80);
        Fruits b = new Fruits("Banana", "Banana description",90);

        fruits[0]=pineappale;
        fruits[1]=apple;
        fruits[2]=orange;
        fruits[3]=banana;

        fruits1[0] = p;
        fruits1[1] = a;
        fruits1[2] = o;
        fruits1[3] = b;

        Arrays.sort(fruits);
        Arrays.sort(fruits1);

        int i=0;
        for(Fruit temp: fruits){
            System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
        }
        System.out.println("");

        int j=0;
        for(Fruits tem: fruits1){
            System.out.println("fruits " + ++j + " : " + tem.getFruitName() + ", Quantity : " + tem.getQuantity());
        }

    }
}