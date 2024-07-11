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
import com.java.www.service.MJoinService;
import com.java.www.service.MListService;
import com.java.www.service.MService;
@WebServlet("*.do")
public class FController extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("FController Action");
		// 파일이름 찾기 
		String uri = request.getRequestURI(); // /a0711/join.do
		String cPath= request.getContextPath(); // /a0711
		String fileName = uri.substring(cPath.length()); 
		System.out.println("파일이름 : "+ fileName);
		String url = "";
		
		BService bservice = null;
		MService mservice = null; 
		switch(fileName){
		
		case "/meberAll.do":
			mservice = new MListService(); // 다형성 
			mservice.execute(request, response);
			url = "mlist.jsp";
			break;
		
			
		// 메인화면
		case "/index.do":
			response.sendRedirect("index.jsp");
			break;
		// 로그인화면 
		case "/login.do":
			url ="login.jsp";
			break;
		// 게시판 화면
		case "/board.do":
			bservice = new BListService(); // 다형성 
			bservice.execute(request, response);
			url = "blist.jsp";
			break;
		// 게시글1개 화면
		case "/view.do":
			bservice = new BViewService(); // 다형성 
			bservice.execute(request, response);
			url = "bview.jsp";
			break;
		// 글쓰기 화면
		case "/write.do":
			url = "bwrite.jsp";
			break;
		// 글쓰기 등록
		case "/dowrite.do":
			bservice = new BWriteService(); // 다형성 
			bservice.execute(request, response);
			url = "dowrite.jsp";
			break;
		// 글 한개 삭제 
		case "/delete.do":
			bservice = new BDeleteService(); // 다형성 
			bservice.execute(request, response);
			url = "doDel.jsp";
			break;
		// 글 수정 화면
		case "/modi.do":
			bservice = new BViewService(); // 다형성 
			bservice.execute(request, response);
			url = "bmodi.jsp";
			break;
		// 글 수정 등록
		case "/edit.do":
			bservice = new BEditService(); // 다형성 
			bservice.execute(request, response);
			url = "doModi.jsp";
			break;
		// 회원가입창 그대로 보여주는 화면
		case "/join.do":
			url = "join.jsp";
			break;
		// 실제로 저장하기위한 (db연결)
		case "/dojoin.do":
			mservice = new MJoinService(); // 다형성 
			mservice.execute(request, response);
			url = "doJoin.jsp";
			break;
		case "/logout.do":
			url ="logout.jsp";
			break;
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FC- doGet");
		doAction(request, response);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FC- doPost");
		doAction(request, response);	
	}

}
