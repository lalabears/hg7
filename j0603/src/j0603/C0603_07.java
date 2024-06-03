package j0603;

public class C0603_07 {

	public static void main(String[] args) {
		/*  메서드 
		 반환형 메서드명 ( [매개변수1, 매개변수2, ....]  ) {
		 	선언문
		 	수행문
		 	[return 문]
		 }
		 - 반환형은 메서드를 연산한 결과 값을 메서드를 호출한 호출자에게 반환할때 사용하는 자료형으로 
		   int, float, int[], 객체 등이 될 수 있다.
		   반환값이 없을경우에는 void를 사용함. 
		 - 매개변수는 메서드를 호출할때 전달하거나 전달받는 자료로 상수, 변수, 수식, 배열, 객체 등 
		 - return문은 생략가능하며 return문 뒤 자료형은 반환형과 동일 
		
		 Return문 - return문 뒤의 자료형은 반환형과 동일함. 
		 메서드 수행이 끝나면 이 메서드를 호출한 곳에 작업 결과인 반환값을 돌려주는 기능을 수행 
		 return;   // 제어만 돌려주고 반환값이 없을때 사용
		 return 수식; // 제어와 반환값을 동시에 돌려줄때 사용
		 
		 void 
		 작업결과 반환값이 없는 경우에 사용. 
		 
		 호출: 
		 메서드명(실매개변수1, 실매개변수2,...)   // 반환값이 없는경우
		 변수 = 메서드명(실매개변수1, 실매개변수2, ...) 
		*/
		// a + b 의 값. 
		int a = 10 ; int b = 20 ; int result;
		result = a+b;
		System.out.println(result); // 10+20
		System.out.println(add(10,20));
		System.out.println(add(1,2));
		System.out.println(add(5,1));
		System.out.println(add(225,21));
		result = add(11,2); // 13
		System.out.println(result); 
		print();
		// 객체 생성 
		C0603_07 c1 = new C0603_07();
		System.out.println(c1.sub(10,5));
		int m = add(1,5);

	}// main
	static int add(int a , int b ) {
	//  반환형 메서드명	 (매개변수1, 매개변수2) 
    //     int : 반환형이 정수임을 나타냄. 밑에 return문의 자료형과 동일해야함
	//         add 는 메서드명이고 a, b는 매개변수.  
		int result = 0 ; //선언문
		result = a+b;    // 수행문
		return result;   // return 문 : result를 add를 호출한 메서드로 반환함. 
	} // add 
	static void print() {
		System.out.println("출력");   // 리턴값이 없는 메서드 
	//	return;
	}
	int sub(int a, int b) {
		int result = 0 ; 
		result = a - b; 
		return result;
	}// sub
}// class 
