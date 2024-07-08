<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp_loginD.jsp</title>
	</head>
	<body>
		<%  // control + shift + m 
			request.setCharacterEncoding("utf-8"); //post에서 한글안깨짐
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			// out.print(id+pw); // 확인
			Connection conn = null; 
			PreparedStatement pstmt = null; 
			ResultSet rs = null; 
			String query = null; 
			try{
				// db 연결 
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String dbId = "scott";
				String dbPw = "tiger";
				conn = DriverManager.getConnection(url,dbId,dbPw);
				// 쿼리
				query = "select * from member where id=? and pw =?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				rs = pstmt.executeQuery();
				if(rs.next()){
					session.setAttribute("session_id", id);
		%>
			<script>
				alert("로그인되었습니다");
				location.href="jsp_main.jsp";
			</script>
		<%   } else {	%>
			<script>
				alert("아이디 혹은 비밀번호가 일치하지 않습니다\n다시 시도해주세요");
				location.href="jsp_login.jsp";
			</script>
		<% 			
				} // if-else문
			}catch(Exception e){ e.printStackTrace();}
			finally{
				try{
					if(rs!=null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				}catch(Exception e2){e2.printStackTrace();}
			}
			
			
		
		%>
	
	</body>
</html>