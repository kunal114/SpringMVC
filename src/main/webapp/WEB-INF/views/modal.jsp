<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ page import ="java.util.List"%>
<html>
<head> <%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
    <h2>This is the Model Page</h2>
    <%
      String name = (String) request.getAttribute("name");
    %>
    <%
      Integer id = (Integer) request.getAttribute("id");
    %>
    <%
      List<String> city = (List<String>) request.getAttribute("city");
    %>
    <h1>Name is <%=name%> </h1>
    <h1>ID is <%=id%> </h1>

    <% for(String c: city){ %>
        <h2> <%=c%> </h2>
    <% } %>
</body>
</html>