package j0520;

public class C0520_06 {

	public static void main(String[] args) {
		// 형변환 
		// 논리형을 제외 기본자료형 7개는 서로 형변환을 할 수 있음. 
		// =(대입연산자) 중심으로 왼쪽 오른쪽 자료형을 일치시켜야하기때문에
		// 형변환이 필요할 때가 있음. 
		// 다만, 값을 저장할 수 있는 범위나 종류가 달라지므로 값이 변할 수 있다. 
		
		/* 기본형 8가지는 외우자
		 ( boolean, byte, short, int, long, float, double, char) 
		 논리형 : boolean - 1 바이트 
		 문자형 : char    - 2 바이트 
		 정수형 : byte (1바이트), short(2바이트), int(4바이트), long(8바이트)
		 실수형 : float (4바이트), double(8바이트)
		*/
		// 방법1. 자료형A  변수명 = (자료형A) 값 
		int v1 = (int)5.4; 
		System.out.println("5.4를 int로 형변환 한 값 :" + v1); 
		long v2 = (long)10; 
		System.out.println("정수10을 long으로 형변환 한 값 :" +v2); 
		float v3 = (float)7;
		System.out.println("정수7을 float로 형변환 한 값 :" +v3); 
		double v4 = (double)11.2; 
		System.out.println("11.2를 double로 형변환 한 값 :" +v4); 	
		
		float f = 1.234f; //소수점있음. 
		int i = (int)f; // 강제형변환 
		System.out.println("f: "+ f +"를 int로 형변환 : "+ i );
				
		int num = 10; 
		double d = num; 
		System.out.println(d); // 소수점이 붙어 있는 것을 확인할 수 있음
		
		// 방법2 - 정수나 실수일 경우 f, l을 붙여서 할 수 있다. 
		// long 변수명 = 값L;
		// float 변수명 = 값F;
		long v5 = 10L; 
		System.out.println(v5);
		long v6 = 21l; 
		System.out.println(v6);
		float v7 = 5f;
		System.out.println(v7);
		float v8 = 5.6F;
		System.out.println(v8);
		
		// String > double > float > long > int > char,short,byte
		
		// 자동 타입변환 
		float n1 = 7 ;   // int > float
		long n2 = 15;    // int > long
		double n3 = 3;   // int > double 
		System.out.println("n1 : " + n1 + " n2 : "+ n2 + " n3 : "+n3);
		// 수동 타입변환
		byte n4 =  (byte)127;   //  byte < int
		int n5 =   (int)3.5;    //  int < double
		float n6 = (float)7.5;  //  float < double 
		
		System.out.println("n4 : " + n4 + " n5 : "+ n5 + " n6 : "+n6);
		// n4 : 127 n5 : 3 n6 : 7.5

		// float는 소수점 8자리 까지만 정확하므로 자료 손실이 생길 수 있다. 
		double a1 = 7.000000009;
		System.out.println(a1);
		float a2 = (float)a1; 
		System.out.println(a2);
		
		
		// 기본 자료형간의 연산. 
		// 논리형을 제외하고 서로 연산이 가능함. 
		// int 보다 작은 자료형간 연산의 결과는 int로 나옴
		// 연산의 최소단위가 int 이다. 
		int b1 = 5 + 4 ; 
		System.out.println(b1);
		int b2 = 5 / 4 ; 
		System.out.println(b2);
		double b3 = 5.0/4.0;
		System.out.println(b3);
		
		byte b4 = 5; 
		byte b5 = 100; 
	//	byte b6 = b4 + b5;  // byte+byte는 int이기때문에 byte에 저장불가능
		int b7 = b4 + b5; 
		System.out.println(b7);
		byte b6 = (byte)(b4+b5); // 강제 형변환으로 저장할 수 있음 
		System.out.println(b6);
		
		// int b8 = 5 + 6.7; // 오류
		double b9 = 5 + 6.7; 
		System.out.println(b9);
		int b10 = 5 + (int)6.7;
		System.out.println(b10);
		
		// 문자 (숫자처럼생긴문자) , 숫자간 변환 
		// 문자  >  숫자   : - '0' 을 해주면 된다. 
		// 유니코드 표에서 '0' : 10진수로 48
		//              '1' : 10진수로 49 
		//           .. '9' : 10진수로 57 이다. 
		
		char c1 = '5'; 
		int c2 = c1 - '0' ; 
		//       53 -  48  = 5 
		char c3 = 53; 
		System.out.println(c1);  // 5
		System.out.println(c3);  // 5 
		
		// 숫자 > 문자 
		int i1 = 5 ;  // 숫자5 
		char i2 = (char)(i1+'0');
		System.out.println(i2);  // '5' 		
		// 문자열로 변환 
		// 앞이나 뒤에 "" 빈 문자열을 더해주면된다. 
		int i3 = 7; 
		String str1 = ""+i3; 
		String str2 = i3 +""; 
		
		// 해보세요   '0' : 48 
		char t1 = '9'; // 얘를 숫자 9로 바꿔보세요   57
		int t2 = t1 - '0' ; // 57-48
		System.out.println(t2); // 9 
		int t3 = 2;  // 얘를 문자 2로 바꿔보세요     50
		char t4 = (char)( t3 + '0');
		System.out.println(t4);  // '2' 가 출력됨. 
		
		String s1 = "5"; 
		String s2 = "3.14"; 
		
		int s3 = Integer.parseInt(s1);
		double s4 = Double.parseDouble(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		String s5 = "3"; 
		System.out.println(s5.charAt(0) -'0');
		
		String s6 = "123";
		char s7 = s6.charAt(0);
		System.out.println(s7);  // '1'
		char s8 = s6.charAt(1);
		System.out.println(s8);  // '2'
		char s9 = s6.charAt(2);
		System.out.println(s9);  // '3'
		
		// 진짜 숫자로 변경하기 위해서는 
		int s10 = s7 - '0';
		System.out.println(s10);
		
		int s11 = Integer.parseInt(s6);  // 123 이라는 숫자 . 
		System.out.println(s11); 
		
		int number = 10 ; 
		int binary = Integer.parseInt("1010", 2);
		int oct = Integer.parseInt("12", 8);
		int hex = Integer.parseInt("A", 16); 
		System.out.println("10 진수 " + number);
		System.out.println("2 진수(1010) " +binary);
		System.out.println("8 진수(12) " +oct);
		System.out.println("16 진수(A) " +hex);
		
		
		char c = 'A';
		// char c1 ='AB'; // 불가능
		String cs1 = "AB";
		String cs2 = new String("AB");
		String cs3 = "A" + "B"; 
		
		// 숫자의 문자열 변환 
		String cs4 = ""+1; 
		System.out.println( cs4 + 9 );  // 19 
		
		int n7 = 7 ;
		int n8 = 7 ;
		String n9 = "7";
		
		System.out.println( n7 + n8 );        // int +int = int
		System.out.println( n7 + n8  + n9 ); // int+int + string
		System.out.println( n9 + n7  + n8  ); // string + int +int
		
		// 출력으로 n7+n8의 결과값 : 14 
		System.out.println(" n7+n8의 결과값 "+ (n7+n8));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
