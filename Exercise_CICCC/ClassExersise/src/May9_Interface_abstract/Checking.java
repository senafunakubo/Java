package May9_Interface_abstract;

/**
 * Created by senafunakubo on 2017-05-27.
 */

public class Checking extends Account {

    Checking(int number){
        super(number);
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
        account = "Checking Account Information" + "\nAccount Number : "+ this.getNumber() + " Account Balance : "+ this.getBalance();
        return account;
    }

    public void getInformation(){
        System.out.println("Checking Account Information");
        System.out.println("Account Number : "+ this.getNumber());
        System.out.println("Account Balance : "+ this.getBalance());
    }

}