package com.java.www;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S01")
public class S01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");  // 콘솔창에 보여줌. 
		// "S01?page=<%= i %>&keyword=search"
		int page = Integer.parseInt(request.getParameter("page"));
		String keyword = request.getParameter("keyword");
		System.out.println(page);  // 콘솔출력
		System.out.println(keyword); // 콘솔출력
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
