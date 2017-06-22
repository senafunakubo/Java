package May9_Interface_abstract;

/**
 * Created by senafunakubo on 2017-05-27.
 */

public class Saving extends Account {

    double interestRate;

    Saving(int number,double interestRate){
        super(number);
        this.interestRate = interestRate;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        String account;
        account = "Saving Account Information" + "\nAccount Number : "+ this.getNumber() + " Account Balance : "+ this.getBalance();
        account += " The Interest Rate : " + this.interestRate;
        return account;
    }


}