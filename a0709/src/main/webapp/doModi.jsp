<%@page import="com.java.www.Board"%>
<%@page import="com.java.www.BoardDao"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doModi.jsp</title>
	</head>
	<body>
	 <%
	 		// 아이디, 번호, 제목, 내용, 파일명을 가져와서 
	 	String uploadPath="c:/upload";
		int size = 10*1024*1024; 
		MultipartRequest multi = new MultipartRequest( request,uploadPath,
				 size,"utf-8", new DefaultFileRenamePolicy());
		String uBfile = multi.getFilesystemName("bfile");
		String uBtitle = multi.getParameter("btitle");
		String uBcontent = multi.getParameter("bcontent");
		String bno = multi.getParameter("bno");
		//out.print(uBfile+uBtitle+uBcontent+uId);
		//out.print("<br>"+bno);
		BoardDao bdao = new BoardDao(); 
		Board b = new Board();
		b.setBno(Integer.parseInt(bno));
		b.setBfile(uBfile);	b.setBtitle(uBtitle); b.setBcontent(uBcontent);
	 	int result = bdao.updateOne(b);
	 		// 쿼리에서는 번호로 제목, 내용, 파일명 수정
		 if(result!=1){
	%>
		<script>
			alert("수정실패. 다시시도해주세요");
			location.href="blist.jsp";
		</script>
	<% }else{ %>
		<script>
			alert("글수정성공");
			location.href="blist.jsp";
		</script>
	<% } %>
	</body>
</html>