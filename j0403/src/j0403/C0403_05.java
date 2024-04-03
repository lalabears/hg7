package j0403;

public class C0403_05 {

	public static void main(String[] args) {
		
		// 비교연산자  >, <, >=, <=
		// 두개의 피연산자를 비교해서 참, 거짓을 반환 
		
		System.out.println( 10 > 9 );
		System.out.println( 10 < 9 );
		
		// 반드시 등호는 뒤에 써야합니다. 
		System.out.println( 10 >= 9 );
		System.out.println( 10 >= 11 );
		System.out.println( 10 <= 1 );

		// == 같은지, != 다른지 (느낌표는 앞에씀)
		System.out.println(10 == 90);
		System.out.println(10 != 90);
		
		
		// 'a' => 97 'A' => 65
		
		System.out.println('a' > 'A'); 
		System.out.println('a' == 'A');
		
		
		// 문자열(String)을 비교할때는 == 대신 equals()를 사용해야함 
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc"); 
		
		System.out.println( str1 == str2 );
		System.out.println( str1 == str4 );
		System.out.println( str3 == str4 );
		
		System.out.println(str1.equals(str4));
		System.out.println(str3.equals(str4));

		
		// 논리 연산자 
		// 조건식을 연결할때 사용하는 연산자 
		// || : OR   => 피연산자 둘중 하나라도 참이면 참
		// && : AND  => 피연산자 둘다 참이어야 참 
		
		int n = 9 ; 
		System.out.println( n > 10 );
		System.out.println( n < 20 );
		
		System.out.println( n > 10 && n < 20); // true && true => true
		System.out.println( n > 10 && n > 20); // true && false => false 
		
		System.out.println( n > 10 || n > 20); // true || false => true
		
		// 10 < n < 20 사용할 수 없음  =>    n > 10 && n < 20
		
		// 2의 배수 인지 (짝수인지 홀수인지 )
		System.out.println( n%2 == 0 ); // 짝수
		// 3의 배수인지 
		System.out.println( n%3 == 0 ); // 3의 배수인지 

		// 2의 배수이거나 3의 배수인지 
		System.out.println( n%2 == 0 || n%3 == 0 );
		
		// 2의 배수이거나 3의 배수인지. 그리고  6의 배수도 만족하는지 
		System.out.println( (n%2 == 0 || n%3 == 0) && n%6 == 0 );
		
		// 문자가 소문자인지 대문자인지 
		// 소문자라면 'a' <=<='z'
		// 대문자라면 'A' <=<= 'Z' 
		char ch = 'T'; 
		System.out.println('a'<= ch && ch <='z'); // 소문자인지
		System.out.println('A'<= ch && ch <='Z'); // 대문자인지
		System.out.println( ('a'<= ch && ch <='z')  || ('A'<= ch && ch <='Z') ); // 영문자인지
		
		// 논리 부정연산자 ! (not)
		boolean b = true; 
		
		System.out.println(b);
		System.out.println(!b); // ture가 아니다 
		System.out.println(!!b); // false가 아니다 
		
		
		
		
		// 조건 연산자 ?
		// 조건식 ? 식1 : 식2  
		// 참이면 식1, 거짓이면 식2 
		int x = 5, y = 13;
		
		int result = ( x > y ) ? x : y ; // 두 수 중 큰값 
		
		System.out.println(result); 
		
		// 대입 연산자 = 
		System.out.println(x=10); // 변수에 10을 넣고 그결과 10을 출력 
		
		
		
		
		
		
		
		
		
	}

}
