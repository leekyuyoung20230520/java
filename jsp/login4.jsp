<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
	// 현지 날자를 구한다
	Date now = new Date();
	SimpleDateFormat formatPattern = new SimpleDateFormat("yyyy년-MM월-dd일 hh시:mm분:ss초");
	String date =  formatPattern.format(now);		
	String day =  date.substring(date.indexOf("일")-2,date.indexOf("일"));	
	int dayint = Integer.valueOf(day);
	if(dayint == 1){
		response.sendRedirect("underCheck.jsp");
		return;
	}
	String uid = request.getParameter("id");
	String res = "<h3>사용자 아이디 : " + uid + "</h3>";
	out.print(res +  date+"<br>");
	
%>	
</body>
</html>