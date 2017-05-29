package May9_Interface_abstract;

import java.util.ArrayList;

/**
 * Created by senafunakubo on 2017-05-28.
 */
public class AccountArray {

    public static void main(String[] args) {

        //ここでAccountを指定するの大事！
        ArrayList<Account> arrayList = new ArrayList();

        Checking checking1 = new Checking(10);
        checking1.setBalance(25.0);

        Saving saving1 = new Saving(12,8.0);
        saving1.setBalance(10000.5);

        Checking checking2 = new Checking(5);
        checking2.setBalance(12.0);

        Saving saving2 = new Saving(3,1.5);
        saving2.setBalance(2000.75);

        Checking checking3 = new Checking(100);
        checking3.setBalance(12);

        Saving saving3 = new Saving(10000,12);
        saving3.setBalance(800);

        Saving saving4 = new Saving(111,5.0);
        saving4.setBalance(100000.0);

        Checking checking4 = new Checking(120);
        checking4.setBalance(90);

        Checking checking5 = new Checking(20);
        checking5.setBalance(1200.4);

        Checking checking6 = new Checking(9);
        checking6.setBalance(1781780);

        arrayList.add(saving1);
        arrayList.add(saving2);
        arrayList.add(saving3);
        arrayList.add(saving4);
        arrayList.add(checking1);
        arrayList.add(checking2);
        arrayList.add(checking3);
        arrayList.add(checking4);
        arrayList.add(checking5);
        arrayList.add(checking6);

        for(Account a : arrayList){
            System.out.println(a.toString());
        }

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i).getBalance());
        }
    }

}
