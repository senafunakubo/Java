/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvudemo;

/**
 *
 * @author senafunakubo
 */
    
    public class MVCDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculatorModel theModel = new CalculatorModel();
        CalculatorView theView = new CalculatorView();
        CalculatorController theController = new CalculatorController(theView, theModel);
        theView.setVisible(true);
    }
    
    }