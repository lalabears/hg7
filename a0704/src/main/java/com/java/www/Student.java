package com.java.www;
public class Student {
	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math; 
	private int total;
	private double avg;
	//생성자 :public 으로 
	public Student() {}
	public Student(int stuNo, String name, int kor, int math, int eng) {
		this.stuNo = stuNo; this.name=name;
		this.kor = kor; this.math = math; this.eng=eng;
		this.total = kor+eng+math; this.avg = total/3.0;
	}
	// setter & getter :젠체 다 - 
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
}
