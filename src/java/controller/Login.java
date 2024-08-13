/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author isharaLakshitha
 */
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String mobile = request.getParameter("mobile");

        ServletContext servletContext = request.getServletContext();

        ArrayList<User> userList = (ArrayList<User>) servletContext.getAttribute("userList");

        boolean userFound = false;

        for (User user : userList) {
            if (user.getMobile().equals(mobile)) {
                userFound = true;
                response.sendRedirect("home.jsp");
                break;
            }
        }

        if (!userFound) {
            response.sendRedirect("login.jsp?error=Invalid Details");
        }

    }

}
