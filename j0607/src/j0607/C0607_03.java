package j0607;
public class C0607_03 {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id = "사장";
		m1.name = "홍길동";
		m1.age = 40;
		m1.printAttr();
		
		Member m2 = new Member("부장","강백호",35, m1); 
		//                                      manager
		System.out.println(m2.name); // 강백호
		m2.changeName("서태웅"); 
		System.out.println(m2.name); // 서태웅 

		Member m3 = new Member("과장","채수연",32,m2);
		// m3의 매니저를 m1으로 바꾸는 메서드 
		System.out.println(m3.manager.name);
		m3.changeManager(m1);
		System.out.println(m3.manager.name);
		
		// m3의 정보를 복사하는 생성자를 만들어보세요 
		Member m4 = new Member(m3);
		m4.printAttr();
		// 과장채수연32j0607.Member@15db9742
		
		
		
		////////////////////////////////////////
	/*	
		Circle 이라는 클래스. 
		메서드 : 
		1. area : 넓이를 구함      3.14*(반지름)*(반지름)
		2. size : 둘레의길이를 구함  2*3.14*(반지름)
		3. 반지름을 1 증가하는 메서드. 
		
		Circle c = new Circle();
		c.area();
		c.area(3);
		c.area(5.5);
		c.size();
		c.size(4);
		c.size(9.1);
		Circle c1 = new Circle(3); // 3의 반지름을 가지는 원 */
		
		
		Circle c = new Circle();
		c.radius = 10 ; 
		System.out.println(c.area()); // 314.0
		System.out.println(c.area(3)); //28.26 
		System.out.println(c.area(5.5)); // 94.985
		System.out.println(c.size()); // 62.800
		System.out.println(c.size(4)); // 25.12
		System.out.println(c.size(9.1));// 57.148
		
		
		Circle c1 = new Circle(3);
		System.out.println(c1.area()); // 3*3*3.14 = 28.26
		c1.increR(); // 반지름 1 증가 
		System.out.println(c1.area()); // 4*4*3.14 =50.24
		
		
		
		
		
		
		
		

	}

}
