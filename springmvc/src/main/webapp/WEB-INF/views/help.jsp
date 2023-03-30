<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>this is helppage</h3>
<%
String name=(String)request.getAttribute("name");
Integer pin=(Integer)request.getAttribute("pincode");

%>
<h1>my city is<%=name %></h1>
<h1>pincode is<%=pin %></h1>
</body>
</html>