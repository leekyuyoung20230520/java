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
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
    
<%
	// mysql driver load
	Class.forName("com.mysql.cj.jdbc.Driver");
	// connection to DB
	Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:4406/mysns?serverTimezone=Asia/Seoul", "root", "admin1234");
	// create query statement
	Statement stmt =  conn.createStatement();
	// query excute
	ResultSet rs =  stmt.executeQuery("select * from user");
	String str = "";
	int count = 1;
	while(rs.next()){    
		String id = rs.getString("id");
		String psw = rs.getString("password");
		String name = rs.getString("name");
		
		str += "<tr><form action = \"signup.jsp\" method=\"post\" >";
		str +=  "<th scope=\"row\">"+ count++  +"</th>";
		str +=   "<td>"+ id +  "</td>";
		str +=   "<td>"+ psw +  "</td>";
		str +=   "<td>"+ name +  "</td>";
		str +=   "<td>"+ rs.getTimestamp("ts") +  "</td>";		
		str +=   "<td><button type=\"submit\" class=\"btn btn-success\">수정</button></td>";
		str += " <input type=\"hidden\" name=\"id\" value=\""+id+"\">";
		str += " <input type=\"hidden\" name=\"password\" value=\""+psw+"\">";
		str += " <input type=\"hidden\" name=\"name\" value=\""+name+"\">";
		str += " <input type=\"hidden\" name=\"type\" value=\"modify\" >";
		str += "</tr></form>";
	}	
	out.print(str);
	rs.close();stmt.close();conn.close();
%>      
        
  </tbody>
</table>


</body>
</html>