<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>확인페이지</title>
	</head>
	<body>
		<h1>전송으로 넘어온페이지입니다.</h1>
		<%
		 	String name = request.getParameter("name");
			String jumin = request.getParameter("jumin");
			
			int i = Integer.parseInt(jumin.substring(7,8)) ; // 1,2 인지 3,4인지
			String j = jumin.substring(0,2); // "83"
			String age=""; 
			if(i == 1 || i == 2)	age = "19"+j;
			else age = "20"+j;
			int a = 2024 - Integer.parseInt(age);	
			out.print(name + " 님 <br>");
			out.print("나이 :" + a);
			out.print("<br>");
			if ( a >= 19 ) {
				out.print("술 판매 가능"); 
				response.sendRedirect("success.jsp?name="+name+"&age="+a);
			//	response.sendRedirect("success.jsp");
			}
			else {
				out.print("술 판매 불가능");
				// reject.jsp 파일을 만들어서 . 00님 00세로 술판매가 불가능합니다.
				response.sendRedirect("reject.jsp?name="+name+"&age="+a);
				
			}
		//	0702_02_send.jsp?name=홍길동&jumin=990101-1234567
			
			
		/* 	
			<script>
			alert("판매가능!");
			location.href = "https://wonsoju.com/";
			</script>	 */		
			
		%>
	
	</body>
</html>