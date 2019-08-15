/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.servlet;

import com.java.model.News;
import com.java.model.NewsModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell M4700
 */
@WebServlet(name = "NewsServlet", urlPatterns = {"/NewsServlet"})
public class NewsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String paramPage = request.getParameter("page");
            int currPage = 1 ;
            if(paramPage!=null){
                currPage = Integer.parseInt(paramPage);
            }
           NewsModel model = new NewsModel();
           //News model1 = model.searchNews(request.getParameter("search")) ;
           
            int total = 0 ;
            int recordPerPage = 2 ;
           
            int count = model.countNews();
            //News searchNews = model1.searchNews(request.getParameter("search"));
            total=(int) Math.floor(count/recordPerPage) +1; 
            List<News> news = model.getNews(recordPerPage , recordPerPage*(currPage-1));
            request.setAttribute("news", news);
            request.setAttribute("total", total);
            request.setAttribute("curr", currPage);
            //request.setAttribute("search", model1);
            
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
