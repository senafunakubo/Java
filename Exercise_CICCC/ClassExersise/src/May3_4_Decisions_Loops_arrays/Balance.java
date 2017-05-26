package May3_4_Decisions_Loops_arrays;

/**
 *
 * @author senafunakubo
 */

public class Balance {
    public double checkingBalance;
    public double savingBalance;

    public Balance()
    {
        checkingBalance = 0;
        savingBalance = 0;
    }

    public Balance(double initialBalance)
    {
        checkingBalance = initialBalance;
        savingBalance = initialBalance;
    }


    public void withdraw(double amount)
    {
        checkingBalance = checkingBalance - amount;
        savingBalance = savingBalance - amount;
    }

}
