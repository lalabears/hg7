package com.java.www;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/r2")
public class RequestPage2 extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BoardDao bdao = new BoardDao();
		Board b = bdao.selectOne(1);
		ArrayList<Board> list = bdao.selectAll();
		request.setAttribute("board", b);
		request.setAttribute("list", list);
		
		// request 전송
		RequestDispatcher rd = request.getRequestDispatcher("result5.jsp");
		rd.forward(request, response);
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet - r2");
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost - r2");
		doAction(request, response);
	}

}
