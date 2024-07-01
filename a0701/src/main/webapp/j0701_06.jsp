<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>파일 포함시키기</title>
		<style>
		*{padding:0; margin:0;}
		#main{ width: 100%; height: 400px; background: pink;}
		#top{width: 100%; height: 80px; border: 1px solid black;}
		nav{width: 80%; height: 78px; border: 1px solid black;
			margin: 0 auto; background: green;} 
		#foot{ width:100%; height : 80px; border: 1px solid black;}
		footer{width: 80%; height: 78px; border: 1px solid black; 
			margin: 0 auto; background: yellow;}
		</style>
	</head>
	<body>
		<%@ include file="top.jsp" %>
		<div id="main">
			<h1>여기는 메인페이지 입니다. </h1>
			<%@ include file="sub.jsp" %>
			<h1>메인페이지의 끝부분 입니다. </h1>
		</div>
		<%@ include file="footer.jsp" %>
	</body>
</html>