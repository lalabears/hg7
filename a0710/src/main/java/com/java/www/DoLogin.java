package com.java.www;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//아이디 패스워드 넘겨받기 . 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//mdao 선언하고 selectLogin(id,pw)호출 
		MemberDao mdao = new MemberDao();
		Member m = mdao.selectLogin(id, pw);
		HttpSession session = request.getSession();
		// 세션추가하기 
		// 성공하면 index.jsp로. 실패하면login.jsp sendredirect사용해서 단순하게 만들기 
		if(m!=null) {
			session.setAttribute("sessionId", m.getId());
			session.setAttribute("sessionName", m.getName());
			response.sendRedirect("index.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet-login");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost-login");
		doAction(request, response);
	
	}

}
