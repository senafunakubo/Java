package May26_MVC;

/**
 * Created by senafunakubo on 2017-05-31.
 */

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.event.ActionListener;



public class TextInput extends JFrame {
    public JLabel loadLabel = new JLabel("Ok, the text is currently not loaded...");
    private JButton loadButton = new JButton("Load Data");
    private JTextArea textArea = new JTextArea();
    private JButton writeButton = new JButton("Write Data");
    private JPanel wholePanel;


    public TextInput() {
        wholePanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        textArea.setPreferredSize(new Dimension(180, 27));
        wholePanel.add(loadLabel);
        wholePanel.add(loadButton);
        wholePanel.add(textArea);
        wholePanel.add(writeButton);
        wholePanel.setLayout(new BoxLayout(wholePanel, BoxLayout.Y_AXIS));
        this.add(wholePanel);
    }


    public void setTextStringLoad(String text){
        loadLabel.setText(text);
    }

    public String getTextString(){
        return textArea.getText();
    }

    public void addLoadListener(ActionListener listenForLoadButton){
        loadButton.addActionListener(listenForLoadButton);
    }

    public void addWriteListener(ActionListener listenForWriteButton){
        writeButton.addActionListener(listenForWriteButton);
    }
}