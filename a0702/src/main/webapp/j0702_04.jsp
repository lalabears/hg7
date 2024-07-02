<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
		<style>
		*{padding: 0; margin: 0; }
		#main{width:100%; height:400px; background: pink;}
		#top{width:100%; height:80px; background: red;}
		nav{width:80%; height:78px; background: brown;}
		</style>
	</head>
	<body>
		<%@ include file="top.jsp" %>
		<div id="main">
			<form action="check.jsp" method="get" name="frm">
				<label>아이디 : </label>
				<input type="text" name="id" id="id">
				<br><br>
				<input type="submit" value="가입">
			</form>
		</div>
	
	<%-- check.jsp 파일을 만들어서. 
		 아이디가 aaa와같으면 j0702_04.jsp페이지로
		 다르다면 다릅니다 라고 출력해보세요 
	 --%>
	
	
	</body>
</html>