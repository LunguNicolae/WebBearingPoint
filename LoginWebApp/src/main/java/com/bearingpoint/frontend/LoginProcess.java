/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.frontend;

import com.bearingpoint.entities.Book;
import com.bearingpoint.entities.User;
import com.bearingpoint.entities.UserRole;
import com.bearingpoint.exemption.InvalidPasswordException;
import com.bearingpoint.service.impl.BookServiceImpl;
import com.bearingpoint.service.impl.UserRoleServiceImpl;
import com.bearingpoint.service.impl.UserServiceImpl;
import com.bearingpoint.service.intf.concrete.UserServiceIntf;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginProcess", urlPatterns = {"/loginProcess"})
public class LoginProcess extends HttpServlet {

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

//            BookServiceIntf bookservice = new BookServiceImpl();
//            if(){}
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
        response.sendRedirect("home.html");
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

        HttpSession session = request.getSession(true);// true creare de sesiune

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User(email, password);
        UserServiceIntf userService = new UserServiceImpl();
        System.out.println("user  Main"+user.toString());
        User userSearch = (User) userService.findByUserNamePassword(user);
        User userTest = (User) userService.findById(1L);
        System.out.println(" test "+userTest.toString());
        System.out.println("usersearch "+userSearch);
        if (userSearch == null) {
            request.setAttribute("error", "Autentification failed!");
            request.getRequestDispatcher("/WEB-INF/frontpage/login.jsp").forward(request, response);
        } else {
            response.sendRedirect("cms/homePage");
        }
      
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
