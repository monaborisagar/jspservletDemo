<%@page import="com.javabrains.web.Model.Alian"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Alian a1 =(Alian) request.getAttribute("alian");
out.println("the value of a1 is"+a1);
%>
</body>
</html>