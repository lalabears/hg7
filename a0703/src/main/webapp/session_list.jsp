<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세션리스트(session_list.jsp)</title>
	</head>
	<body>
		<ul>
		<!-- 로그인 하기전  -->
		<%  if(session.getAttribute("session_id") == null ) { %>
			<li>회원가입</li>
			<li><a href="session_login.jsp">로그인</a></li>
		<%  } else { %>	
		<!-- 로그인 한 후  -->
		<h1> <%= (String)session.getAttribute("session_nicName") %>님 환영합니다. </h1>
			<li><a href="session_logout.jsp">로그아웃</a></li>
			<li>회원정보</li>
			<li>관리자게시판</li>
		<%  }   %>
		</ul>
	</body>
</html>