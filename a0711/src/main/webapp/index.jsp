<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index.jsp</title>
	</head>
	<body>
		<h1> <%= session.getAttribute("sessionId") %>님 </h1>
			<ul>
				<li><a href="join.do">회원가입</a></li>
				<li><a href="login.do">로그인</a></li>
				<li><a href="board.do">게시판</a></li>
				<li><a href="meberAll.do">전체회원</a></li>
				<li><a href="logout.do">로그아웃</a></li>
				<li><a href="index.do">메인</a></li>
			</ul>
	</body>
</html>