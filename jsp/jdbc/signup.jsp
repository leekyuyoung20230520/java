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
<script
  src="https://code.jquery.com/jquery-3.7.0.min.js"
  integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
  crossorigin="anonymous"></script>	
</head>
<script type="text/javascript">
	$(document).ready(function(){
		 let isCheckedId = false;
		 let isPasswordConfirm = false;
		 
		$("#id").on("blur",function(){
			const id = $("#id").val();
			$.ajax({
				type:"GET",
				url : "check_id_duplicate.jsp",
				data : {id:id},
				success:function(data){
					if(data === 'duplicate'){
						$("#id-mismatch").html("사용할 수 없는 아이디 입니다.");
						isCheckedId = false;
					}else{
						$("#id-mismatch").html("");
						isCheckedId = true;
					}
				}
			});
		});
		
		
		$("#passwordconfirm").on("keyup",function(){
			let password =$("#password").val();
			let passwordconfirm =$(this).val();			
			if(password === passwordconfirm){
				$("#password-mismatch").html("");
				//$("#submit-button").removeAttr("disabled");
				isPasswordConfirm = true;
				
			}
			else{
				$("#password-mismatch").html("패스워드가 일치하지 않습니다.");
				//$("#submit-button").attr("disabled","disabled");
				isPasswordConfirm = false;
			}
		});
		
		$("#id-form").submit(function(event){
			event.preventDefault();
			if (isPasswordConfirm && isCheckedId)
				$("#id-form").get(0).submit();
			else{				
				alert('패스워드확인 또는 아이디중복을 확인하세요');
			}
		})
		
	});
</script>

<body>
<%
	String type = request.getParameter("type");
	String id = request.getParameter("id");
	String psw = request.getParameter("password");
	String name = request.getParameter("name");
	String buttonName = "회원가입";
	String action = "signup_process.jsp";
	if(type !=null){
		buttonName = "수정";
		action = "update_process.jsp";
	}
%>
	<form id = "id-form"  class="container" action="<%=action %>" method="post">
		<div class="mb-3">
			<label class="form-label">아이디</label>
			<input type="email" id = "id" class="form-control" name = 'id' required="required"
			<% if(type != null) %> value="<%=id %>"  >
			<div id=id-mismatch style="color: red;"></div>	
			
		</div>
		<div class="mb-3">
			<label class="form-label">패스워드</label> 
			<input type="password" id="password" class="form-control" name = 'password'  required="required"
			<% if(type != null) %> value="<%=psw %>"  >
		</div>
		<div class="mb-3">
			<label class="form-label">패스워드 확인</label> 
			<input type="password" id = "passwordconfirm" class="form-control" name = 'passwordconfirm' required="required" >
			<div id=password-mismatch style="color: red;"></div> 
		</div>
		<div class="mb-3">
			<label class="form-label">이름</label> 
			<input type="text" class="form-control" name = 'name' required="required"
			<% if(type != null) %> value="<%=name %>"  >
		</div>
				
		<button id="submit-button" type="submit" class="btn btn-primary"><%=buttonName %></button>
	</form>
</body>
</html>