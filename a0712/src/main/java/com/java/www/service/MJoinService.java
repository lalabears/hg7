package com.java.www.service;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.MemberDao;
import com.java.www.dto.Member;

public class MJoinService implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 이름, 아이디, 비밀번호, 메일주소, 전화번호
		// 우편번호 주소1 주소2, 전화번호들 생년월일 , 성별 전체 다 가져와서
		System.out.println("회원가입을위한서비스"); //출력하기 
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw1");
		String mail_id = request.getParameter("mail_id");
		String mail_tail = request.getParameter("mail_tail");
		String postal = request.getParameter("postal");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String f_tell = request.getParameter("f_tell");
		String m_tell = request.getParameter("m_tell");
		String l_tell = request.getParameter("l_tell");
		String birth_year = request.getParameter("birth_year");
		String birth_month = request.getParameter("birth_month");
		String birth_day = request.getParameter("birth_day");
		String gender = request.getParameter("gender");
		
		String email = mail_id+"@"+mail_tail;
		String addr = postal+","+address1+" "+address2;
		String phone = f_tell+"-"+m_tell+"-"+l_tell;
		String bday= birth_year+"-"+birth_month+"-"+birth_day+" 0:0:0";
		// string "YYYY-MM-DD mm:hh:ss"
		Timestamp birth = Timestamp.valueOf(bday);
//		System.out.println(email);
//		System.out.println(addr);
//		System.out.println(birth_year);

		
		// Member 객체 생성하기 
		MemberDao mdao = new MemberDao();
		Member member = new Member(name,id, pw,email, addr,phone, gender,birth); 
		int result = mdao.insertOne(member);
		
		request.setAttribute("result", result);
		
		
		
	}

}
