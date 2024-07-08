package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/M_update")
public class M_update extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// id, phone, gender, hobby 가져오기  - write와 비슷함. 
		String id = request.getParameter("uid");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String[] hbs = request.getParameterValues("hobby");
		String hobby="";
		for(int i = 0 ; i <hbs.length; i++) {
			if(i==0) hobby += hbs[i];
			else hobby+=","+hbs[i];
		}
		
		MemberDao mdao = new MemberDao();
		int result = mdao.memberUpdate(id,phone,gender,hobby);
		String msg="", url="";
		if(result == 1) {//성공
			msg ="회원정보가 수정되었습니다";
			url ="m_view.jsp?id="+id;
		}else {
			//실패
			msg="회원정보수정이 실패하였습니다.";
			url ="m_view.jsp?id="+id;
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
		System.out.println("M_update_doGet");
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("M_update_doPost");
		doAction(request, response);
	}

}
