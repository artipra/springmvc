<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <link href="style.css" rel="stylesheet"/>
    <img src="Capture1.PNG"/>
    <title>JSP - Home World</title>
</head>
<body>
<h1>Home page welcome !!!!!!!!!!!!!!</h1>
<%
    List<String> friend = (List<String>)request.getAttribute("list");
    Integer dob = (Integer)request.getAttribute("dob");
%>
<h1>Dob is <%=dob%> </h1>
<%
    for(String s: friend)
    {
%>
<h1><%=s %></h1>
<%  }
%>

</body>
</html>