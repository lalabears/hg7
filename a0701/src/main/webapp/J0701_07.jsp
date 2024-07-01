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
			out.print("서버이름 : "+ request.getServerName()+"<br>");
			out.print("포트번호 : "+ request.getServerPort()+"<br>");
			out.print("프로젝트명: "+ request.getContextPath()+"<br>");
			out.print("get,post : "+request.getMethod()+"<br>");
			out.print("프로토콜 : " + request.getProtocol()+"<br>");
			out.print("url 전체주소 : "+ request.getRequestURL()+"<br>");
			out.print("uri 주소: "+ request.getRequestURI()+"<br>");
			out.print("접속자 ip: "+ request.getRemoteAddr()+"<br>"); 
		
			// string 메서드를 사용해서 프로젝트명의 길이를 출력해보세요 
			// string의 메서드를 사용해서 파일이름을 가져오세요 : substring
			// 프로젝트명: /a0701
			// uri 주소: /a0701/J0701_07.jsp 
			int len = request.getContextPath().length();
			String uri = request.getRequestURI(); 
			out.print("프로젝트명의 길이 : " + len +"<br>");
			String fileName = uri.substring(len+1);
			out.print("파일이름 : "+ fileName);
			
		
		
		%>
	
	</body>
</html>