<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
 <h2>Login page</h2>
    <form action=LoginServlet2 method=post>
        <table>
            <tr>
                <td>Enter Name: </td>
                <td><input type="text" name="username"></td>
            </tr>

            <tr>
                <td>Enter Password: </td>
                <td><input type="password" name="pass"></td>
            </tr>

            <tr>
                <td><input type="Submit" value="Submit"></td>
            </tr>
        </table>
    </form>
</body>
</html>