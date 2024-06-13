package j0613;

public class C0613_04 {

	public static void main(String[] args) {
		// 같은 패키지 내에서 호출할 경우 
		// 1. 객체 생성
		Parent p1 = new Parent();  // public
		Parent p2 = new Parent(10,20); // default
		Parent p3 = new Parent(1,2,3,4); // protected 
		
		// 2. 객체변수 호출 
		System.out.println(p3.n1);
		System.out.println(p3.n2);
		System.out.println(p3.n3);
	//	System.out.println(p3.n4); // private 한 필드는 오류
		
		// 3. 객체 메서드 호출 
		p3.methodA(); // public 
		p3.methodB(); // protected
		p3.methodC(); // default 
		
			
		// 상속을 받은 클래스 - 같은 패키지 내에 존재함 
		ChildA c = new ChildA(); 
		c.n2 = 50; // protected
		c.n3 = 50; // default; 
		c.method();
		/*
		 n1 : 9000
		 this.n1 : 100
		 super.n1 : 10
		 */
		

	}

}
