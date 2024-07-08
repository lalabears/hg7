<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp_memWrite</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
			*{margin: 0; padding: 0; }
			div{width: 400px; margin: 30px auto; text-align:center;}
			h1{margin-bottom: 30px;}
			table, th, td{border: 1px solid black; border-collapse: collapse;
							font-size: 16px;}
			th{width: 200px; height: 40px;}
			td{width: 400px; height: 40px;}
			button{width: 150px; height: 40px; margin-top: 30px;}
		</style>
		<script>
		$(function(){
			$("#fbtn").click(function(){
				alert("회원정보를 저장합니다");
				mFrm.submit();
			}); // fbtn
		}); // jquery
		
		
		</script>
	</head>
	<body>
	<div>
		<h1>회원가입</h1>
		<form action="jsp_memWrite_cp.jsp" name="mFrm" method="post">
			<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="uid" id="uid"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="text" name="upw" id="upw"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="uname" id="uname"></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="phone" id="phone"></td>
				</tr>
				<tr>
					<th>성별</th>
					<td>
						<input type="radio" name="gender" id="Male" value="Male">
						<label for="Male">남자</label>
						<input type="radio" name="gender" id="Female" value="Female">
						<label for="Female">여자</label>
					</td>
				</tr>
				<tr>
					<th>취미</th>
					<td>
						<input type="checkbox" name="hobby" id="game" value="game">
						<label for="game">게임</label>
						<input type="checkbox" name="hobby" id="golf" value="golf">
						<label for="golf">골프</label>
						<input type="checkbox" name="hobby" id="run" value="run">
						<label for="run">조깅</label>
						<input type="checkbox" name="hobby" id="cook" value="cook">
						<label for="cook">요리</label>
						<input type="checkbox" name="hobby" id="book" value="book">
						<label for="book">독서</label>
					</td>
				</tr>
			</table>
			<button type="button" id="fbtn">저장</button>		
			<button type="button" onclick="javascript:history.back()">취소</button>		
		
		</form>
		</div>
	
	
	</body>
</html>