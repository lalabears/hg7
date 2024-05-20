package j0520;

public class C0520_03 {

	public static void main(String[] args) {
		// 논리형 . 참/ 거짓만 들어갈 수 있다. 
		boolean temp1 = true; // 선언과 동시에 초기화 
		boolean temp2; // 선언 
		// 선언 후 값 대입 
		temp2 = false ; 
		System.out.println(temp1);
		System.out.println(temp2);
		// 정수형 
		// byte, short, int, long (메모리의 효율성 때문에 다양한 크기)
		// = (대입연산자)를 중심으로 양쪽 자료형이 같아야함. 
		// 크기가 작은 자료형을 큰 자료형에 대입하면 컴파일러가 자동으로 타입변환
		
		byte num1 = 1; 
		byte num2 = 127 ;  // byte는 -128 ~ 127 이기때문에 127이상오류
		
		short num3 = 11 ; 
		short num4 = 32767; // -32768 ~ 32767 까지만 입력가능
		
		int num5 = 13; 
		int num6 = 2147483647;  // 약21억까지 넣을 수 있음(2147483648부터오류)
		// 약 900경까지 입력가능
		// long타입의 경우 접미사 l이나 L을 붙여줘야함. 
		long num7 = 15 ; // int < long 
		long num8 = 2147483648L; // long은 접미사를 붙여라(l or L)
		
		// 실수형
		// float : 정밀도는 소수점 7자리 
		// double : 정밀도는 소수점 15자리 정도 
		
		// float은 접미사 f F를 붙여서 사용해야함. 
		float num9 = 10.987654321f; 
		float num10 = 987.65432100000F;
		System.out.println(num9);
		System.out.println(num10);
		// double 접미사 d D를 붙여 사용하나 생략이 가능함. 
		double num11 = 10.987654321d; 
		double num12 = 987.65432100000;
		System.out.println(num11);
		System.out.println(num12);
		
		// 문자형 : 작은 따옴표 안에 표기한다. 
		char ch1 = ' ' ;  // '' 사이에 공백 없이는 사용할 수 없음
		// char ch2 = "a" ; // 작은따옴표만 사용이 가능
		char ch2 = 'a' ; // 작은따옴표만 사용이 가능
	    // char ch3 = 'ab' ; // 한글자만 가능(두개이상 넣을 수 없음)
		char ch4 = '\n';  // \n, \t 등 사용 가능
		
		char ch5 = 'A' ; 
		// ch5 라는 공간에 A라는 문자가 들어간 것처럼 보이지만
		// 메모리는 문자를 기록할 수 없다. (1,0으로 이루어진 이진수만 저장함)
		// 모든 문자는 유니코드로 바꾸어서 저장됨. 
		// char에 정수값을 입력해도 같은 결과값을 얻을 수 있음. 
		
		char a1 = 'A';
		System.out.println(a1); // 'A' 가 출력됨. 
		char a2 = 65; 
		System.out.println(a2); // 'A' 가 출력됨. 
		char a3 = 0b1000001; // 0b는 이진수를 의미함. 
		System.out.println(a3); // 'A' 가 출력됨.
		char a4 = 00101; // 8진수 00을 붙여주면 8진수를 의미함. 
		System.out.println(a4); // 'A' 가 출력됨.
		char a5 = 0x0041 ; // 0x는 16진수 
		System.out.println(a5);  // 'A' 가 출력됨.
		// 문자열 
		String str1 = new String("abc") ; // 원래 사용하는방법. 생성자를 사용
		String str2 = "abc"; // 예외적으로 기본형타입으로 선언하게 해줌. 
		char str3 = ' ';
		String str4 =""; // 빈 공백없이 사용이 가능하다. 
		System.out.println(str2);
		System.out.println(str4); // 빈공백이 출력
		// 자료형 > 값 인 경우 : 오류없이 사용할 수 있다. 
		int ch = 'a';       // int > char 
		System.out.println(ch);  // 'a' > 97
		long l = 123;       // long > int 
		double d = 3.14f;   // double > float 
		
	/*	// 자료형 < 값인 경우 : error
		int n = 2147483648L;  // int의 범위를 벗어나 error
		long l2 = 3.14f ;  // long  <  float
		float f = 1.123d;  // float  < double 
	*/
		
		// byte, short에 int 값 저장이 가능하나 범위를 조심해야함. 
		byte b = 100 ; // byte : -128 - 127
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
