<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>m_main.jsp</title>
	</head>
	<body>
	<% if(session.getAttribute("session_id") == null){ %>
		<h1>로그인해주세요</h1>
		<ul>	
			<li><a href="m_login.jsp">로그인</a></li>
			<li><a href="m_write.jsp">회원가입</a></li>
		</ul>
	<% }else{ %>
<%-- 		<h1> <% out.print((String)session.getAttribute("session_id")); %> 님 환영합니다 </h1>--%>		
		<h1> <%=  (String)session.getAttribute("session_id")  %> 님 환영합니다 </h1>
		<ul>	
			<li><a href="m_logout.jsp">로그아웃</a></li>
			<li><a href="m_mlist.jsp">회원전체정보</a></li>
			<li><a href="m_memModify.jsp">회원정보수정</a></li>
		</ul>
	<% } %>
	</body>
</html>