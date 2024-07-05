<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.java.www.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 확인</title>
	</head>
	<body>
		<%
		    request.setCharacterEncoding("utf-8");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberDAO mdao = new MemberDAO();
			Member member = mdao.selectLogin(id, pw);
			// 로그인이 되었다면. 즉 db에 데이터가 있다면. 
			if( member != null ){
				// 세션에 아이디와 이름을 넣기
				session.setAttribute("sessionId", member.getId());
				session.setAttribute("sessionName", member.getName());
		%>
		<script>
			alert("로그인되었습니다");
			location.href="j0705_main.jsp";
		</script>
		<% } else { %>
		<script>
			alert("아이디 또는 비밀번호가 일치하지 않습니다\n다시로그인해주세요");
			location.href="j0705_longin.jsp";
		</script>

		<% } //if- else %>	
	</body>
</html>