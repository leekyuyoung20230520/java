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
	Integer count = (Integer)application.getAttribute("counter");
	count = (count == null)? 1 : count;
	out.print("방문자수 : " + count);
	application.setAttribute("counter", ++count);
%>
</body>
</html>