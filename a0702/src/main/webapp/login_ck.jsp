<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			// id = admin	pw = 1111 인경우만 <h1>로그인에 성공하셨습니다</h1>
			if( id.equals("admin") && pw.equals("1111")){
				out.print("<h1>로그인에 성공하셨습니다</h1>");
			}else{
			//	response.sendRedirect("login.jsp");
				response.sendRedirect("login.jsp?logCheck=0");
			}
		%>
	</body>
</html>