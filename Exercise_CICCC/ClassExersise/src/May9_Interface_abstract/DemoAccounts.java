package May9_Interface_abstract;

/**
 * Created by senafunakubo on 2017-05-27.
 */

public class DemoAccounts {

    public static void main(String[] args) {
        Checking checking = new Checking(1);
        Saving saving = new Saving(1,2.4);
        checking.setBalance(10.21);
        saving.setBalance(200.12);

        checking.getInformation();
        System.out.println("");
        saving.getInformation();
    }

}