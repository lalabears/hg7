<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 체크(session_doLogin.jsp)</title>
	</head>
	<body>
		<h1>로그인 검사하는 페이지입니다 </h1>
		<%
		   String id = request.getParameter("id");
		   String pw = request.getParameter("pw");
		   // id = admin  pw = 1111 이면 로그인되었습니다 라고 얼럿창띄우기
		   if( id.equals("admin") && pw.equals("1111")){
			   // 세션에 추가하기 
			   session.setAttribute("session_id", id);
			   session.setAttribute("session_nicName","관리자");
		%>
		<script>
			alert("로그인되었습니다!");
			location.href = "session_list.jsp";
		</script>
		<% } else {%>
		<script>
			alert("아이디 혹은 비밀번호가 일치하지 않습니다.\n다시 로그인해주세요!");
			location.href="session_login.jsp";
		</script>
		<% } %>
		
		
	</body>
</html>