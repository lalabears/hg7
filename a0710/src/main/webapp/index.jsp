<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index.jsp</title>
	</head>
	<body>
	<%  if(session.getAttribute("sessionId")==null){ %>
		<h1>로그인해주세요</h1>
		<ul>	
			<li><a href="login.jsp">로그인</a></li>
			<li><a href="mwrite.jsp">회원가입</a></li>
		</ul>
	<% } else { %>
		<h1> <%= session.getAttribute("sessionName") %>님 환영합니다 </h1>
		<ul>	
			<li><a href="logout.jsp">로그아웃</a></li>
			<li><a href="doList.do">회원전체정보</a></li>
			<li><a href="list.jsp">게시판</a></li>
		</ul>
	<% } %>
	</body>
</html>