/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
//      System.out.println("Hello. You can choose checking or saving account to withdraw your money.\n\r");
        System.out.println("Hello. You can withdraw your money from checking or saving account or both.\n\r");
        
//        System.out.println("If you prefer Checking, Type 1. prefering Saving is type 2. \n\r");
//        
//        int choose;
//        Scanner chooseAccount = new Scanner(System.in);
//        choose = chooseAccount.nextInt();
//        switch (choose) {
//            case 1:
//                WithdrawMoneyFromChecking();
////                break;
//            case 2:
//                WithdrawMoneyFromSaving();
//                break;
//            default:
//                System.out.println("It's invalid.");
//                break;
//        }
        
        //function呼び出し＋戻り値をここでdoubleに入れ込んでいる
        double checkingAmount = WithdrawMoneyFromChecking();
        double savingAmount = WithdrawMoneyFromSaving();
       if(checkingAmount<=10 && savingAmount<=100)
       {
           System.out.println("Both accounts are dangerously low!");
       }
    }
  
     
     public static double WithdrawMoneyFromChecking()
    {
        int money;
        Balance CheckingAccount = new Balance(300);
        Scanner scanWithdrawAmount = new Scanner(System.in);
         System.out.print("Now you have $300 in your checking account.\n\r");
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
     
     
    public static double WithdrawMoneyFromSaving()
    {
       int money;
        Balance savingAccount = new Balance(500);
        Scanner scanWithdrawAmount = new Scanner(System.in);
         System.out.print("Now you have $500 in your Saving account.\n\r");
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
       return savingAccount.checkingBalance;
    }//The end of WithdrawMoneyFromSaving
        
} //The end of ALL