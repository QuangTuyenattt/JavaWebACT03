/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell M4700
 */
public class db {

    public static Connection getConnect() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/book";
        Connection conn = DriverManager.getConnection(connStr, "root", "");

        return conn;
    }
}
