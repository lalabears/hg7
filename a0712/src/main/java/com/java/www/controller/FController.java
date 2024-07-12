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
import com.java.www.service.MLoginService;
import com.java.www.service.MService;
import com.java.www.service.MViewService;

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
		case "/login.do":   // 로그인 화면 열기
			url ="login.jsp";
			break;
		case "/dologin.do":  // 로그인 정보로 db에서 자료있나 확인
			mservice = new MLoginService();
			mservice.execute(request, response);
			url ="doLogin.jsp";
			break;
		case "/join.do":  // 회원가입 창 열기
			url ="join.jsp";
			break;
		case "/dojoin.do": //회원가입 후 값 db에 넣기
			mservice = new MJoinService();
			mservice.execute(request, response);
			url ="doJoin.jsp";
			break;
		case "/modiMem.do":  // 회원정보를 가져와서 보여주는 화면
			mservice = new MViewService();
			mservice.execute(request, response);
			url ="modiMem.jsp";
			break;
//		case "/domodiMem.do":  // db를 업데이트하는 부분
//			mservice = new MUpdateService();
//			mservice.execute(request, response);
//			url ="domodiMem.jsp";
//			break;
			
			
			
			
			
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
