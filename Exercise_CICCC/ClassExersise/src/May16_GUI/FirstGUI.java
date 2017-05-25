package May16_GUI;

/**
 * Created by senafunakubo on 2017-05-24.
 */

//import javafx.application.Application;
//import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by senafunakubo on 2017-05-15.
 */

public class FirstGUI {
    private JPanel wholeField;
    private JButton loginButton;
    private JTextField passwordField;
    private JTextField usernameTextField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;


    public FirstGUI() {

        this.passwordField = passwordField;
        this.usernameTextField = usernameTextField;

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String passText = passwordField.getText();

                if(username.equals("sena")&&passText.equals("178")) {
                    JOptionPane.showMessageDialog(null, "Login Succeeded");
                }else{
                    JOptionPane.showMessageDialog(null,"Try again!");
                }
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("LoginPage");
        frame.setContentPane(new FirstGUI().wholeField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
