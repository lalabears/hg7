<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>main</title>
	</head>
	<body>
	<% if( session.getAttribute("sessionId") == null) { %>
		<h1>로그인해주세요</h1>
		<ul>
			<li>회원가입</li>
			<li><a href="jsp_login.jsp">로그인</a></li>
		</ul>
	<%  } else { %>
		<h1> <%= (String)session.getAttribute("sessionNicName") %>님 환영합니다</h1>
		<ul>
			<li>회원정보</li>
			<li><a href="jsp_logout.jsp">로그아웃</a></li>
			<li>게시판</li>
		</ul>
	<%  } // else-if %>
	
	</body>
</html>