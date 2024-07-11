<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bview.jsp</title>
		<style type="text/css">
		*{margin:0; padding:0;}
		div{width:800px; margin: 30px auto; text-align:center;}
		h1{margin-bottom: 30px;}
		table,th,td{border: 1px solid black; border-collapse:collapse; 
				font-size: 16px;}
		th { width: 300px; height: 40px;}
		td { width: 500px; height: 40px;}
		button{width:200px; height: 60px; margin-top: 30px;}
		</style>
	</head>
	<body>
		<div>
			<h1>게시글보기</h1>
			<table>
				<tr>
					<th>번호</th>
					<td>${board.getBno() }</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>${board.getBtitle() }</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>${board.getBcontent() }</td>
				</tr>
				<tr>
					<th>날짜</th>
					<td>${board.getBdate() }</td>
				</tr>
				<tr>
		       		<th>파일첨부</th>
		       		<td><img src="upload/${board.getBfile() }"></td>
		     	</tr>
		     	
			</table>
			
			<script>
				function modiBtn(){
					if(confirm("정말로 수정하시겠습니까?")){
						location.href = "modi.do?bno=${board.getBno()}";
					}
				}
				function deleteBtn(){
					if(confirm("정말로 삭제하시겠습니까?")){
						location.href = "delete.do?bno=${board.getBno()}";
					}
				}
			
			</script>
			
			<button type="button" onclick="modiBtn()">게시글수정</button>
			<button type="button" onclick="deleteBtn()">게시글삭제</button>
			<a href="board.do"><button type="button">게시글리스트</button></a>
		
		</div>
		
		
		
		
		
	
	</body>
</html>