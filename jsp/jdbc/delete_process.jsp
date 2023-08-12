<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");

	Class.forName("com.mysql.jdbc.Driver");		
	Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:4406/mysns?serverTimezone=Asia/Seoul", "root", "admin1234");
	String sql = "select * from user where id = ? and password = ?";
	PreparedStatement pstmt =  conn.prepareStatement(sql);
	pstmt.setString(1, id);pstmt.setString(2, password);
	ResultSet rs =  pstmt.executeQuery();
	if(rs.next()){
		sql = "delete from user where id = ?";
		pstmt =  conn.prepareStatement(sql);
		pstmt.setString(1, id);
		int result = pstmt.executeUpdate();
		if(result > 0)
			out.print("회원탈퇴 되었습니다");
	}else{
		out.print("아이디 패스워드를 확인하세요");		
	}	
	rs.close(); pstmt.close();conn.close();
%>
	<p><a href="main.jsp">메인으로 돌아가기</a></p>
</body>
</html>