<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생정보 입력 폼</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
		$(function(){
			$("#fbtn").click(function(){
				alert("저장합니다");
				frm.submit();
			});//fbtn
		});// jquery
		</script>
	</head>
	<body>
	<!--  번호, 이름, 국, 영, 수 점수를 입력받는 폼을 만들어보세요 -->
		<form action="j0704_09.jsp" name="frm" method="post">
			<label>번호</label>
			<input type="text" name="stuNo" id="stuNo"><br>
			<label>이름</label>
			<input type="text" name="name" id="name"><br>
			<label>국어</label>
			<input type="text" name="kor" id="kor"><br>
			<label>영어</label>
			<input type="text" name="eng" id="eng"><br>
			<label>수학</label>
			<input type="text" name="math" id="math"><br>
			<input type="button" id="fbtn" value="저장" >
		</form>
	</body>
</html>