package j0522;

public class C0522_02 {

	public static void main(String[] args) {
		// 변수 
		/* 기본 8개 .
		 논리형  boolean
		 문자형  char
		 정수형  byte short int long
		 실수형  float double 
		 +
		 문자열 String 
		 크기 :    double > float > long > int > 나머지들 
		*/
		// 기본형
		boolean power = true ; // true, false 만 저장할 수 있음 
		char c1 = ' '; // 작은따옴표, 사이에 공백이 있어야함. 
		char c2 = 'Y'; // 한글자만 들어올 수 있음
		char c3 = 65; 
		System.out.println(c3); // 'A'
		int n1 = 100; // 21억 이하만 가능 
		long n2 = 2000000000000L; // 접미사 l, L을 붙여야함. 
		float n3 = 8.123f;  // 접미사 f, F를 붙여야함.
		double n4 = 8.765;  // 접미사 d, D가 생략이 가능함. 
		// 문자열형
		String str = ""; // 큰 따옴표를사용. 빈공백없이 사용이가능함. 
		String str1 = "문자열을 입력";
		
		// 자동 형변환 ( 작은값을 큰 자료형에 담을때 자동형변환이됨) 
		double a1 = 6 ; 
		System.out.println(a1); // 6.0 
		double a2 = 5.15f ;
		System.out.println(a2);
		long a3 = 50000;
		System.out.println(a3);
		float a4 = 6L; 
		System.out.println(a4); // 6.0
		
		// 수동 형변환 :   (자료형)을 사용해서 형변환한다. 
		int a5 = (int)3.14; 
		System.out.println(a5);  // 3
		float a6 = (float)10.123456789012345d;
		System.out.println(a6);
		
		double a7 = 10.1234;
		long a8 = (long)a7; 
		System.out.println(a8);
		
		// 문자 > 숫자로 변경  :  -'0' 을 해주면된다. 
		char x = '2';      // 50
		int  y = x - '0';  //  50 - 48 => 2
		
		// 숫자 > 문자로 변경 
		char z =(char)( y + '0');
		System.out.println(z);
		
		// 숫자 > 문자열로 변경 : 앞이나 뒤에 ""를 더해주면된다. 
		String k = ""+ y ;   // "2"
		System.out.println(k);
		
		// 문자열 > 숫자로 변경 
		//1. parseint 사용
		int i = Integer.parseInt(k); 
		System.out.println( i - 10   );
		// 2. charAt으로 문자를 가져온 후 문자를 숫자로 변경 
		int j = k.charAt(0) - '0'; 
		//        '2'
		System.out.println( i - 10   );
		
		
		
		
		
		
		
		
		
	}

}
