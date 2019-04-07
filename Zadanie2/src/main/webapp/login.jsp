<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    HttpServletResponse httpResponse = (HttpServletResponse) response;
    if (session.getAttribute("uzytkownik") != null) {
        httpResponse.sendRedirect("profil.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>Logowanie do systemu</title>
</head>
<body>
<form action="login" method="post">
    <h3>Wykonaj akcje logowania</h3>
    <table>
        <tr>
            <td style="text-align:right">Nazwa uzytkownika:</td>
            <td><input name="name" id="name" type="text" required style="width:150px"></td>
        </tr>
        <tr>
            <td style="text-align:right">Hasło:</td>
            <td><input name="password" id="password" type="password" style="width:150px"></td>
        </tr>
        <tr>
            <td style="text-align:right"></td>
            <td><input type="submit" value="Login"></td>
        </tr>
    </table>
</form>
</body>
</html>