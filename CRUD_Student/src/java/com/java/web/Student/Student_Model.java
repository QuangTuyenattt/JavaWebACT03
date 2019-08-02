/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.web.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell M4700
 */
public class Student_Model {
    public List<Student> getStudents() throws ClassNotFoundException, SQLException {
        JDBCConnection db = new JDBCConnection();
        Connection conn = db.getConnector();
        String sql = "SELECT * FROM crud";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setHoten(rs.getString("Ho ten"));
            s.setKhoa(rs.getString("Khoa"));
            s.setLop(rs.getString("Lop"));
            list.add(s);
        }
        return list;
    }
    public void insert(Student stud) throws Exception{
        JDBCConnection db = new JDBCConnection();
        Connection conn = JDBCConnection.getConnector();
        String sql = "INSERT INTO `java-web02`.`crud` (`Ho ten`, `Khoa`, `Lop`) VALUES (?,?,?);";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, stud.getHoten());
        pstmt.setString(2, stud.getKhoa());
        pstmt.setString(3, stud.getLop());
      
        
        pstmt.executeUpdate();
      
    }
    public void update(Student stud) throws ClassNotFoundException, SQLException {
        JDBCConnection db = new JDBCConnection();
        Connection conn = JDBCConnection.getConnector();
        String sql = "UPDATE java-web02.crud SET Ho ten = ?, Khoa = ?, Lop = ? WHERE (id = ?);";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, stud.getHoten());
        pstmt.setString(2, stud.getKhoa());
        pstmt.setString(3, stud.getLop());
        pstmt.executeUpdate();
    }
    
     public void delete(Student stud) throws ClassNotFoundException, SQLException {
        JDBCConnection db = new JDBCConnection();
        Connection conn = JDBCConnection.getConnector();
        String sql = "";
    }
}
