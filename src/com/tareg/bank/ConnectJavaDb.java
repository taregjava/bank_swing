/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tareg.bank;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Inspiron
 */
public class ConnectJavaDb {
  
   
    
    public static Connection connectDb(){
         Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
          
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankswing","root","");
         
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
         return conn;
        
    }
    
}
