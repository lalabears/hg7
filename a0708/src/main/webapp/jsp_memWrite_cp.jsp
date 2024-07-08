<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp_memWrite_cp.jsp</title>
	</head>
	<body>
	<% 	request.setCharacterEncoding("utf-8");
		// 전달받은 값 출력하기 아이디,비밀번호,이름,전화번호,성별,취미
		String id,name,pw,phone,gender,hobby="";
		id = request.getParameter("uid");
		pw = request.getParameter("upw");
		name = request.getParameter("uname");
		phone = request.getParameter("phone");
		gender = request.getParameter("gender");
		String[] hobbys = request.getParameterValues("hobby");
		for(int i = 0 ; i <hobbys.length; i++){
			if(i==0) hobby+= hobbys[i];
			else hobby+="," + hobbys[i];
		}
		//out.print(id+name+pw+phone+gender+hobby);
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null; 
		String query = null; 
		try{
			conn = ds.getConnection();
			query = "insert into member values(?,?,?,?,?,?,sysdate)";
			// 'aaa','1111','홍길동','010-1111-1111',null,null,sysdate
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.setString(2,pw);
			pstmt.setString(3,name);
			pstmt.setString(4,phone);
			pstmt.setString(5,gender);
			pstmt.setString(6,hobby);
			int result = pstmt.executeUpdate(); // insert, update, delete 
			if(result == 1){
				// 성공 정보가 잘 저장됨
			%>
			<script>
				alert("회원정보가 저장되었습니다.");
				location.href="jsp_main.jsp";
			</script>
			<% 			}else{ 		//  저장실패 %>
			<script>
				alert("회원정보저장시 오류가 발생하였습니다.");
				history.back();
			</script>
			<%  
			}
		}catch (Exception e){ e.printStackTrace();}
		finally{
			try{
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		
		
		
	%>
	
	</body>
</html>