<%-- 
    Document   : login
    Created on : Aug 13, 2024, 1:20:02 PM
    Author     : isharaLakshitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WCD</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <h1>Login</h1>          

        <%
            if (request.getAttribute("error") != null) {%>
        <h3 class="e"><%= request.getAttribute("error")%></h3>
        <% }
        %>

        <form action="Login" method="POST">

            <div class="d1">Mobile</div>
            <input name="mobile"/>

            <button type="submit">Log in</button>
        </form>

    </body>
</html>
