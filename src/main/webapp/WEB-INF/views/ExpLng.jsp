<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ page import ="java.util.List"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
    <h2>This is the Model & View Page</h2>

    <h1> Name is ${name } </h1
    <c:forEach var="item" items="${city }">
        ${item }
    </c:forEach>
</body>
</html>