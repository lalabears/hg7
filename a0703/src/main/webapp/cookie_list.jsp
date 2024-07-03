<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키리스트</title>
	</head>
	<body>
		<h1>쿠키 리스트</h1>
		<% // 쿠키 : ck1, ck2가 들어있음. 
			Cookie[] cks = request.getCookies(); // 쿠키 배열로 받음
			if(cks!=null){
				for(int i = 0; i<cks.length; i++ ){
					out.print("쿠키"+(i+1)+": "+ cks[i].getName()+"<br>");
					out.print("쿠키"+(i+1)+": "+ cks[i].getValue()+"<br>");
				}
			}
		%>
		<a href="cookie.jsp">쿠키 생성</a>
		<a href="cookie_del.jsp">쿠키 삭제</a>
		
		
	</body>
</html>