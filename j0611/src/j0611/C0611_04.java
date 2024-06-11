package j0611;
public class C0611_04 {
	public static void main(String[] args) {
		/* 상속 : 
		   기존의 클래스로 새로운 클래스를 작성( 코드의 재사용 )
		   두 클래스를 부모 - 자식 관계를 맺어주는 것 
		   class 부모클래스 { 
		   }
		   class 자식클래스 extends 부모클래스 {
		   }
		   
		   자식클래스- 부모클래스는 상속관계에 있다고 말함. 
		   자손은 조상의 모든 멤버들을 상속받는다 (생성자, 초기화블럭제외)
		   자손의 멤버 개수는 조상보다 적을 수 는 없다 (같거나 많음) 
		*/
		Parent mom = new Parent();
		mom.name = "금자"; 
		mom.age = 40; 
		mom.printInfo(); // 이름:금자나이:40
		
		Child tom = new Child(); 
		tom.name = "탐";
		tom.age = 10; 
		tom.printInfo();
		tom.school = "00초";
		tom.printSchool();
		
		Child2 a = new Child2();
		a.name = "짱구";
		a.age = 6;
		a.printInfo(); //이름 : 짱구, 나이 : 6
		
		Parent p1 = new Parent();
		p1.printInfo();
		//이름 : 홍길동, 나이 : 40
		Parent p2 = new Parent("미선", 36);
		p2.printInfo();
		//이름 : 미선, 나이 : 36
		
		Child2 c1 = new Child2();
		c1.printInfo();
		
		// 생성자는 상속되지 않는다
		// Child2 c2 = new Child2("짱아",2);
		
		
		Point p = new Point();
		System.out.println(p.x);  // 0
		System.out.println(p.y);  // 0
		
		Point p3 = new Point(10,11);
		System.out.println(p3.x);  // 10
		System.out.println(p3.y);  // 11
		
		Point3D p4 = new Point3D();
		p4.x = 1;
		p4.y = 2; 
		p4.z = 3;
		
		
		

	}

}
