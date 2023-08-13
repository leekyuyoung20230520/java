<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:4406/mysns?serverTimezone=Asia/Seoul", "root", "admin1234");
		String sql = "update user set password=?,name=?,ts = now() where id = ?;";
		PreparedStatement pstmt =  conn.prepareStatement(sql);
		// index start 1.....(not 0)		
		pstmt.setString(1, password);pstmt.setString(2, name);pstmt.setString(3, id);						
		int result = pstmt.executeUpdate();
		
		out.print(" update 되었습니다.");
		pstmt.close();conn.close();
%>		
	<p><a href="main.jsp">메인으로 돌아가기</a></p>
</body>
</html>