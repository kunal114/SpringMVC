<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<html>
<head> <%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
    <h2>This is the model Page</h2>

    <%
     String name = (String)request.getAttribute("name");
    %>
    <h1>Name is <%name%> </h1>
</body>
</html>