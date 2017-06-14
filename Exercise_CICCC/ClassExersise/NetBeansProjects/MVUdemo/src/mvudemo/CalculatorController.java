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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorController {
    private CalculatorModel theModel;
    private CalculatorView theView;
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new calculateListner());
    }
    
    class calculateListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int no1,no2;
            no1 = theView.getFirstNumber();
            no2 = theView.getSecondNumber();
            theModel.addTwoNumbers(no1, no2);
            int result = theModel.getCalcvalue();
            theView.setCalcSolution(result);
        }
        
    }
}
