/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author isharaLakshitha
 */
public class Listener1 implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("***Context Initialized***");

        ArrayList<User> userList = new ArrayList<User>();
        sce.getServletContext().setAttribute("userList", userList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("***Context   Destroyed * * *");
    }
}
