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
	
		<% // 구구단이 출력되는 테이블로 만들어보세요 
			out.print("<table>");
			for(int i = 2; i<= 9 ; i++){
				out.print("<tr>");
				out.print("<td colspan='5'>"+i+"단 </td>");
				out.print("</tr>");
				for(int j = 1; j <=9 ; j++){
					out.print("<tr>");
					out.print("<td>"+i+"</td>");
					out.print("<td>*</td>");
					out.print("<td>"+j+"</td>");
					out.print("<td>=</td>");
					out.print("<td>"+(i*j)+"</td>");
					out.print("</tr>");
				}
			}
			out.print("</table>");
		%>
		
		<%  // 스크립트문에 html을 가져와서 사용함 
		 	for(int i = 0; i< 10 ; i++){
			 
			out.print( i + "<p> 안녕하세요 </p>");
		
		   } // for - i 
		 %>
		
		
		<%  
		 	for(int i = 0; i< 10 ; i++){
		%>	 
			<p> <% out.print(i); %> &nbsp; 안녕하세요 </p>
		<%	
		   } // for - i 
		 %>
		
		
		<table>
		<%  // Q. 구구단을 출력해보세요 + 00 단
		 	for(int i = 2; i<= 9 ; i++){
		 		for(int j =1; j <=9 ; j++ ){
		%>	 
			<tr>
				<td> <% out.print(i); %></td>
				<td>*</td>
				<td> <% out.print(j); %></td>
				<td>=</td>
				<td> <% out.print(i*j); %></td>
			</tr>
		 <%	
		 		} // for - j 
		   } // for - i 
		 %>
		</table>
		
		<hr>
		
		 
			<table>
		<%  
			// out.print를 사용하지 않고 결과값만 출력하고 싶을때 표현식을 사용한다.
			// < %=   value  %   > 의 형태
			
			for(int i = 2; i<= 9 ; i++){
		%>
			<tr>
			<td colspan='5'> <%= i %> 단 </td>
			</tr>
		<%
				for(int j = 1; j <=9 ; j++){
		 %>
		 	<tr>
				<td>  <%= i %></td>
				<td>*</td>
				<td>  <%= j %> </td>
				<td>=</td>
				<td>  <%= i*j %></td>
			</tr>
		<% 
				}
			}
		%>
			</table>
		
		
		
		
		
		
		
	
	</body>
</html>