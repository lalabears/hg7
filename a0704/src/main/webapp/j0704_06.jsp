<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.java.www.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bean-student</title>
	</head>
	<body>
	<%
	   Student s2 = new Student();
	   s2.setStuNo(2);
	   
	%>
	 	<!--  객체선언하기 : 객체이름: s1, 클래스이름: com.java.www.Student  -->
		<jsp:useBean id="s1" class="com.java.www.Student" />
		<!--  객체에 값 넣기 -->
		<jsp:setProperty property="stuNo" name="s1" value="1"/>
		<jsp:setProperty property="name" name="s1" value="홍길동"/>
		<jsp:setProperty property="kor" name="s1" value="100"/>
		<jsp:setProperty property="eng" name="s1" value="90"/>
		<jsp:setProperty property="math" name="s1" value="95"/>
		<h1>
			<jsp:getProperty property="stuNo" name="s1"/>
		</h1>
		<h1>
			<jsp:getProperty property="name" name="s1"/>
		</h1>
	
	</body>
</html>