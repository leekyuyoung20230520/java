<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 
		스크립틀릿  <% %>
		지시자 <%@ %>  페이지 변환 정보
			page : 페이지 처리 방법
			include : 다른 jsp 문서를 포함
			taglib : 태그 라이브러리  
		선언문 <%! %>  클래스변수  및 함수 정의
		표현식 <%= %>  함수 변수값 호출
	--%>
	
	<%
		// 한글이 깨지면 상단의 pageEncoding을 utf로 설정하고
		// Post방식에서 한글이 깨지면
		request.setCharacterEncoding("utf-8");
		
		String uid = request.getParameter("id");
		String res = "<h3>User id : "+ uid + "</h3>";
		res += String.format("<p>로그인 시간 : %s </p>", (new Date()).toString() );		 
		out.print(res);
		
	%>
</body>
</html>