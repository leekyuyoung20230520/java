<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
	crossorigin="anonymous"></script>
</head>
<body>
	<form class="container" action="signup_process.jsp" method="post">
		<div class="mb-3">
			<label class="form-label">아이디</label> 
			<input type="email" class="form-control" name = 'id' >
		</div>
		<div class="mb-3">
			<label class="form-label">패스워드</label> 
			<input type="password" class="form-control" name = 'password' >
		</div>
		<div class="mb-3">
			<label class="form-label">패스워드 확인</label> 
			<input type="password" class="form-control" name = 'passwordconfirm' >
		</div>
		<div class="mb-3">
			<label class="form-label">이름</label> 
			<input type="text" class="form-control" name = 'name' >
		</div>
				
		<button type="submit" class="btn btn-primary">회원가입</button>
	</form>
</body>
</html>