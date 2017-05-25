package FX_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by senafunakubo on 2017-05-15.
 */


public class Temperature {
    private JPanel wholeField;
    private JTextField fahrenheitTextField;
    private JButton calculateButton;
    private JTextField celsiusTextField;
    private JLabel celsius;
    private JLabel fahrenheit;


    public Temperature(){
        this.celsiusTextField = celsiusTextField;
        this.fahrenheitTextField = fahrenheitTextField;

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(celsiusTextField.getText().isEmpty())
                {
                    Double fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
                    Double celsius = (fahrenheit - 32.0)/1.8;
                    celsiusTextField.setText("" + celsius);
                }else if(fahrenheitTextField.getText().isEmpty()){
                    Double celsius = Double.parseDouble(celsiusTextField.getText());
                    Double fahrenheit = 9 / 5.0 * celsius + 32;
                    fahrenheitTextField.setText("" + fahrenheit);
                }else{
                    System.out.println("It's Invalid.");
                }

            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Calculate Temperature");
        frame.setContentPane(new Temperature().wholeField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

