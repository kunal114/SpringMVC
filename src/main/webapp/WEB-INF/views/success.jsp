<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ page import ="java.util.List"%>
<html>
<head> <%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
    <h1> Registered Successfully</h1>
    <%
        String email = (String) request.getAttribute("id");
    %>
    <% String name = (String) request.getAttribute("name"); %>

    <h2> email= <%=email%> </h2>
    <h2> name= <%=name%> </h2>
</body>
</html>