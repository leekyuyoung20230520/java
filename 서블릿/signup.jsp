<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	text-align: center;
}

.form-container {
	display: flex; /* 요소들을 가로로 정렬 */
	justify-content: center; /* 가운데 정렬 */
	align-items: center; /* 수직 가운데 정렬 */
	height: 100vh; /* 뷰포트 전체 높이 */
}

.form {
	text-align: left;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	background-color: #f9f9f9;
	max-width: 400px; /* 폼의 최대 너비 지정 */
	width: 100%; /* 폼의 너비 100% 설정 */
}

.form p {
	margin: 10px 0;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}
</style>
</head>
<body>

	<div class='form-container'>
		<form action="signup">
			<p>
				아이디 :<input type="text" name="id">
			</p>
			<p>
				패스워드 :<input type="text" name="psw">
			</p>
			<p>
				패스워드확인:<input type="text" name="pswconfirm">
			</p>
			<p>
				이름 :<input type="text" name="name">
			</p>
			<p>
				<input type="submit" value="회원가입하기">
		</form>
	</div>
</body>
</html>