/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author senafunakubo
 */
public class connClass {
    public connClass(String email, String password, Price price)throws SQLException{
      Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/UserInfo","APP","APP");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from USERINFODB");
        
        while(rs.next()){
            if(email.equals(rs.getString(3)) && password.equals(rs.getString(8))){
                Payment paymentPage = new Payment(price);
                paymentPage.ShowOldUserInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                paymentPage.ShowShoppingCart(price);
                 
                paymentPage.setVisible(true);
//                System.err.println("paymentPage.setVisible(true); open!! 22");
            }
            
//            if(!(email.equals(rs.getString(3))) && !(password.equals(rs.getString(8)))){
//                JOptionPane.showMessageDialog(null, "Your Username or Password is wrong.");
//            }
        }
        
        
    }
}
