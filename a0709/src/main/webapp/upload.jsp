<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>upload.jsp</title>
	</head>
	<body>
	<%
		String uploadPath="c:/upload";
		//String uploadPath= request.getRealPath("./fileFolder");
		int size = 10*1024*1024; //10mb 
		MultipartRequest multi= 
			new MultipartRequest(request,uploadPath,size,"utf-8",
					new DefaultFileRenamePolicy());
		String title = multi.getParameter("title");
		String fileName = multi.getFilesystemName("bfile");
	%>
		<h2>이름 : <%= title %></h2>
		<h2>파일명 : <%= fileName %></h2>
	
	</body>
</html>