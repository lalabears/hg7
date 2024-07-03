<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세션 로그인페이지</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
		$(function(){
			$("#lbtn").click(function(){
				alert($("#id").val());
				alert($("#pw").val());
				frm.submit();
			});
		});// jquery
		</script>
	</head>
	<body>
		<h1>로그인</h1>
		<form action="session_doLogin.jsp" name="frm" method="post">
			<label>아이디</label>	<input type="text" name="id" id="id"><br>
			<label>비밀번호</label><input type="text" name="pw" id="pw"><br>
			<input type="button" id="lbtn" value="로그인">
			<br>
		</form>
	</body>
</html>