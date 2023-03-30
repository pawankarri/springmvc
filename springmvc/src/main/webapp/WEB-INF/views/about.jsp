<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about page</title>
</head>
<body>
<h5>this is about page</h5>
<%
List<String> frd=(List<String>)request.getAttribute("f");
for(String frnds:frd)
{%>
<h1><%=frnds %></h1>
<%
}
%>
<h4>please exit</h4>
</body>
</html>