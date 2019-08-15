/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

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
public class NewsModel {
    public  int countNews() throws ClassNotFoundException, SQLException{
        DBConnector db = new DBConnector();
        Connection conn =db.getConnector();
        PreparedStatement pstm = conn.prepareStatement("SELECT COUNT(*) FROM news");
        ResultSet rs = pstm.executeQuery();
       rs.next();
        return rs.getInt(1);
        
        
    }
    public List<News> findNews(String title) throws Exception {
        Connection conn = DBConnector.getConnector();
        List<News> list = new ArrayList<News>();
        String sql = "SELECT * FROM news WHERE title like ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%"+title+"%");
        //pstmt.setString(1, "Nhà tiên tri zũ trụ Trần dần chửi thề'");
        ResultSet rs = pstmt.executeQuery();
        
         while (rs.next()) {            
            list.add(new News(rs.getInt("id"), rs.getString("title"), rs.getString("summary"), rs.getString("content"), rs.getInt("author_id")));
            
        }
        return list;
        
    }
    public  List<News> getNews(int limit , int offset) throws ClassNotFoundException, SQLException{
        DBConnector db = new DBConnector();
        Connection conn =db.getConnector();
        PreparedStatement pstm = conn.prepareStatement("SELECT * FROM news LIMIT ? OFFSET ?");
        pstm.setInt(1, limit);
        pstm.setInt(2, offset);
        ResultSet rs = pstm.executeQuery();
        List<News> list = new ArrayList<News>();
        while (rs.next()) {            
            list.add(new News(rs.getInt("id"), rs.getString("title"), rs.getString("summary"), rs.getString("content"), rs.getInt("author_id")));
            
        }
        return list;
        
        
    }
}
