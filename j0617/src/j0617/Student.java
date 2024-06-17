package j0617;
//     class 자식클래스 extends 부모클래스 
// 부모클래스가 같은 패키지내에 있으면 import필요없음.
//  패키지명.클래스명에서 같은패키지내라면 패키지명은 생략가능 
public class Student extends Person {
	// grade  , group, stuNum, record
	private int grade;
	private int group; 
	private int stuNum; 
	private int record; 
	
	//해당 클래스에 이름, 나이를 초기화하는 생성자
	Student(String name, int age){
		super(name,age);// 부모클래스의 생성자 호출 
	}
	// 해당 클래스에 이름, 나이 정보를 출력하는 메소드
	// 메서드 오버라이딩으로 추가해 줄 수 있다 
	public void printInfo() {
		System.out.println("이름: "+name+" , 나이 : "+age+"살");
		System.out.println("학년: "+grade+" , 반 : "+group);
	}
	// 메서드오버라이딩 부모: Person 
	public String toString() {
		return "이름: "+name+" , 나이 : "+age+"살"	
				+" 학년: "+grade+" , 반 : "+group ;
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}
	
	
}
