package com.java.www;
import java.sql.Timestamp;
public class Member {
	private String id;
	private String pw; 
	private String name;
	private String phone;
	private String gender;
	private String hobbys;
	private Timestamp jdate;  
	// 기본생성자 , 전체 다 있는 생성자, jdate없는 생성자
	public Member(){}
	public Member(String id, String pw, String name, String phone, String gender, String hobbys) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.hobbys = hobbys;
	}
	public Member(String id, String pw, String name, String phone, String gender, String hobbys, Timestamp jdate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.hobbys = hobbys;
		this.jdate = jdate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbys() {
		return hobbys;
	}
	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}
	public Timestamp getJdate() {
		return jdate;
	}
	public void setJdate(Timestamp jdate) {
		this.jdate = jdate;
	}
	
}
