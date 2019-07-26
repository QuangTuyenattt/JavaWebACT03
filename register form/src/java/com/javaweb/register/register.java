/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.register;

import com.java.code.Info_Manager;
import com.java.code.Info_User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell M4700
 */
@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet {

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
            Info_Manager im = new Info_Manager();
            Info_User u = new Info_User();
            u.setUname(request.getParameter("username"));
            u.setUpwd(request.getParameter("password"));
            u.setEmail(request.getParameter("email"));
            u.setFname(request.getParameter("fullname"));
            u.setAddress(request.getParameter("address"));
            im.insert(u);
            
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet register</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div>");
            Enumeration<String> params = request.getParameterNames();
            out.print("Ahihi , Hello " + request.getParameter("fullname"));
            out.println("<table border ='1'>");
            while (params.hasMoreElements()) {
                String key = params.nextElement();
                out.print("<tr>");
                out.print("<td>");
                out.print(key + ":");
                out.print("</td>");
                out.print("<td>");
                out.print(request.getParameter(key));
                out.print("</td>");

                //out.print("<td>request.getParameter(key)</td>");
                out.print("</tr>");
                // out.println(key + ": " + request.getParameter(key));
                out.println("<br/>");
            }
            out.println("</table>");

            // out.println("<h1>Servlet LoginServlet at " +  + "</h1>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
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
