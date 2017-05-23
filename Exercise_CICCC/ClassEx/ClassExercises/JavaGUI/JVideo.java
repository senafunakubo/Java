import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


    public JVideo() {


        PriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float amount=0;

                if(e.getSource()==PriceButton){
                    if(SDRadioButton.isSelected()){
                        amount = 1;
                        System.out.println("1");
                    }else if(HDRadioButton.isSelected()){
                        amount = 2;
                        System.out.println("2");
                    }else if(KRadioButton.isSelected()){
                        amount = 3;
                        System.out.println("3");
                    }else{
                        System.out.println("Invalid");
                    }
                }
            }
        });
    }

    public void printSelectedNames(JCheckBox[] boxes) {

        for(JCheckBox box : boxes)
            if(box.isSelected())
                System.out.println(box.getText());
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
