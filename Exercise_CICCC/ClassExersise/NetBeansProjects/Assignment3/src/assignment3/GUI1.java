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

//import Gui1.MyPanel;

/**
 *
 * @author senafunakubo
 */
public class GUI1 extends JPanel{
	JButton jcomp1;
        JButton jcomp2;
        JLabel jcomp3;
        
    b bb=new b();
    static MyPanel page2=new MyPanel();
    public GUI1() {
        //construct components
   
      jcomp1 = new JButton ("ORDER");
        jcomp2 = new JButton ("EXIT");
        jcomp3 = new JLabel ("                    WELCOME TO BANGLADESHI FOOD CORNER");

        //adjust size and set layout
        setPreferredSize (new Dimension (667, 366));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
      
        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (285, 150, 100, 20);
        jcomp2.setBounds (285, 195, 100, 20);
        jcomp3.setBounds (150, 50, 355, 85);
        jcomp1.addActionListener(bb);
        jcomp2.addActionListener(bb);
    }
   
    
    public static void main (String[] args) {
    	
    	
        JFrame frame = new JFrame ("gui1");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GUI1());
        frame.pack();
        frame.setVisible (true);
       
    }

    public class b implements ActionListener{
    	
		public void actionPerformed(ActionEvent event) {
			if(event.getSource()==jcomp1)
    		{  			 
				 
				 String[] args = null;
				 page2.main(args);
				 
    		}
			
			else if (event.getSource()==jcomp2)
			{
				
				System.exit(0);
			}
			
			
			
		}
    
    }

    }



