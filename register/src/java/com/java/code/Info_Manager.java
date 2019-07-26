/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Dell M4700
 */
public class Info_Manager {
   // private List<Info_User> list;
    public void insert(Info_User user) throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = DBConnector.getConnect();
        String sql = "INSERT INTO register(uname ,upwd, email , fname , address) VALUES (?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getUname());
        pstmt.setString(2, user.getUpwd());
        pstmt.setString(3, user.getEmail());
        pstmt.setString(4, user.getFname());
        pstmt.setString(5, user.getAddress());
        
        pstmt.executeUpdate();
        
        
        
        
        
    }
   
}
