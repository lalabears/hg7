package com.java.www.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.service.BDeleteService;
import com.java.www.service.BEditService;
import com.java.www.service.BListService;
import com.java.www.service.BService;
import com.java.www.service.BViewService;
import com.java.www.service.BWriteService;
import com.java.www.service.MService;

@WebServlet("*.do")
public class FController extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FController");
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI(); 
		String cPath = request.getContextPath();
		String fileName = uri.substring(cPath.length());
		String url="";
		BService bservice = null;
		MService mservice = null; 
		System.out.println("fileName"+fileName);
		switch(fileName) {
		case "/main.do":  //메인으로.. 
			url="main.jsp";
			break;
		case "/list.do": // 게시판으로..
			bservice = new BListService();
			bservice.execute(request, response);
			url = "list.jsp";
			break;
		case "/view.do": // 글 하나보기
			bservice = new BViewService();
			bservice.execute(request, response);
			url = "view.jsp";
			break;
		case "/delete.do": // 글 하나 삭제하기
			bservice = new BDeleteService();
			bservice.execute(request, response);
			url = "doDelete.jsp";
			break;
		case "/write.do": // 글 쓰기창 
			url = "write.jsp";
			break;
		case "/dowrite.do": // 글 하나 추가하기
			bservice = new BWriteService();
			bservice.execute(request, response);
			url = "doWrite.jsp";
			break;
		case "/edit.do": // 글 수정창
			bservice = new BViewService();
			bservice.execute(request, response);
			url = "edit.jsp";
			break;
		case "/doedit.do": // 글 수정한 내용 데이터베이스에 반영하기
			bservice = new BEditService();
			bservice.execute(request, response);
			url = "doEdit.jsp";
			break;
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		
		
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

}
