<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인페이지</title>
	</head>
	<body>
		<h2>메인페이지</h2>
		<ul>
		<% if(session.getAttribute("sessionId") == null) { %>
			<li><a href="j0705_join.jsp">회원가입</a></li>
			<li><a href="j0705_longin.jsp">로그인</a></li>
		<% } else { %>
			<li>게시판</li>
			<li><a href="j0705_memberList.jsp">회원정보리스트</a></li>
			<li><a href="j0705_modify.jsp">회원정보수정</a></li>
			<li><a href="j0705_logout.jsp">로그아웃</a></li>
		<% } %>
		</ul>
	</body>
</html>