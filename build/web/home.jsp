<%-- 
    Document   : home
    Created on : Aug 13, 2024, 1:34:31 PM
    Author     : isharaLakshitha
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home</h1>

        <%
            if (session.getAttribute("user") != null) {
                User user = (User) session.getAttribute("user");
        %>
        <p>Mobile: <%= user.getMobile()%></p>
        <p>Name: <%= user.getName()%></p>
        <p>Country: <%= user.getCountry()%></p>
        <%
            } else {
                response.sendRedirect("login.jsp");
            }
        %>





    </body>
</html>
