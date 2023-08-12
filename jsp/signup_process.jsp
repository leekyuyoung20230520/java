<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		// 데이터베이스 드라이버로드
		// 접속
		// 쿼리를 실행할 객체
		// 쿼리 작성
		// 쿼리 실행
		// 자원 순차적으로 close
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:4406/mysns?serverTimezone=Asia/Seoul", "root", "admin1234");
		String sql = "insert into user(id,password,name) values(?,?,?)";
		PreparedStatement pstmt =  conn.prepareStatement(sql);
		// index start 1.....(not 0)
		pstmt.setString(1, id);pstmt.setString(2, password);pstmt.setString(3, name);						
		int result = pstmt.executeUpdate();		
		out.print(result+" insert 되었습니다.");
		pstmt.close();conn.close();
	%>
	<p><a href="main.jsp">메인으로 돌아가기</a></p>
</body>
</html>