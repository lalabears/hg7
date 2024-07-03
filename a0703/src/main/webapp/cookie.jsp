<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키생성</title>
	</head>
	<body>
		<!--  쿠키: 클라이언트에 저장되는 작은 정보를 의미함. 
			      서버의 요청으로 브라우저가 저장하게되며, 서버가 요청할때 제공함.
			      보안상 문제가 될 수 있음. 
			      광고, 사용자의이용행태 추적에 이용될 수 있음 (동의가필요함) 
			      재방문 등의 확인 용도로 많이 사용됨 
			      용량이 제한적이어서 사용이 적은편. 
			      자동로그인 기능이나 세션 사용이 제한될때 유용하게 사용할 수 있음  
		-->
		<%  // 쿠키생성
			Cookie ck1 = new Cookie("userId","admin");
			Cookie ck2 = new Cookie("nickName","홍시");
			// 쿠키 시간 설정 
			ck1.setMaxAge(10); // 60초 
			ck2.setMaxAge(60*60*24); // 60초*60분*24시간 = 1일 
			// 로컬 컴퓨터에 저장 
			response.addCookie(ck1);
			response.addCookie(ck2);
		%>
		<h1>쿠키를 생성했습니다. </h1>
		<a href="cookie_list.jsp">쿠키생성확인</a>
	</body>
</html>