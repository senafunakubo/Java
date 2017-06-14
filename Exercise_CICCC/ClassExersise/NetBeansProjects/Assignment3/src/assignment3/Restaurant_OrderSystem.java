/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import assignment3.MyPanel;
import java.util.Scanner;


/**
 *
 * @author senafunakubo
 */
public class Restaurant_OrderSystem {
    public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		Scanner NumScanner=new Scanner(System.in);
		System.out.println("******~WELCOME TO BANGLADESHI FOOD CORNER~******");
		
		double total=0;
		
		// starter prices: declare variable an assign values
		double Peyaju=1.00;
		double Beguni=2.00;
		double AlurChop=3.00;
		
		// main meal prices
		double PantaVath=5.00;
		double ChickenBiriyani=6.00;
		double BeefBiriyani=7.00;
		
		// desert prices
		double Pudding=2.50;
		double Falooda=1.50;
		double Jilapi=3.00;
		
		// variable to allow user to select choice from the menu;
		char choice;
		//double total;

		// loop from here so that this is printed on the screen continuously till quite
		do
			{
				System.out.println("|-----------------------------------------|");
				System.out.println("|   Select from the choices below         |");
				System.out.println("|-----------------------------------------|");
				System.out.println("| Code     |         Description          |");
				System.out.println("|-----------------------------------------|");
				System.out.println("| S        | Starter                      |");
				System.out.println("| M        | Main                         |");
				System.out.println("| D        | Dessert                      |");
				System.out.println("|-----------------------------------------|");
				System.out.println("| E        |           EXIT               |");
				System.out.println("|-----------------------------------------|");
				System.out.println();
				System.out.println("Enter choice");
				
				
				// user choice here
				choice=kb.next().charAt(0);
		
				
				// switch statement to allow user to select type of meal
				switch(choice)
					{
						/** this is our first case of the switch statement.
						 * the user will select options from the starter menu.
						 * we will repeat another do while statement and case for each item chosen.
						*/
						case 'S': 	
									do{
										System.out.println("|-----------------------------------------|");
										System.out.println("|   Select starter from the choices below |");
										System.out.println("|-----------------------------------------|");
										System.out.println("| Code     |         Description          |");
										System.out.println("|-----------------------------------------|");
										System.out.println("| P        | Peyaju              RM1.00   |");
										System.out.println("| B        | Beguni              RM2.00   |");
										System.out.println("| A        | Alur_Chop           RM3.00   |");
										System.out.println("|-----------------------------------------|");
										System.out.println("| R        |           RETURN             |");
										System.out.println("|-----------------------------------------|");
										System.out.println("| E        |            EXIT              |");
										System.out.println("|-----------------------------------------|");
										System.out.println();
										System.out.println("Enter choice");
									
										System.out.println("Enter quantity");
										
										// user choice here
										choice=kb.next().charAt(0);
										// user quantity here
										total=NumScanner.nextInt();
								
									switch(choice)
										{
												case 'P' : System.out.println("Peyaju selected");
												// remember that total was initialized from zero
												total=total*Peyaju;
												System.out.println("Your total bill is RM " +total);
												System.out.println("Would you like to order more?");
												break;
												
												case 'B' : System.out.println("Beguni selected");
												total=total*Beguni;
												System.out.println("Your total bill is RM " +total);
												System.out.println("Would you like to order more?");

												break;
												
												case 'A' : System.out.println("Alur_Chop selected");
												total=total*AlurChop;
												System.out.println("Your total bill is RM " +total);
												System.out.println("Would you like to order more?");
												break;
												
												// return program to 1st screen
												case 'R' : System.out.println("Return Selected");
												break;
												case 'E' :	System.out.println("EXITING SYSTEM");
												break;
												
												// invalid entry or caps lock is off
												default:System.out.println("Invalid selection or check caps lock is on");
												
										}
									
									}while(choice!='R');
									
									// breaking here because we just deal with our 1st case
									break;
									
									
									// second case here which is the main
						case 'M' :
									do{
										System.out.println("|-----------------------------------------|");
										System.out.println("| Select main meal from the choices below |");
										System.out.println("|-----------------------------------------|");
										System.out.println("| Code     |         Description          |");
										System.out.println("|-----------------------------------------|");
										System.out.println("| P        | Panta Vath          RM5.00    |");
										System.out.println("| C        | Chicken Biriyani    RM6.00    |");
										System.out.println("| B        | Beef Biriyani       RM7.00    |");
										System.out.println("|-----------------------------------------|");
										System.out.println("| R        |           RETURN             |");
										System.out.println("|-----------------------------------------|");
										System.out.println("| E        |            EXIT              |");
										System.out.println("|-----------------------------------------|");
										System.out.println();
										System.out.println("Enter choice: ");
                                        System.out.println("Enter quantity: ");
										
										// user choice here
										choice=kb.next().charAt(0);
										// user quantity here
										total=NumScanner.nextInt();
										
										
								
										switch(choice)
											{
												case 'P':System.out.println("Panta Vath selected");
												total=total*PantaVath;
												System.out.println("Your total bill is RM " +total);
												System.out.println("Would you like to order more?");
												break;
												
												case 'C' :System.out.println("Chicken Biriyani Selected");
												total=total*ChickenBiriyani;
												System.out.println("Your total bill is RM " +total);
												System.out.println("Would you like to order more?");
												break;
												
												case 'B' :System.out.println("Beef Biriyani Selected");
												total=total*BeefBiriyani;
												System.out.println("Your total bill is RM " +total);
												System.out.println("Would you like to order more?");
												break;
												
												case 'R' :	System.out.println("Returning to fist screen");
												break;
												case 'E' :	System.out.println("EXITING SYSTEM");
												break;
												
												default:System.out.println("Invalid selection or check caps lock is on");
										
											
											}
											
									 }while(choice!='R');
									
									// break here:end of main meals switch statement;
									break;
											
						case 'D' :
								do{
									System.out.println("|-----------------------------------------|");
									System.out.println("|   Select dessert from the choices below |");
									System.out.println("|-----------------------------------------|");
									System.out.println("| Code     |         Description          |");
									System.out.println("|-----------------------------------------|");
									System.out.println("| P        | Pudding             RM2.50   |");
									System.out.println("| F        | Falooda             RM1.50   |");
									System.out.println("| J        | Jilapi              RM3.00   |");
									System.out.println("|-----------------------------------------|");
									System.out.println("| R        |           RETURN             |");
									System.out.println("|-----------------------------------------|");
									System.out.println("| E        |            EXIT              |");
									System.out.println("|-----------------------------------------|");
									System.out.println();
									System.out.println("Enter choice: ");
									System.out.println("Enter quantity: ");
									
									// user choice here
									choice=kb.next().charAt(0);
									// user quantity here
									total=NumScanner.nextInt();
									
									
							
									switch(choice)
										{
											case 'P':System.out.println("Pudding  selected");
											total=total*Pudding ;
											System.out.println("Your total bill is RM " +total);
											System.out.println("Would you like to order more?");
											break;
											
											case 'F' :System.out.println("Falooda   Selected");
											total=total*Falooda ;
											System.out.println("Your total bill is RM " +total);
											System.out.println("Would you like to order more?");
											break;
											
											case 'J' :System.out.println("Jilapi Selected");
											total=total*Jilapi;
											System.out.println("Your total bill is RM " +total);
											System.out.println("Would you like to order more?");
											break;
											
											case 'R' :	System.out.println("Returning to fist screen");
											break;
											case 'E' :	System.out.println("EXITING SYSTEM");
											break;
											
											default:System.out.println("Invalid selection or check caps lock is on");
									
										
										}
										
								 }while(choice!='R');
								
								// break here:end of main meals switch statement;
								break;
								
						// exiting the from the whole program here
						case 'E' :	System.out.println("EXITING SYSTEM");
						break;
						
						default:System.out.println("Invalid selection or check caps lock is on");
		
					}
				
			}while(choice!='E');
		
		System.out.println("Total bill to pay RM "+total);
		System.out.println("THANK YOU FOR YOUR ORDER");


	}

}
