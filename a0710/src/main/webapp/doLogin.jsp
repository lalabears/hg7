<%@page import="com.java.www.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doLogin.jsp</title>
	</head>
	<body>
		<%
			// 1.아이디, 비밀번호값 가져오기 
			String uId = request.getParameter("id");
			String uPw = request.getParameter("pw");
			// 2. MemberDao 객체 선언및 생성하기 
			MemberDao mdao = new MemberDao();
			Member m = mdao.selectLogin(uId, uPw);
			// 3. MemberDao에 메서드 만들기
			// 4. 로그인성공시 sessionId, sessionName 아이디 이름 설정하기
			if(m!=null){
				session.setAttribute("sessionId", m.getId());
				session.setAttribute("sessionName", m.getName());
			%>
				<script>
					alert("로그인되었습니다");
					location.href="index.jsp";
				</script>
			<% }else{ %>
				<script>
					alert("아이디비밀번호가잘못입력되었습니다");
					location.href="login.jsp";
				</script>
			<% }  %>
		
		%>
	
	</body>
</html>