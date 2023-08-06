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
	String res = "<h3>매월 6일은 시스템 점검일입니다.</h3>";
	res += "<br> 6일 이후에 다시 이용해 주세요";	
	out.print(res);
%>
</body>
</html>