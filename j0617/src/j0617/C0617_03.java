package j0617;
public class C0617_03 {
	public static void main(String[] args) {
		// 사람의 정보가 있는 Person 클래스를 만들어서 
		// iv는 모두 protected  
		Person p = new Person(); 
		Person p1 = new Person("이순신", 50);
		// 해당클래스에 이름, 나이를 초기화하는 생성자를 만드세요 .
		// 해당클래스의 이름, 나이를 출력하는 메서드를 만드세요 
		
		// person class를 상속받은 student클래스도 만들어보세요 
		Student s = new Student("홍길동", 15);
		// 이름: 홍길동 , 나이 : 15살
		s.setGrade(1);  // private한 멤버변수는 setter를 통해서 설정할 수 있다 
		s.setGroup(2);
		s.printInfo() ; // 부모클래스에 있는메서드 오버라이딩 

		Employee e = new Employee("네이버",32,"QA","강백호","대리");
		e.printInfo();
		// 이름: 강백호, 나이: 32살, 회사: 네이버, 부서: QA, 직급: 대리 
	}

}
