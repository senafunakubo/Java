package May9_Interface_abstract;

/**
 * Created by senafunakubo on 2017-05-27.
 */

public abstract class Account {

    //ここをprivateにすると他でこの値を参照できない
    int number;
    double balance;

    Account(int number){
        this.number = number;
        this.balance = 0.0;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public abstract int getNumber();
    public abstract double getBalance();

    public abstract String toString();
}