/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.register;

import com.java.code.Login_Mana;
import com.java.code.Login_info;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Enumeration<String> params = request.getParameterNames();
            
            Login_Mana lm = new Login_Mana();
            Login_info li = lm.check(request.getParameter("user"), request.getParameter("pass"));
            if(li!=null){
                out.println("Thanh cong");
            }
            else{
                out.println("That bai");
            }
                    
            
          
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div>");
            out.println("<center>");
            out.println(" <h1>LOGIN FORM</h1>");
            out.println("<form>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>Username :</td>");
            out.println("<td> <input name=\"user\"> </td>");
            out.println(" </tr> ");
            out.println("<tr>");
            out.println(" <td>Pass :</td>");
            out.println("<td> <input name=\"pass\" type=\"password\"> </td>");
            out.println(" </tr> ");
            out.println("  </table>");
            out.println("<input type=\"submit\" value=\"Login\" name=\"login\">");
            out.println(" <input type=\"reset\" value=\"Reset\" name=\"reset\" >");
            out.println("<br>");
            out.println("<a href=\"index.html\"> Creaat new user ? </a> ");
            out.println("</form>");
            out.println(" </center>");
            out.println("  </div>");

            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e){
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
