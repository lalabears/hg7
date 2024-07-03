<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>CooKie Write 페이지 </title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
		$(function(){
			$("#fbtn").click(function(){
				alert( $("#co_name").val() );
				alert( $("#co_value").val() );
				coFrm.submit();
			});
		});// jquery사용
		</script>
	</head>
	<body>
		<h1> 쿠키 생성 </h1>
		<form name="coFrm" method="post" action="ckDoWrite.jsp">
			<label>쿠키이름</label>
			<input type="text" name="co_name" id="co_name">
			<br>
			<label>쿠키 값</label>
			<input type="text" name="co_value" id="co_value">
			<br>
			<input type="button" id="fbtn" value="저장">
			<br>
		</form>
	
	</body>
</html>