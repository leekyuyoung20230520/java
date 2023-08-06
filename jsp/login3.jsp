<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String uid = request.getParameter("id");
	String res = "<h3>User id : "+ uid + "</h3>";
%>
<%= res %>
<%@ include file="logintime.jsp" %>
</body>
</html>