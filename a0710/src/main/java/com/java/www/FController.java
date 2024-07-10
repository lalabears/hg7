package com.java.www;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class FController extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//링크로 연결된 파일이름 알아내기 
		String uri= request.getRequestURI();
		String upath = request.getContextPath();
		String fileName = uri.substring(upath.length());
		//확인용
		System.out.println(uri);
		System.out.println(upath);
		System.out.println("컨트롤러에서 확인한 파일주소 : "+fileName);
		// 이동할 주소 
		String url ="";
		if(fileName.equals("/login.do")) {
			url = "DoLogin";
		}else if(fileName.equals("/doList.do")) {
			url = "DoList";
		}else if(fileName.equals("/doWrite.do")) {
			url = "domwrite.jsp";
		}
			
		RequestDispatcher rd =request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("fc-doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("fc-doPost");
		doAction(request, response);
	}

}
