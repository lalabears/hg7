<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>loginCk</title>
	</head>
	<body>
		<%
		// 세션은 클라이언트가 웹어플리케이션 서버에 접속할때 서버쪽에 생성되는 공간. 
		// 세션 유효시간이나 브라우저 종료전까지 유지. 다른페이지에서도 정보공유가능.
		// 로그인유지, 장바구니 등에서 사용됨. 
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			if(id.equals("aaa") && pw.equals("1111")){
				// 세션에 정보를 저장시키기 session.setAttibute( 변수명, 값 )
				session.setAttribute("sessionId", id);
				session.setAttribute("sessionNicName", "홍시");
				session.setAttribute("sessionName", "홍길동");
				response.sendRedirect("jsp_main.jsp");
			} else {
				response.sendRedirect("jsp_login.jsp");
			}
		%>
	
	</body>
</html>