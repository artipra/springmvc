<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Help</title>
</head>
<body>
<h1>My first step to become skilled very happy !!!!!!!!!</h1>
<%
/*String name = (String)request.getAttribute("name");
LocalDateTime time = (LocalDateTime)request.getAttribute("time");*/
%>
<h1>I am ${name}</h1>
<h1>My time is started ${time}</h1>
<c:forEach var="item" items="${list }">
    <h1>${item}<h1>
</c:forEach>

</body>
</html>