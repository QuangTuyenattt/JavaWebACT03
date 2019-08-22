/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import com.java.DTO.Book;
import com.java.db;
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
public class BookModel {

    public List<Book> getBooks() throws ClassNotFoundException, SQLException, Exception {
        db db = new db();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM book";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Book> list = new ArrayList<>();
        while (rs.next()) {
            Book s = new Book();
            s.setId(rs.getInt("id"));
            s.setTitle(rs.getString("title"));
            s.setAuthor(rs.getString("author"));
            s.setPrice(rs.getInt("price"));
            s.setQuantity(rs.getInt("quantity"));
            list.add(s);
        }
        return list;
    }

     public Book getById(int id) throws ClassNotFoundException, SQLException, Exception {
        Connection conn = new db().getConnect();
        String sql = "SELECT * FROM book WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Book b = null;
        while (rs.next()) {
            b = new Book();
            b.setId(rs.getInt("id"));
            b.setTitle(rs.getString("title"));
            b.setAuthor(rs.getString("author"));
            b.setPrice(rs.getInt("price"));
            b.setQuantity(rs.getInt("quantity"));
        }
        return b;
    }

    public int create(Book book) throws ClassNotFoundException, SQLException, Exception {
        Connection conn = new db().getConnect();
        String sql = "INSERT INTO book(title, author, price, quantity) VALUES (?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, book.getTitle());
        pstmt.setString(2, book.getAuthor());
        pstmt.setDouble(3, book.getPrice());
        pstmt.setInt(4, book.getQuantity());
        return pstmt.executeUpdate();
    }
    
    public int update(Book book) throws ClassNotFoundException, SQLException, Exception {
        Connection conn = new db().getConnect();
        String sql = "UPDATE book SET title=?, author=?, price=?, quantity=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, book.getTitle());
        pstmt.setString(2, book.getAuthor());
        pstmt.setDouble(3, book.getPrice());
        pstmt.setInt(4, book.getQuantity());
        pstmt.setInt(5, book.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException, Exception {
        Connection conn = new db().getConnect();
        String sql = "DELETE FROM book WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
}
