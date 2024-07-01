<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
		*{padding : 0; margin: 0; }
		table, td,th{width: 550px; border: 1px solid black; border-collapse: collapse;
				text-align : center; margin: 30px auto;
		}
		td,th{height: 30px; width: 100px;}
		</style>
	</head>
	<body>
		<% //스크립트문. 자바코드를 넣는다  
			int a = 10;
			int b = 20; 
			out.print(a+"+"+b+"="+(a+b)); // out.print html에 출력해줌
		%>
		<br>
		<% 	for(int i = 0 ; i < 5 ; i++){ %>
<%-- 			<%=  i+1  %>	<br>        out.print를 생략할 수 있다 --%>
		<%	}	%>
		<hr>
		<%! // 선언식 함수, 전역변수를 선언할때 사용된다. 
			// 메서드, 함수 같은경우는 주로 서블릿에서 사용함
			int num1=10;
			int num2=20;
		    public int sum(int a, int b){
				return a+b;
			}
		%>	
		<% out.print(sum(10,20)); %>
		<hr>	
		<% out.print("<h2>1에서부터 100까지의 합을 구해서 출력해보세요</h2>");
		   int sum = 0 ; 
		   for( int i = 1 ; i <= 100 ; i++ ){
			   sum += i; 
		   }
		   out.print("답: "+sum);
		%>
		<hr>
		<%  // 2. 배열속에 있는 숫자의 합을 구해서 출력해보세요 
			int[] arr = {1,2,3,4,5,6,7,8,9,10,11}; 
			sum = 0;
			for(int i = 0; i< arr.length; i++){
				sum += arr[i];
			}
		%>
		<p> 답은 : <%= sum %> </p>
		<hr>
		<%-- 3. 1-100사이의 랜덤숫자를 10개 저장하는 배열을 만들어서 그 랜덤숫자의 합을 출력 --%>
		<%
			int[] arr2 = new int[10]; 
			sum = 0; 
			for(int  i = 0 ; i <arr2.length ; i ++ ){
				arr2[i] = (int)(Math.random()*100)+1;
				sum += arr2[i] ;
			}
			
			out.print("배열 속 숫자들 : " + Arrays.toString(arr2));
			out.print("<br>");
			out.print(sum);
		%>
		
		<br>
		<%-- 선언한메서드를 스크립트문을 사용해서 출력하기 --%>
		<% out.print(sum(4,5)); %>
		<br>
		<%-- 선언한메서드를 표현식으로 출력하기 --%>
		<%= sum(1,2) %>
		
		<hr>
		<table>
			<tr>
				<td> <%= num1 %> </td>
				<td> <%= num2 %> </td>
				<td> <%= sum(num1,num2) %> </td>
			</tr>
		</table>
		
		<%--    n1 부터 n2 까지의 합을 구하는 sumAll(int n1, int n2)를 만들어보세요 --%>
		<%! // 메서드:  리턴타입  메서드명(매개변수)
			private int sumAll(int n1, int n2){
				int sum =0;
				for(int i = n1 ; i <=n2 ; i++ ){
					sum += i;
				}
				return sum; 
			}
		%>
		
		
		<%= sumAll(1,10) %> <!--  출력값으로 55가 출력이되도록 -->
	
		<table>
			<tr>
				<th>순서</th>
				<th>합계</th>
			</tr>
		<!--  for문 시작  -->	
		<%	int total = 0; 
			for(int i = 1 ; i <=10; i++ ){ %>
			<tr>
				<td> <%= i %></td>
				<td> <%= total+=i %> </td>
				<%-- <%= sumAll(1,i) %> --%>
			</tr>
		<% } %>
		<!--  for문 끝  -->	
		</table>
	
	
	
	
	</body>
</html>