<%@page import="com.jspproject.conn.ConnectionPool"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jdbc 테스트</title>
</head>
<body>
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">아이디</th>
      <th scope="col">패스워드</th>
      <th scope="col">이름</th>
      <th scope="col">시간</th>
    </tr>
  </thead>
  <tbody>
    
<%
	// mysql driver load
	//Class.forName("com.mysql.cj.jdbc.Driver");
	// connection to DB
	//Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:4406/mysns?serverTimezone=Asia/Seoul", "root", "admin1234");
	Connection conn = ConnectionPool.get();
	
	// create query statement
	Statement stmt =  conn.createStatement();
	// query excute
	ResultSet rs =  stmt.executeQuery("select * from user");
	String str = "";
	int count = 1;
	while(rs.next()){    
	str += "<tr>";
	str +=  "<th scope=\"row\">"+ count++  +"</th>";
	str +=   "<td>"+ rs.getString("id") +  "</td>";
	str +=   "<td>"+ rs.getString("password") +  "</td>";
	str +=   "<td>"+ rs.getString("name") +  "</td>";
	str +=   "<td>"+ rs.getTimestamp("ts") +  "</td>";
	str += "</tr>";
	}	
	out.print(str);
	rs.close();stmt.close();conn.close();
%>      
        
  </tbody>
</table>


</body>
</html>