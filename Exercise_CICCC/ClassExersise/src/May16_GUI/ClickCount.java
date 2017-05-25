package May16_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by senafunakubo on 2017-05-16.
 */

public class ClickCount {
    private JButton click;
    private JLabel clickedLabel;
    private JLabel clickPanel;
    private JPanel wholeField;


    public ClickCount() {
        click.addActionListener(new ActionListener() {
            int clicked = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                clicked++;
                System.out.println(clicked);
                clickedLabel.setText(Integer.toString(clicked));
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Push Center");
        frame.setContentPane(new ClickCount().wholeField);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
