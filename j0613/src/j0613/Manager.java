package j0613;
//상속: class 자식클래스 extends 부모클래스
public class Manager extends Employee {
	// 상속받으면 부모클래스의변수를 가질 수 있다. 
	// 자식클래스 멤버 변수들
	private String rank; // 직책
	private int bonus; // 성과금

	// 생성자 
	Manager(){ super(); }
	Manager(int coNum, String name, String dept, String rank, int bouns){
		//this.coNum = coNum; > 부모변수가 private하기때문에 직접 접근이불가능
		super(coNum,name,dept);
		this.rank = rank;
		this.bonus = bouns; 
	}
	
	// 메서드의 오버라이드 
	void setSalary(int sal) {
		sal = sal + this.bonus;  // 6000+100> 6100
		super.setSalary(sal);
	}
	
}
