<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session</title>
	</head>
	<body>
		<%  // 세션 설정하기
			// session.setAttribute(이름, 값);
			session.setAttribute("sessionId", "admin");
			session.setAttribute("sessionNicName", "관리자");
			session.setAttribute("sessionName", "홍길동");
		%>
		<a href="session_get.jsp"> 세션 읽어오기 </a>
	
	</body>
</html>