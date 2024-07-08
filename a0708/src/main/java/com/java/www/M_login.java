package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/M_login")
public class M_login extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 한글깨짐없음
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		// db연결을 위해서 memberdao 객체선억 
		MemberDao mdao = new MemberDao();
		MemberDto mdto = mdao.loginCheck(id,pw);
		String msg ="";
		String url ="";
		// 세션 선언 
		HttpSession session = request.getSession();
		if(mdto == null ) {  // db에 자료가 없다면.. 
			msg = "아이디 또는 패스워드가 일치하지 않습니다.다시 로그인해주세요";
			url = "m_login.jsp";
		}else {
			msg = "로그인 되었습니다";
			url = "m_main.jsp";
			// 세션에 자료 넣기 
			session.setAttribute("session_id", mdto.getId());
			session.setAttribute("session_name", mdto.getName());
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>로그인확인</title></head>");
		writer.println("<body>");
		writer.println("<script>");
		writer.println("alert('"+msg+"');");
		writer.println("location.href='"+url+"';");
		writer.println("</script>");
		writer.println("</body>");
		writer.println("</html>");
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form태그에서 get방식일때. url을 직접 입력해서 호출받았을때 
		System.out.println("M_login_doGet 호출");
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form태그에서 post방식일때 
		System.out.println("M_login_doPost 호출");
		doAction(request, response);
		
	}

}
