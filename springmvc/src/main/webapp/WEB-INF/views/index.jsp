<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<body>
<h4>this is home url</h4>
<h4>called by home controller</h4>
<h4>url /home</h4>
<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");
%>
<h3>name is<%=name %></h3>
<%=id %>
</body>
</html>