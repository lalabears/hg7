package com.java.www;

public class Member {
	private String memId;
	private String memName;
	public Member() {}
	public Member(String memId, String memName) {
		this.memId = memId; this.memName=memName;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}

	
}
