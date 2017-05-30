package May16_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by senafunakubo on 2017-05-18.
 */
public class JVideo {
    private JLabel videoStoreLabel;
    private JRadioButton SDRadioButton;
    private JRadioButton HDRadioButton;
    private JRadioButton KRadioButton;
    private JCheckBox IdiotsCheckBox;
    private JCheckBox aeDilHaiMushkilCheckBox;
    private JCheckBox barfiCheckBox;
    private JCheckBox jabTakHaiJaanCheckBox;
    private JCheckBox rockstarCheckBox;
    private JCheckBox sultanCheckBox;
    private JCheckBox talaashCheckBox;
    private JCheckBox FANCheckBox;
    private JCheckBox kahaaniCheckBox;
    private JCheckBox theLunchboxCheckBox;
    private JButton PriceButton;
    private JPanel wholeField;
    private JLabel PriceLabel;


    public JVideo() {

            JCheckBox[] checkBoxes = new JCheckBox[10];
            checkBoxes[0]=IdiotsCheckBox;
            checkBoxes[1]=barfiCheckBox;
            checkBoxes[2]=aeDilHaiMushkilCheckBox;
            checkBoxes[3]=jabTakHaiJaanCheckBox;
            checkBoxes[4]=rockstarCheckBox;
            checkBoxes[5]=sultanCheckBox;
            checkBoxes[6]=talaashCheckBox;
            checkBoxes[7]=FANCheckBox;
            checkBoxes[8]=kahaaniCheckBox;
            checkBoxes[9]=theLunchboxCheckBox;

        PriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float amount = 0;
                int moviecount = 0;
                float totalamount = 0;

                if (e.getSource() == PriceButton) {
                    if (SDRadioButton.isSelected()) {
                        amount = 1;
                        moviecount = countMovieNum(checkBoxes);
                        totalamount = moviecount*amount;
                        System.out.println("Total $:" + totalamount);
                    } else if (HDRadioButton.isSelected()) {
                        amount = 2;
                        moviecount = countMovieNum(checkBoxes);
                        totalamount = moviecount*amount;
                        System.out.println("Total $:" + totalamount);
                    } else if (KRadioButton.isSelected()) {
                        amount = 3;
                        moviecount = countMovieNum(checkBoxes);
                        totalamount = moviecount*amount;
                        System.out.println("Total $:" + totalamount);
                    } else {
                        System.out.println("Invalid");
                    }
                }

                PriceLabel.setText("Total $:" +totalamount);
            }
        });

    }
    public int countMovieNum(JCheckBox[] boxes) {
            int count=0;
        for(JCheckBox box : boxes)
        {
            if(box.isSelected()){
                count = count+1;
            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Video Store");
        frame.setContentPane(new JVideo().wholeField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
