package j0605;

public class Data {
	// class 내 사용되는 전역변수 
	// 인스턴스 변수 iv 
	int x; 
	// 클래스 변수 cv 
	static int y = 10;
	/*
	   리턴타입  메서드명  ( 매개변수1,.. 매개변수n) {
	   	      코드 
	   	      return문;
	   }
	   
	   메서드의 종료 : {} 블럭이 끝나거나 
	                return;을 만났을때. 
	                
	   반환값이 없는경우 : 리턴타입 void         리턴문 return; 혹은생략
	   반환값이 있는경우 : 리턴타입 반환값과같은타입 리턴문 return 반환값; 
	*/
	// 반환값없고, 매개변수 없는 메서드
	void plusOne() {
		x++; 
	}
	// 반환값 있고 매개변수 있는 메서드
	int plusTwo(int x) {
		return x+2; 
	}
	// 매개변수가 참조형일때
	void plusThree(int[] arr) {
		System.out.println("plus3호출");
		System.out.println(arr);
		for(int i = 0 ; i <arr.length ; i++) {
			arr[i] = arr[i]+3;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// 인스턴스메서드 
	void myFunc1(int n) {
		// 지역변수는 메서드안에 위치하며 메서드 종료시 사라짐. 
		int x = 10 ; // 지역변수 myFunc1에서만 사용되는변수
		System.out.println("myFunc1 호출");
		System.out.println(n+x);
	}
	// 클래스메서드 - 인스턴스 변수를 사용하지 않는 메서드에 static을 붙임.
	static void myFunc2(int n) {
		System.out.println("myFunc2 호출");
		// 클래스변수는 사용할 수 있다.
		System.out.println(n+y);
		// 인스턴스변수를 사용할 수 없다
		// System.out.println(n+x);
	}
	
	
	
} // data 
