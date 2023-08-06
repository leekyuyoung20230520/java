<%@page import="java.util.Enumeration"%>
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
	Enumeration<String> en =  request.getHeaderNames();
	while(en.hasMoreElements()){
		String name = en.nextElement();
		String value = request.getHeader(name);
		out.print("name : " + value + "<br>");
	}
%>
</body>
</html>