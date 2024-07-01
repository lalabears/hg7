<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
		*{padding : 0; margin: 0; }
		table, td{width: 550px; border: 1px solid black; border-collapse: collapse;
				text-align : center; margin: 30px auto;
		}
		td{height: 30px; width: 100px;}
		</style>
	</head>
	<body>
		<%-- jsp 주석 :  보이지 않음 
			< %    % > : 스크립트릿, 스크립트문을 사용할때 쓰임.
			자바와 마찬가지로 . 세미클론으로 끝남.   
		--%>
		<!--  html 주석 : 외부에 보임 -->
		
		<%
			out.print("이곳에 자바코드를 넣을 수 있습니다 "); 
			int a= 20; 
			float f = 1.234f;
			out.print("a : "+ a +", f: " + f);
		%>
		
		<%  // 자바랑 주석이 똑같습니다. 
			// out.print 안에 태그를 사용할 수 도 있습니다. 
			out.print("<h1>제목태그를 사용했습니다</h1>");
			// 줄바꿈을 하기위해서 html에서는 br태그를 사용해야합니다.
			out.print("안녕하세요");
			out.print("<br>");
			out.print("반갑습니다");
		%>
		
		<%	// 1- 100 까지의 숫자 출력 
			for(int i = 1 ; i <= 100 ; i++){
				out.print(i);
				//out.print(i + "<br>");
			}
			// Q. 구구단을 출력해보세요
			out.print("<br>");
			for(int i = 2 ; i <= 9 ; i++){
				for(int j = 1 ; j <=9 ; j++){
					out.print(i+"*"+j+"="+(i*j)+"&nbsp;&nbsp;&nbsp;");
				}
				out.print("<br>");
			}
		%>
		<!--  테이블 그리기  -->
		<table>
			<tr>
				<td> 2 </td>
				<td> * </td>
				<td> 1 </td>
				<td> = </td>
				<td> 2 </td>
			<tr>
			<tr>
				<td> 2 </td>
				<td> * </td>
				<td> 2 </td>
				<td> = </td>
				<td> 4 </td>
			<tr>
			<tr>
				<td> 2 </td>
				<td> * </td>
				<td> 3 </td>
				<td> = </td>
				<td> 6 </td>
			<tr>
		
		</table>
		
		
		
		
		
	
	</body>
</html>