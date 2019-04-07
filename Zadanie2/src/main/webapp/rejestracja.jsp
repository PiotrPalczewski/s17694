<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    HttpServletResponse httpResponse = (HttpServletResponse) response;
    if(session.getAttribute("conf") != null) {
        httpResponse.getWriter().println("Posiadasz juz konto w bazie, prosze przejsc do strony logowania!");
        return;
    }
    else if (session.getAttribute("uzytkownik") != null) {
        httpResponse.sendRedirect("profil.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>Rejestracja w systemie</title>
</head>
<body>
<form action="register" method="post">
    <h3>Wypełnij kwestionariusz aby sie zalogować:</h3>
        <tr>
            <td style="text-align:right">Nazwa uzytkownika:</td>
            <td><input name="name" id="name" type="text" required style="width:200px"></td>
        </tr>
        <tr>
            <td style="text-align:right">Hasło do logowania:</td>
            <td><input name="password" id="password" type="password" required style="width:200px"></td>
        </tr>
        <tr>
            <td style="text-align:right">Powtórz haslo do logowania:</td>
            <td><input name="confirmpassword" id="password" type="password" required style="width:200px"></td>
        </tr>
        <tr>
            <td style="text-align:right">Email:</td>
            <td><input name="email" id="email" type="email" required style="width:200px"></td>
        </tr>
        <tr>
            <td style="text-align:right"></td>
            <td><input type="submit" value="Wyslij!"></td>
        </tr>
</form>
</body>
</html>