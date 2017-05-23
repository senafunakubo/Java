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
    private JFormattedTextField usernameTextField1;
    private JLabel password;
    private JLabel userName;
    private JButton loginButton;
    private JTextField passwordField;


    public FirstGUI() {

        this.passwordField = passwordField;
        this.usernameTextField1 = usernameTextField1;

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField1.getText();
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
