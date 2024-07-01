<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  html의 주석입니다  -->
	<h1>회원가입</h1>
	<form action="TestServlet" name="frm" method="get">
		<label>이름</label>
		<input type="text" name="name"><br> <!--  이름=값 -->
		<!-- 나이를 추가해보세요  -->
		<label>나이</label>
		<input type="text" name="age"><br> 
		<label>성별</label>
		<input type="radio" name="gender" id="male" value="male">
		<label for="male">남성</label>
		<input type="radio" name="gender" id="female" value="female">
		<label for="female">여성</label><br>
		<label>취미</label>
		<input type="checkbox" name="hobbys" id="game" value="game">
		<label for="game">게임</label>
		<input type="checkbox" name="hobbys" id="golf" value="golf">
		<label for="golf">골프</label>
		<input type="checkbox" name="hobbys" id="swim" value="swim">
		<label for="swim">수영</label>
		<input type="checkbox" name="hobbys" id="run" value="run">
		<label for="run">달리기</label>
		<input type="checkbox" name="hobbys" id="book" value="book">
		<label for="book">독서</label><br>
	
	<input type="submit" value="전송">
	</form>
</body>
</html>