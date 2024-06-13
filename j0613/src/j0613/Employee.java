package j0613;

public class Employee {
	private int coNum; 
	private String name;
	private String dept; 
	private int salary; 
	public Employee() {}
	Employee(int coNum, String name, String dept){
		// 생성자는 매개변수로 전달 받은값으로 객체의 변수를 초기화시킴
		this.coNum = coNum;	this.name = name; this.dept = dept;
	}
	void setSalary(int sal) {
		this.salary = sal; 
	}
	int getSalary() {
		return this.salary;
	}
	String getName() {
		return this.name;
	}
	int getMonth() {
		return this.salary/12;
	}
}
