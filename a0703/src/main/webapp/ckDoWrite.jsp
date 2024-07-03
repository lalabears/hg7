<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키 생성하기 </title>
	</head>
	<body>
		<%
			String name = request.getParameter("co_name");
			String value = request.getParameter("co_value");
			Cookie c1 = new Cookie(name,value);
			c1.setMaxAge(60*60*24);
			response.addCookie(c1);
			response.sendRedirect("ckList.jsp");
		%>
	</body>
</html>