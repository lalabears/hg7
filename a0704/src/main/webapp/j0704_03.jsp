<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>BeanForm</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
		$(function(){
			$("#fbtn").click(function(){
				
				alert( $("#memId").val() + $("#memName").val() );
				
				frm.submit();
				
			});// fbtn을 눌럿을때. 
			
		});// jquery
		</script>
	</head>
	<body>	
		<form action="j0704_05.jsp" method="post" name="frm">
			<label>이름</label>
			<input type="text" name="memName" id="memName">
			<br>
			<label>아이디</label>
			<input type="text" name="memId" id="memId">
			<br>
			<input type="button" id="fbtn" value="저장">
			<br>
		</form>
	
	</body>
</html>