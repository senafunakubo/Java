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
        
//        price.setSyo(price.getSyo());
//        price.setChiku(price.getChiku());
//        price.setBai(price.getBai());
//        price.setTax(price.getTax());
//        price.setDfee(price.getDfee());
        
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/UserInfo","APP","APP");
        PreparedStatement st = con.prepareStatement("insert into USERINFODB(FirstName,LastName,Email,PhoneNumber,Address,City,Zipcode,Password)values(?,?,?,?,?,?,?,?)");
        st.setString(1, user.getfirstName());
        st.setString(2, user.getlastName());
        st.setString(3, user.getEmail());
        st.setString(4, user.getphoneNumber());
        st.setString(5, user.getaddress());
        st.setString(6, user.getcity());
        st.setString(7, user.getzipCode());
        st.setString(8, user.getpassword());
        
        int a = st.executeUpdate();
        
        if(a>0){
            System.out.println("Row Update");
            Payment paymentPage = new Payment();
                    paymentPage.ShowUserInfo(user.getfirstName(),user.getlastName(),user.getEmail(),user.getphoneNumber(),user.getaddress(),user.getcity(),user.getzipCode(),user.getpassword());
//                    paymentPage.ShowShoppingCart(price);
                    paymentPage.setVisible(true);
        }
    }
    
//    public void forShoppingCart(Price price){
//        
//        price.setSyo(price.getSyo());
//        price.setChiku(price.getChiku());
//        price.setBai(price.getBai());
//        price.setTax(price.getTax());
//        price.setDfee(price.getDfee());
//        
//        Payment paymentPage = new Payment();
//        paymentPage.ShowShoppingCart(price);
//    }
}
