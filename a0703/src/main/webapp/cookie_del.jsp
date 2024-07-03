<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키삭제</title>
	</head>
	<body>
		<%
			Cookie[] cks = request.getCookies(); // 쿠키 전체 가져오기
			if(cks != null){
				for(int i = 0 ; i < cks.length; i++ ){
					cks[i].setMaxAge(0);     // 쿠키삭제 
					response.addCookie(cks[i]);
				}
			}
		%>
		<h1>쿠키가 삭제되었습니다.</h1>
		<a href="cookie_list.jsp">쿠키 리스트</a>
	
	</body>
</html>