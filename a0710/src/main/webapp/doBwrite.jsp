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
		<title>doBwrite.jsp</title>
	</head>
	<body>
	<%
		// 내용 다 가져오기 btitle id bcontent bfile 가지고 와야함. 
		String uploadPath = "c:/upload"; 
		int size = 10*1024*1024; 
		MultipartRequest multi = new MultipartRequest(request, uploadPath, size,
			"utf-8", new DefaultFileRenamePolicy()	);
		String uBfile = multi.getFilesystemName("bfile");
		String uBtitle = multi.getParameter("btitle");
		String uBcontent = multi.getParameter("bcontent");
		String uId = multi.getParameter("id");
		/* out.print(uBfile+uBtitle+uBcontent+uId); */
		BoardDao bdao = new BoardDao();
		Board b = new Board();
		b.setBcontent(uBcontent);
		b.setBtitle(uBtitle);
		b.setBfile(uBfile);
		b.setId(uId);
		int result = bdao.insertOne(b);
		if( result != 1){
	%>
	<script type="text/javascript">
		alert("글쓰기 실패")
		location.href ="bwrite.jsp";
	</script>
	<% } else { %>
		<script type="text/javascript">
		alert("글쓰기 성공")
		location.href ="list.jsp";
	</script>
	<% } %>
	
	</body>
</html>