/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.code;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Dell M4700
 */
public class Login_Mana {
    Connection conn ;

    public Login_Mana() throws Exception {
        DBConnector dBConnector = new DBConnector();
        this.conn = dBConnector.getConnect();
    }
    
    public Login_info check(String username , String password) throws Exception{
       
         String query = "SELECT * FROM register WHERE username = ? AND password = ?";
         PreparedStatement preparedStatement = this.conn.prepareStatement(query);
         preparedStatement.setString(1, username);
         preparedStatement.setString(2, password);
         ResultSet rs =preparedStatement.executeQuery();
         Login_info lg = null ;
         if(rs.next()){
             lg = new Login_info(rs.getString("username"), rs.getString("password"));
         }
         return lg ;
         
            
        
    }
    
}
