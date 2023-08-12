<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
	function selectf(){
		window.location.href = 'select.jsp';
	};
	function insertf(){
		window.location.href = 'signup.jsp';
	};
	function updatef(){
		window.location.href = 'select.jsp';
	};
	function deletef(){
		window.location.href = 'delete.jsp';
	};
</script>

	<div class="container">
		<h3>JDBC CRUD 연습</h3>
		<button type="button" class="btn btn-primary" onclick="insertf()">회원가입</button>		
		<button type="button" class="btn btn-secondary" onclick="selectf()">조회</button>		
		<button type="button" class="btn btn-success">업데이트</button>
		<button type="button" class="btn btn-danger" onclick="deletef()">삭제</button>
		<!-- <button type="button" class="btn btn-warning">Warning</button>
		<button type="button" class="btn btn-info">Info</button>
		<button type="button" class="btn btn-light">Light</button>
		<button type="button" class="btn btn-dark">Dark</button>

		<button type="button" class="btn btn-link">Link</button> -->
	</div>
</body>
</html>