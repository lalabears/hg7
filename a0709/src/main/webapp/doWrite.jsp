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
		<title>doWrite.jsp</title>
	</head>
	<body>
	<% // 파일을 가져옴. 
		String uploadPath="c:/upload";
		int size = 10*1024*1024; 
		MultipartRequest multi = new MultipartRequest( request,uploadPath,
				 size,"utf-8", new DefaultFileRenamePolicy());
		
		String uBfile = multi.getFilesystemName("bfile");
		String uBtitle = multi.getParameter("btitle");
		String uBcontent = multi.getParameter("bcontent");
		String uId = (String)session.getAttribute("sessionId");
		// out.print(uBfile+uBtitle+uBcontent+uId);
		BoardDao bdao = new BoardDao(); 
		// 넘겨받은 정보로 board 객체 생성 
		Board b = new Board(); // 기본생성자를 안만들엇으면 오류남니다 public으로
		b.setBtitle(uBtitle);
		b.setBcontent(uBcontent);
		b.setId(uId);
		b.setBfile(uBfile);	
		int result = bdao.insertOne(b);
		if(result!=1){
	%>
		<script>
			alert("글쓰기실패. 다시시도해주세요");
			location.href="blist.jsp";
		</script>
	<% }else{ %>
		<script>
			alert("글쓰기성공");
			location.href="blist.jsp";
		</script>
	<% } %>
	
	</body>
</html>