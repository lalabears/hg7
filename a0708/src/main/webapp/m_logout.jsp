<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>m_logout.jsp</title>
	</head>
	<body>
		<% session.invalidate(); // 세션전체정보삭제  %>
		<script type="text/javascript">
			alert("로그아웃되었습니다.");
			location.href="m_main.jsp";
		</script>
	
	</body>
</html>