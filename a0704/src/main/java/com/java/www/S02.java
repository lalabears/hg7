package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/S02")
public class S02 extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // post방식의 한글깨짐방지 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// 세션만들기 
		HttpSession session = request.getSession();
		// 출력을 위해서 .. 
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		// db - 에서할부분 
		if(id.equals("admin") && pw.equals("1111")) {
			session.setAttribute("sessionId", id);
			session.setAttribute("sessionNicName", "관리자");
			session.setAttribute("sessionName", "홍길동");
			response.sendRedirect("main.jsp");
		}else {
			writer.println("<script>");
			writer.println("alert('아이디또는 비밀번호가잘못입력되었습니다');");
			writer.println("location.href='login.jsp'");
			writer.println("</script>");
		}
		writer.close();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request, response);
	}
}
