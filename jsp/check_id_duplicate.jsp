<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	// id check from database
	Class.forName("com.mysql.cj.jdbc.Driver");		
	Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:4406/mysns?serverTimezone=Asia/Seoul", "root", "admin1234");
	String sql = "select * from user where id = ?";
	PreparedStatement pstmt =  conn.prepareStatement(sql);
	// index start 1.....(not 0)
	pstmt.setString(1, id);						
	ResultSet rs =  pstmt.executeQuery();
	PrintWriter writer = response.getWriter();
	if(rs.next())
		writer.print("duplicate");
	else
		writer.print("not duplicate");
	writer.close();
	pstmt.close();conn.close();
%>