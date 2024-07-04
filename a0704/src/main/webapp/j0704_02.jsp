<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bean</title>
	</head>
	<body>
		<!--  객체를 선언한 것과 같다  -->
		<jsp:useBean id="member" class="com.java.www.Member" scope="page" />
		<jsp:useBean id="m1" class="com.java.www.Member" scope="page" />
		<!--  객체에 값을 넣어준것과 같다 -->
	<%--<jsp:setProperty name="member" property="memId" value="aaa" />
		<jsp:setProperty name="member" property="memName" value="홍길동" /> --%>
		<%
			member.setMemId("bbb");
			member.setMemName("강백호");
		%>
		<!--  객체 값 출력  -->
		<h1>
			<jsp:getProperty name="member" property="memId" />
		</h1>
		<h1>
			<jsp:getProperty name="member" property="memName" />
		</h1>
	
	
	</body>
</html>