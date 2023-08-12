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
		Statement stmt =  conn.createStatement();
		String sql = "insert into user(id,password,name) values(";
		sql += "'" + id +"',";
		sql += "'" + password +"',";
		sql += "'" + name +"');";				
		int result = stmt.executeUpdate(sql);		
		out.print(result+" insert 되었습니다.");			
	%>
	<p><a href="main.jsp">메인으로 돌아가기</a></p>
</body>
</html>