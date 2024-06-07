package j0607;

import java.util.Scanner;

public class C0607_01 {
	public static void main(String[] args) {
		/*
		객체 선언 및 생성 => 클래스를 이용해야함. (클래스는 객체의 설계도. 어머니)
		클래스에 의해서 객체를 생성하게되면. 클래스에 선언된 변수들과 메서드를 
		각각의 객체에 사용할 수 있도록 공간을 생성해줌. 
		
		자바에서는 객체를 만들기 위해 new연산자를 사용 
		즉. new 연산자를 사용할때까지는 객체는 존재하지 않는다 !
		1. 클래스명 변수명 = new 생성자();
		2. 클래스명 변수명; 
		   변수명 = new 생성자(); 
		
		클래스 : 붕어빵틀. 어머니. 설계도
		객체  :  붕어빵.  자손.   제품
		*/
		// 객체 선언과 생성을 동시에 
		Point p = new Point(); 
    // 클래스명 변수명 = new 생성자();
		// 객체 선언
		Point p1 ;
		// 객체 생성 
		p1 = new Point();  
		// p라는 객체에 객체변수인 x에 10을 넣는다 
		p.x = 10 ; 
		p.y = 20 ; 
		System.out.println(p); // p라는 객체의 주소값 
		p.printXY(); // p객체의 인스턴스 함수 printXY()호출
		
		p1.printXY();
		
		Point p2 = new Point(10); 
		p2.printXY();
		
		Point p3 = new Point(5,4);
		p3.printXY();
		
		Point p4 = new Point(1,2,3); 
		p4.printXY();
		
	//	Scanner scan = new Scanner(System.in);
		
		Clock c1 = new Clock();
		// 10시
		Clock c2 = new Clock(10);
		// 10시 20분
		Clock c3 = new Clock(10,20);
		// 10시 20분 30.56초 
		Clock c4 = new Clock(10,20,30.56);
		
		c1.printTime();
		c2.printTime();
		c3.printTime();
		c4.printTime();
		
		// double > float > long > int > 나머지
		Number num = new Number(); 
	// 자료형 반환값 = 참조변수명.메서드명(인수1,인수2); 	
		int r1 = num.add(10, 20); // 메서드호출
		// 10, 20은 숫자지만 매개변수 x, y의 위치에 전달되어
		// 각 각 x, y 가 됨.  
		// add 가돌려주는 값은 30이 되고 r1에 저장됨. 
		// 이때 r1은 add의 반환형인 int형이거나 
		// int를 담을 수 있는 형태여야함
		
		// 자바는 인수로 기본 자료형을 사용하면 call by value
		
		System.out.println(r1);  // 30.0 
		
		int a = 10, b = 20 ; 
		System.out.printf("a: %d b: %d\n",a,b);
		System.out.printf("a: %d b: %d\n",a,b);
		num.swap(a, b);
		System.out.printf("a: %d b: %d\n",a,b);
		/*
		a: 10 b: 20
		메서드내: x: 20 y: 10
		a: 10 b: 20
		 */
		num.x = 10; 
		num.y = 20 ; 
		System.out.printf("호출전: x: %d y: %d\n",num.x,num.y);
		num.swap();
		System.out.printf("호출후: x: %d y: %d\n",num.x,num.y);
		/* 호출전: x: 10 y: 20
		   메서드내: x: 20 y: 10
		   호출후: x: 20 y: 10     */
		
		
		
		Number n = new Number(); 
		n.x = 5; 
		n.y = 7;
		System.out.println(n); // 객체의 주소값
		System.out.printf("호출전: x: %d y: %d\n",n.x,n.y);
		Number.swap(n);
	// 클래스 메서드 : 클래스명.메서드명()으로 호출 	
		System.out.println(n); // 객체의 주소값
		System.out.printf("호출후: x: %d y: %d\n",n.x,n.y);
		/*
		j0607.Number@7d4991ad
		호출전: x: 5 y: 7
		j0607.Number@7d4991ad
		메서드내: x: 7 y: 5
		호출후: x: 7 y: 5
		*/
		
		// 복사 
		int abc = 10 ; 
		int def = abc ; // 기본변수는 값을 복사 
		abc = 20 ; 
		System.out.println(abc); // 20
		System.out.println(def); // 10 
		
		int[] m = {10};
		int[] h = m; // 참조변수는 주소를 복사. 
		m[0] = 20 ; 
		System.out.println(m[0]);  // 20
		System.out.println(h[0]);  // 20
		
		//////////////////////////////
		Number n1 = new Number();
		a = 9;
		b = 7; 
		int r2 = n1.max(a,b);
		System.out.println(r2); // 9 
		double c =22.14, d = 22.5;
		double r3 = n1.max(c,d); 
		System.out.println(r3); // 22.5
		
		int r4 = n1.add(a,b);
		double r5 = n1.add(c, d);
		System.out.println(r4);
		System.out.println(r5);
		
		

	}

}
