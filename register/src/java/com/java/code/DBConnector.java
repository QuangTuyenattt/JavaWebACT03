/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.code;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell M4700
 */
public class DBConnector {
    public static Connection getConnect() throws Exception{
//       Class.forName("com.mysql.jdbc.Driver");
//       String conStr = "jdbc:mysql://loalhost:3306/QLYTHUVIEN";
//       Connection conn = DriverManager.getConnection(conStr, "root", "");
//       return conn; 
 Class.forName("com.mysql.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/register";
            Connection conn = DriverManager.getConnection(connStr, "root", "");
       return conn;

   }
}
