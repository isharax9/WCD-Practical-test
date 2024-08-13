<%-- 
    Document   : sign_up
    Created on : Aug 13, 2024, 9:53:12 AM
    Author     : isharaLakshitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>WCD</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <h1>Sign Up</h1>

        <form action="SignUp" method="POST">
            <div class="d1">Mobile</div>
            <input name="mobile" />

            <div class="d1">Name</div>
            <input name="name" />

            <div class="d1">Country</div>
            <select name="country" >
                <option>Sri Lanka</option>
                <option>Australia</option>
                <option>Italy</option>
            </select>
            <br/> <br/>
            <button type="submit">Create Account</button>
        </form>

    </body>
</html>
