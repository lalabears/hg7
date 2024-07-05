package com.java.www;

public class Member {
	// 클래스의 iv
	private String name;
	private String id;
	private String pw; 
	private String phone; 
	// 클래스의 생성자 
	public Member() {}
	public Member(String name, String id, String pw, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phone = phone;
	}
	// getter and setter 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
