package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/M_write")
public class M_write extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 한글깨짐없음
		String id = request.getParameter("uid");
		String pw = request.getParameter("upw");
		String name = request.getParameter("uname");
		String phone = request.getParameter("phone");
		// 라디오타입은 하나만 선택할 수 있기때문에 getParameter로 가져온다. 
		String gender = request.getParameter("gender");
		// 체크박스는 한번에 여러개가 선택이 가능하기때문에 배열로 저장함. 
		String[] hbs = request.getParameterValues("hobby");
		String hobby="";
		for(int i = 0 ; i < hbs.length; i++ ) {
			if(i==0) hobby+=hbs[i];
			else hobby+= ","+hbs[i];
		}
		//아이디, 비번, 이름, 전화번호, 성별, 취미 다 가져와서 출력해보기 
		//System.out.println(id);
		String msg="", url="";
		// m_write.jsp로 부터 가져온 정보들로 멤버객체 생성하기
		MemberDto mdto = new MemberDto(id,pw,name,phone,gender,hobby);
		// 메서드를 위해서  mdao객체 생성 
		MemberDao mdao = new MemberDao();
		int result = mdao.insertMember(mdto);
		if(result !=1) {
			msg="회원정보가 저장되지 않았습니다. 다시입력해주세요";
			url = "m_write.jsp";
		}else {
			msg="회원정보가 저장되었습니다";
			url = "m_main.jsp";
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>회원가입확인</title></head>");
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
		System.out.println("M_write_doGet 호출");
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form태그에서 post방식일때 
		System.out.println("M_write_doPost 호출");
		doAction(request, response);
		
	}

}
