package j0327;

public class C0327_02 {

	public static void main(String[] args) {
		
		// 변수 : 하나의 값을 저장할 수 있는 메모리 공간 
		// 변수 선언 : 값을 저장할 공간을 마련한다.
		// 선언방법 : 변수타입 변수이름;
		int number; // 정수형
		// 변수에 값 저장하기 
		number = 10; // = 는 대입을 의미한다 
		System.out.println(number);
		
		// 변수를 선언하면서 초기화 할 수 있다
		int n = 100; 
		
		// 콤마를 사용해서 두개이상 선언 할 수 있다. 
		int a = 1, b = 2, c = 3; 
		
		System.out.println(11+2);
		System.out.println(11-2);
		System.out.println(11*2);
		System.out.println(11/2);
		
		int d = 11, e = 2; 
		System.out.println(d+e);
		System.out.println(d-e);
		System.out.println(d*e);
		System.out.println(d/e);
		
		
		// 변수의 타입 :
		// 변수의 타입과 저장할 값의 타입이 일치해야한다.
		// 즉 변수의 타입은 저장할 값의 타입에 의해 결정된다. 
		
		int n1 = 10; // int : 정수형 (소수점없는 숫자)
		// int n1 = 10.3;일경우에는 타입 불일치로 인한 오류 
		char ch = '가'; // 문자형 문자1개 작은따옴표로 표현
		double pi = 3.14; // 실수형(즉 소수점있는 숫자)
		
		// 변수 : 하나의 값을 저장하기 위한공간 
		// 상수 : 한번만 값을 저장가능한 변수 
		// 리터럴(상수) : 그 자체로 값을 의미함 
		
		// 변수 
		int score = 100; 
		//  변수   = 리터럴 
		System.out.println(score);
		
		score = score + 200; // 300
		score = score + 1; //
		score = 100000; 
		System.out.println(score);
		
		// 상수 : 보통 변수명을 대문자로 사용함
		// 상수의 값은 변경할 수 없음
		final int MAX = 100; 
		//        상수 = 리터럴 
		// MAX = 200; error 값 변경 불가  
		
		System.out.println(MAX);
		System.out.println(MAX+10);
		
		
		
		

	}

}
