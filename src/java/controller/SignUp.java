/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author isharaLakshitha
 */
public class SignUp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        String mobile = request.getParameter("mobile");
        String name = request.getParameter("name");
        String country = request.getParameter("country");

//        System.out.println(mobile);
//        System.out.println(name);
//        System.out.println(country);
        User user = new User(mobile, name, country);

        ServletContext sc = request.getServletContext();

        if (sc.getAttribute("userList") == null) {
            ArrayList<User> userList = new ArrayList<User>();
            userList.add(user);
            sc.setAttribute("userList", userList);
        } else {
            ArrayList<User> userList = (ArrayList<User>) sc.getAttribute("userList");
            userList.add(user);
            sc.setAttribute("userList", userList);
        }
    }
}
