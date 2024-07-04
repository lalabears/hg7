package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/S01")
public class S01 extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //한글설정
		// servlet에서 html오픈할때.
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		// login.jsp form에서 넘어온 값들 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("id: "+id+", pw: "+pw);
		// servlet에서는 session객체를 생성해야지 사용할 수 있다
		HttpSession session = request.getSession();
		if(id.equals("aaa") && pw.equals("1111")) {
			session.setAttribute("sessionId", id);
			session.setAttribute("sessionNicName","홍시");
			session.setAttribute("sessionName", "홍길동");
			response.sendRedirect("jsp_main.jsp");
		}else {
			writer.println("<script>");
			writer.println("alert('아이디또는패스워드가일치하지않습니다');");
			writer.println("location.href='jsp_login.jsp';");
			writer.println("</script>");
		}
		writer.close();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet called");
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost called");
		doAction(request, response);
	}

}
