<%@page import="com.java.www.dto.Member"%>
<%@page import="com.java.www.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인확인 (doLogin.jsp)</title>
	</head>
	<body>
		<%
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberDao mdao = new MemberDao();
			Member member = mdao.selectLogin(id,pw);
			if(member!=null){
				session.setAttribute("sessionId", member.getId());
				session.setAttribute("sessionName", member.getName());
			%>
			<script type="text/javascript">
				alert("로그인성공");
				location.href="index.jsp";
			</script>
		<% 	}else{  %>
			<script type="text/javascript">
				alert("로그인실패");
				location.href="login.jsp";
			</script>
		<% 	}  %>
		
	
	
	</body>
</html>