/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author senafunakubo
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


import assignment3.GUI1;

public class MyPanel extends JPanel {
	  
	
	  

	
	private JLabel jcomp1;
	    private JLabel jcomp2;
	    private JComboBox jcomp3;
	    private JComboBox jcomp4;
	    private JComboBox jcomp5;
	    private JLabel jcomp6;
	    private JTextField jcomp7;
	    private JTextField jcomp8;
	    JButton jcomp9;
	    private JButton jcomp10;
	    private JTextArea jcomp11;
	    private JLabel jcomp12;
	    private JTextField jcomp13;
	    private JButton jcomp14;
	     JButton jcomp15;
	     b bb=new b();
	
	    public MyPanel() {
	        //construct preComponents
	        String[] jcomp3Items = {"Peyaju", "Beguni", "Alur Chop"};
	        String[] jcomp4Items = {"Panta Vath", "Chicken Biriyani", "Beef Biriyani"};
	        String[] jcomp5Items = {"Pudding", "Falooda", "Jilapi"};
	        //construct components
	        jcomp1 = new JLabel ("               Starter");
	        jcomp2 = new JLabel ("             Main Dish");
	        jcomp3 = new JComboBox (jcomp3Items);
	        jcomp4 = new JComboBox (jcomp4Items);
	        jcomp5 = new JComboBox (jcomp5Items);
	        jcomp6 = new JLabel ("            Dessert");
	        jcomp7 = new JTextField (5);
	        jcomp8 = new JTextField (5);
	        jcomp9 = new JButton ("Return");
	        jcomp10 = new JButton ("Order");
	        jcomp11 = new JTextArea (5, 5);
	        jcomp12 = new JLabel ("                Ordered Item");
	        jcomp13 = new JTextField (5);
	        jcomp14 = new JButton ("Delete");
	        jcomp15 = new JButton ("Payment");
          
	    
	        //adjust size and set layout
	        setPreferredSize (new Dimension (667, 366));
	        setLayout (null);

	        //add components
	        add (jcomp1);
	        add (jcomp2);
	        add (jcomp3);
	        add (jcomp4);
	        add (jcomp5);
	        add (jcomp6);
	        add (jcomp7);
	        add (jcomp8);
	        add (jcomp9);
	        add (jcomp10);
	        add (jcomp11);
	        add (jcomp12);
	        add (jcomp13);
	        add (jcomp14);
	        add (jcomp15);

	        //set component bounds (only needed by Absolute Positioning)
	        jcomp1.setBounds (0, 15, 130, 50);
	        jcomp2.setBounds (130, 20, 135, 45);
	        jcomp3.setBounds (0, 65, 130, 25);
	        jcomp4.setBounds (130, 65, 135, 25);
	        jcomp5.setBounds (265, 65, 125, 25);
	        jcomp6.setBounds (265, 20, 125, 45);
	        jcomp7.setBounds (0, 100, 390, 160);
	        jcomp8.setBounds (0, 280, 130, 30);
	        jcomp9.setBounds (180, 285, 100, 25);
	        jcomp10.setBounds (290, 285, 100, 25);
	        jcomp11.setBounds (445, 100, 180, 160);
	        jcomp12.setBounds (445, 45, 175, 40);
	        jcomp13.setBounds (480, 275, 115, 25);
	        jcomp14.setBounds (435, 315, 100, 25);
	        jcomp15.setBounds (545, 315, 100, 25);
	        jcomp9.addActionListener(bb);
	        jcomp15.addActionListener(bb);
	    }


	    public static void main (String[] args) {
	        JFrame frame = new JFrame ("MyPanel");
	        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add (new MyPanel());
	        frame.pack();
	        frame.setVisible (true);
	    }
	    class b implements ActionListener{
	    	
			public void actionPerformed(ActionEvent event) {
				if(event.getSource()==jcomp9)
	    		{  	
					GUI1 bbb= new GUI1();
					 
					 String[] args = null;
					 bbb.main(args);
}
		
				
	    
			}}}

