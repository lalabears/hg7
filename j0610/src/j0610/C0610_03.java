package j0610;

import java.util.Arrays;

public class C0610_03 {
	// 멤버변수 
	int x;   // 자동으로 0 
	int y = x;   //  y = 0 
	char ch; 
	String str; 
	public static void main(String[] args) {
		// 객체 생성 - 멤버 변수는 객체 선언 후 사용할 수 있다 
		C0610_03 c = new C0610_03();
		System.out.println(c.x);   // 0
		System.out.println(c.y);   // 0
		System.out.println(c.ch);  // ' '
		System.out.println(c.str); // null
		// 지역변수 
		int a = 10 ; // 사용전에 초기화 없으면 오류 
		int b = a;  
		System.out.println(a);
		System.out.println(b);
		/* 변수의 초기화 : 변수를 선언하고 처음 값을 저장하는 것
		 객체의 멤버변수(iv,cv)의 경우 초기화하지 않아도 자동적으로 
		 변수 자료형의 기본값으로 초기화가 이루어짐 
		 지역변수 : 사용하기전에 반드시 초기화해야함.  
		*/
		System.out.println("---- 변수의 초기화 ----");
		
		Num n = new Num(); 
		System.out.println(n.x);  // 11  // 10
		System.out.println(n.y);  // 0   // 20
		System.out.println(n.z);  // 11  // 30 
		System.out.println(Arrays.toString(n.arr));
		
		System.out.println(Num.pi);
		System.out.println(Arrays.toString(Num.arr2));
		
		/*  초기화 순서 
		iv : 기본 초기화 (0)  > 명시적초기화 (=)  > 초기화 블럭을 통한 초기화
		      >  생성자를 통한 초기화  
		cv : 기본 초기화 (0)  > 명시적초기화 (=)  > 초기화 블럭을 통한 초기화
	
		객체가 한번 생성되면 cv는 더이상 생성되지 않고
		iv객체만 초기화됨. 
		
		*/
		Product p1 = new Product();
		p1.pName = "led55";
		p1.price = 50;
		Product p2 = new Product("led60",100);
		Product p3 = new Product("led70",200);
		Product p4 = new Product("led75");
		Product p5 = new Product();
		p5.pName = "led100";
		p5.price = 400; 
		
		System.out.println("p1 번호 :" +p1.serialNo);
		System.out.println("p1 제품명 :" +p1.pName);
		System.out.println("p1 가격 :" +p1.price);
		System.out.println("p2 번호 :" +p2.serialNo);
		System.out.println("p2 제품명 :" +p2.pName);
		System.out.println("p2 가격 :" +p2.price);
		System.out.println("p3 번호 :" +p3.serialNo);
		System.out.println("p3 제품명 :" +p3.pName);
		System.out.println("p3 가격 :" +p3.price);
		System.out.println("p4 번호 :" +p4.serialNo);
		System.out.println("p4 제품명 :" +p4.pName);
		System.out.println("p4 가격 :" +p4.price);
		System.out.println("p5 번호 :" +p5.serialNo);
		System.out.println("p5 제품명 :" +p5.pName);
		System.out.println("p5 가격 :" +p5.price);
		
		
		
		
		
		
		

	}

}
