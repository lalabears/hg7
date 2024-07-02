<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
			// jquery는 src에 사용할버전의제이쿼리를 포함해줘야함
			$(function(){
				// jquery는 이곳에 작성해야합니다. 
				$("#fbtn").click(function(){ // 버튼을 눌렀을때. 
					alert("페이지를 이동합니다.");
				//	alert( $("#name").val()  );
				//	alert( $("#jumin").val()  );
				//  form 태그이름.submit(); 을 하게되면 form의 action으로 이동
					frm.submit();
				}); // fbtn 
			}); // jquery
		</script>
		
	</head>
	<body>
		<form name="frm" method="get" action="j0702_02_send.jsp">
			<label>이름을 입력하세요</label>
			<br>
			<input type="text" name="name" id="name">
			<br>
			<label>주민등록 번호를 입력하세요 </label>
			<br>
			<input type="text" name="jumin" id="jumin">
			<br>
			<br>
			<!-- <input type="submit" value="확인"> -->
			<input type="button" id="fbtn" value="확인">
		</form>
	</body>
</html>