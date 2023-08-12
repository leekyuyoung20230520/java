<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
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
<script type="text/javascript">
	function deletef(){
		const formData = document.getElementById('deleteform');
		let result = confirm('탈퇴 하시겠습니까?');
		if(result)
			formData.submit();
			
	}
</script>

<form id='deleteform' class="container" action="delete_process.jsp" method="post">
		<div class="mb-3">
			<label class="form-label">아이디</label> 
			<input type="email" class="form-control" name = 'id' >
		</div>
		<div class="mb-3">
			<label class="form-label">패스워드</label> 
			<input type="password" class="form-control" name = 'password' >
		</div>
		<button type="button" class="btn btn-primary" onclick="deletef()">탈퇴하기</button>
	</form>
</body>
</html>