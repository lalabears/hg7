<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
			$(function(){
				$("#fbtn").click(function(){
					alert( $("#id").val() );
					frm.submit(); // form태그속 name을 submit한다. > action으로이동
				});//fbtn
			});// jquery
		</script>
	</head>
	<body>
		<h1>로그인</h1>
		<form action="S01" method="post" name="frm">
			<label>아이디</label><br>
			<input type="text" id="id" name="id"><br>
			<label>비밀번호</label><br>
			<input type="text" pw="pw" name="pw"><br>
			<input type="button" id="fbtn" value="로그인">
			<br>
		</form>
	</body>
</html>