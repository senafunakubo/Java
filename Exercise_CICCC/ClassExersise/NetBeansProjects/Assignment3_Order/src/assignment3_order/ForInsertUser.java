/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author senafunakubo
 */
class ForInsertUser {
    public ForInsertUser(User user) throws SQLException{
        
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/UserInfo","APP","APP");
        PreparedStatement st = con.prepareStatement("insert into USERINFODB(FirstName,LastName,Email,PhoneNumber,Address,City,Zipcode)values(?,?,?,?,?,?,?)");
        st.setString(1, user.getfirstName());
        st.setString(2, user.getlastName());
        st.setString(3, user.getEmail());
        st.setInt(4, user.getphoneNumber());
        st.setString(5, user.getaddress());
        st.setString(6, user.getcity());
        st.setString(7, user.getzipCode());
        
        int a = st.executeUpdate();
        
        if(a>0){
            System.out.println("Row Update");
        }
    }
}
