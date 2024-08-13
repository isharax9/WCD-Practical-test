/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isharaLakshitha
 */
public class SignUp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
             {

        String mobile = request.getParameter("mobile");
        String name = request.getParameter("name");
        String country = request.getParameter("country");

        System.out.println(mobile);
        System.out.println(name);
        System.out.println(country);

    }

}
