<%@ page language="java" contentType="text/html; charset=UTF-8"
          pageEncoding="UTF-8"%>
<jsp:useBean id="uzytkownik" class="Uzytkownik.Uzytkownik" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="uzytkownik"/>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>Twoj profil</title>
</head>
<body>
<h3>Twoj profil w systemie:</h3>
<ul>
    Witaj, <b><jsp:getProperty property="name" name="uzytkownik"/></b>
    Email przypisany: <b><jsp:getProperty property="email" name="uzytkownik"/></b>
</ul>
</body>
</html>