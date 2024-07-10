<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>result2.jsp </title>
	</head>
	<body>
		<h2>아이디: ${param.id }</h2>
		<h2>이름: ${param.name }</h2>
		<%
			RequestDispatcher dispatcher = 
			request.getRequestDispatcher("result3.jsp?result=1");
			dispatcher.forward(request, response);
		%>

		<%-- <% response.sendRedirect("result3.jsp?result=1"); %> --%>
	
	</body>
</html>