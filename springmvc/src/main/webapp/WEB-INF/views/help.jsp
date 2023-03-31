<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
  <%--  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>this is helppage</h3>
<%
/* String name=(String)request.getAttribute("name");
Integer pin=(Integer)request.getAttribute("pincode"); */


%>
<%-- <h1>my city is<%=name %></h1>
<h1>pincode is<%=pin %></h1> --%>
<h1>${name }</h1>
<h1>${pincode }</h1>
<%-- <c:forEach var="lis" items="${coll }">
<h1>${lis }</h1>
</c:forEach>  --%>
</body>
</html>