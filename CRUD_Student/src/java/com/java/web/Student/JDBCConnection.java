/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.web.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Dell M4700
 */
public class JDBCConnection {
    public static Connection getConnector() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/java-web02";
        Connection conn = DriverManager.getConnection( connStr, "root" , "");
             
        return conn;
        
    }
    
}
