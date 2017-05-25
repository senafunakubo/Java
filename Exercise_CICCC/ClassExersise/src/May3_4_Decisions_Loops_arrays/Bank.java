package May3_4_Decisions_Loops_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author senafunakubo
 */
public class Bank extends Balance{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello. You can withdraw your money from checking or saving account or both.\n\r");

        System.out.println("[1] Checking Account");
        System.out.println("[2] Saving Account");

        int choose;
        Scanner chooseAccount = new Scanner(System.in);
        choose = chooseAccount.nextInt();
        System.out.println("");

        double ch =0.0;
        double sa = 0.0;

        Balance CheckingAccount = new Balance(300);
        Balance savingAccount = new Balance(500);

        while (choose<3) {
            switch (choose) {
                case 1:
                    ch = WithdrawMoneyFromChecking(CheckingAccount);
                    sa = savingAccount.savingBalance;
                    bothAccount(ch,sa);
                    break;
                case 2:
                    sa = WithdrawMoneyFromSaving(savingAccount);
                    ch = CheckingAccount.checkingBalance;
                    bothAccount(ch,sa);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("It's invalid.");
                    break;
            }
            System.out.println("");
            System.out.println("Push the button:");
            choose = chooseAccount.nextInt();
        }

        if(choose ==3){
            System.out.println("See you next time!");
        }

        if(choose<1 || choose>4){
            System.out.println("");
            System.out.println("It's invalid. Bye!");
        }

    }

    public static void bothAccount(double checkingAmount, double savingAmount) {
        //function呼び出し＋戻り値をここでdoubleに入れ込んでいる
//        checkingAmount = WithdrawMoneyFromChecking();
//        savingAmount = WithdrawMoneyFromSaving();
        if (checkingAmount <= 10 && savingAmount <= 100) {
            System.out.println("Both accounts are dangerously low!");
        }
    }

    public static double WithdrawMoneyFromChecking(Balance CheckingAccount)
    {
        int money;
//        Balance CheckingAccount = new Balance(300);
        Scanner scanWithdrawAmount = new Scanner(System.in);
        System.out.print("Now you have $" + CheckingAccount.checkingBalance + " in your checking account.\n\r");
        System.out.print("Enter the amount you wanna withdraw from Checking account:");
        boolean valid = false;
        while(! valid )
        {
            try
            {
                money = scanWithdrawAmount.nextInt();
                CheckingAccount.withdraw(money);
                if(money > 0 && CheckingAccount.checkingBalance>10)
                {
                    valid = true;
                    System.out.println("You withdrew $"+money+"." + " Account balance is $"+CheckingAccount.checkingBalance + ".\n\r");
                }
                else if(money > 0 && CheckingAccount.checkingBalance<=10) //less than $10
                {
                    valid = true;
                    System.out.println("You withdrew $"+money+"." + " Account balance is $"+CheckingAccount.checkingBalance + ".\n\r");
                    System.out.println("Checking account balance is low.\n\r\n\r");
                }
                else //Try to withdraw less than $0
                {
                    valid = true;
                    System.out.println("It's invalid.\n\r\n\r");
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Not a valid number.\n\r\n\r");
                break;
            }

        }//The end of while loop
        return CheckingAccount.checkingBalance;

    }//The end of WithdrawMoneyFromChecking function


    public static double WithdrawMoneyFromSaving(Balance savingAccount)
    {
        int money;
//        Balance savingAccount = new Balance(500);
        Scanner scanWithdrawAmount = new Scanner(System.in);
        System.out.print("Now you have $" + savingAccount.savingBalance + " in your Saving account.\n\r");
        System.out.print("Enter the amount you wanna withdraw from Saving account:");
        boolean valid = false;
        while(! valid )
        {
            try
            {
                money = scanWithdrawAmount.nextInt();
                savingAccount.withdraw(money);
                if(money > 0 && savingAccount.savingBalance>100)
                {
                    valid = true;
                    System.out.println("You withdrew $"+money+"." + " Account balance is $"+savingAccount.savingBalance + ".");
                }
                else if(money > 0 && savingAccount.savingBalance<=100) //less than $100
                {
                    valid = true;
                    System.out.println("You withdrew $"+money+"." + " Account balance is $"+savingAccount.savingBalance + ".");
                    System.out.println("Saving account balance is low.\n\r\n\r");
                }
                else //Try to withdraw less than $0
                {
                    valid = true;
                    System.out.println("It's invalid.\n\r\n\r");
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Not a valid number.\n\r\n\r");
                break;
            }

        }//The end of while loop
        return savingAccount.savingBalance;
    }//The end of WithdrawMoneyFromSaving

} //The end of ALL