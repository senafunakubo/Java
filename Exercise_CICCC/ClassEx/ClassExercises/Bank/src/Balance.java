/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
 
    
  public void deposit(double amount)
  {
    checkingBalance = checkingBalance + amount;
    savingBalance = savingBalance + amount;
  }

  public void withdraw(double amount)
  {
    checkingBalance = checkingBalance - amount;
    savingBalance = savingBalance - amount;
  }
  
  public double getCheckingBalance()
  {
    return checkingBalance;
  }
  
  public double getSavingBalance()
  {
    return savingBalance;
  }
}
