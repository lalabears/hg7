package j0612;
public class C0612_04 {
	public static void main(String[] args) {
/* 상속: 기존클래스에 기능을 추가하거나 재정의해서 새로운 클래스를 정의하는것
   상속을 사용하면 기존 정의된 클래스의 모든 필드와 메서드를 물려받아 새로운 클래스를
   생성 할 수 있음. 
   장점: 기존클래스 재활용 가능
        자식클래스 설계시, 부모클래스에 존재하면 작성하지 않아도됨
        클래스간 계층적 구조가 형성되므로 다형성의 토대가됨. 
   단점 : 부모클래스 변경 시 자식클래스 동작여부 예측이 힘듦. 
   		(부모클래스변경이 자식에 영향을끼침)
   		자식이 사용하는 기능을 부모클래스에서 제거할 수 없다
   		부모클래스 내용이 자식에게 무의미할수 있다.
   두개의 클래스의 관계가  -  IS-A 관계를 가지고 있다. 
   		학생은 사람이다  (Student    is a person)
   		개발자는 사람이다 (developer is a person)
   class 자식클래스 extends 부모클래스 {}  로 정의함. 
		
*/
		// 개발자 객체 선언
		// 클래스를 상속하면 모든멤버변수와 모든 메소드를 상속받는다
		Developer dev = new Developer(); 
		dev.name = "강백호"; // 부모클래스에 있는변수
		System.out.println(dev.name);  // 강백호
		// 강백호는 developer이기도하지만 person이기도함. 
		// 부모클래스에 있는 메서드 사용가능 
		dev.work();  // 일하기
		dev.sleep(); // 잠자기
		dev.eat(); 
		// 본인이 가지고있는 변수, 메서드를 사용할 수 있음 
		dev.mainLan = "JAVA";
		dev.writeCode(); // 월급만큼일하기
		System.out.println(dev.isFull());
		// student IS - A person 
		// 학생이면서 사람이다. 
		Student stu = new Student();
		stu.name  = "홍길동";
		stu.major = "computer";
		stu.writeCode(); // 밤새과제를합니다
		System.out.println(stu.isFull());
		
/* 클래스의 포함관계 
   상속과 유사하지만, 한 클래스가 다른 클래스의 객체를 포함하는 관계
   HAS-A 관계로 표현함. 
*/		
		Computer mac = new Computer("MacBook Pro");
		// mac - os: macbookpro, isbroken - false 
		
		Student1 s1 = new Student1("강백호","컴공",mac);
		// student1 클래스를 사용해서 학생 객체생성 
		// name:강백호 major:컴공 com:mac 
		
		s1.writeCode(); // MacBook Pro로 과제를 수행합니다. 
		mac.isBroken = true; 
		s1.writeCode(); // 과제를 할 수 없습니다
		
		Point p = new Point(); 
		p.x = 10; 
		p.y = 21; 
		System.out.println(p.x+", "+p.y); // 10, 21
		
		// 인스턴스변수를 3개 가지고 있는 클래스 Point2
		Point2 p2 = new Point2();
		p2.x = 1; p2.y =2;  p2.z = 3;
		
		// Point와 상속 관계
		Point3 p3 = new Point3();
		p3.z = 10; 
		p3.x = 1; // 부모에게 상속받은 iv 
		p3.y = 2; // 부모에게 상속받은 iv
		
		//Point4는 Point를 포함 
		Point4 p4 = new Point4();
		p4.p.x = 10; p4.p.y = 20 ; 
		p4.z = 30; 
		
		
		
	}

}
