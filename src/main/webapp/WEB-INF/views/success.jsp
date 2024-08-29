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
        String email = (String) request.getAttribute("email");
    %>

    <h2> email= <%=email%> </h2>
</body>
</html>