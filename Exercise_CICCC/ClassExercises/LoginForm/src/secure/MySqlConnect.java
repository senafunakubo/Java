/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author senafunakubo
 */
public class MySqlConnect {
    Connection connection = null;
    public static Connection ConnectDB()
    {
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
      }
      catch (ClassNotFoundException e)
      {
            System.out.println("Class not found " + e);
      }
      System.out.println("JDBC Class found");
      
      try
      {
         Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/login", "APP", "APP");
         JOptionPane.showMessageDialog(null, "Connected to database");
         return con;    
      }
      catch(SQLException e)
      {
         System.out.println("SQL exception occured" + e);
         return null;
      }
    } 
}
