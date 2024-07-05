<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입페이지</title>
	</head>
	<body>
		<h2>회원가입</h2>
		<form action="j0705_joinOk.jsp"  method="get" name="memberFrm">
			<label>이름</label>
			<input type="text" id="name" name="name"> <br>
			<label>아이디</label>
			<input type="text" id="id" name="id"> <br>
			<label>비밀번호</label>
			<input type="text" id="pw" name="pw"> <br>
			<label>전화번호</label>
			<input type="text" id="phone" name="phone"> <br>
			<br>
			<input type="submit" value="가입">
		</form>
	
	</body>
</html>