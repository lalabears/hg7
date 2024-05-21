package j0521;

import java.util.Scanner;

public class C0521_10 {

	public static void main(String[] args) {
		// 비교연산자 
		// 피연산자 사이의 상대적 크기를 판단하는 연산자. 
		// 오른쪽 피연산자와 왼쪽 피연산자를 비교해서 서로 같은지 큰지 작은지 크기비교
		/*  [ 피연산자  연산자  피연산자 ]
		 ==   왼쪽피연산자와 오른쪽피연산자가 같으면 참
		 !=   왼쪽피연산자와 오른쪽피연산자가 같지않으면 참
		 >    왼쪽피연산자가 오른쪽피연산자보다 크면 참
		 >=   왼쪽피연산자가 오른쪽피연산자보다 크거나 같으면 참
		 <    왼쪽피연산자가 오른쪽피연산자보다 작으면 참
		 <=   왼쪽피연산자가 오른쪽피연산자보다 작거나 같으면 참
		*/
		System.out.println( 5 == 2 );
		System.out.println( 5 != 2 );
		System.out.println( 5 > 2 );
		System.out.println( 5 >= 2 );
		System.out.println( 5 < 2 );
		System.out.println( 5 <= 2 );
		int a = 5, b = 2, c = 5; 
		System.out.println( a == b ) ;
		System.out.println( a != b ) ;
		System.out.println( a == c ) ;
		System.out.println( a != c ) ;
		
		System.out.println( 'a' > 'A' );  // true
		//                   97    65
		System.out.println( 'a' == 'A' ); // false
		
		char ch1 ='e', ch2 ='E'; 
		System.out.println(" == 연산의 결과 " +  (ch1==ch2) );
		System.out.println(" > 연산의 결과 " +  (ch1 > ch2) );
		
		// 문자열을 비교할때는 == 으로 비교하는 대신 equals 를 사용해야함. 
		// == 연산자는 두 문자열의 주소가 같은지를 비교함. 값을 비교하는것이 아님 
		// 문자열의 내용을 비교하기 위해서는 == 가 아니라 equals를 사용해야함. 
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println("문자열의 == 비교");
		System.out.println( s1 == s2 );  
		System.out.println( s3 == s4 );  // false
		System.out.println( s1 == s3 );  // false
		System.out.println("문자열의 equals 비교");
		System.out.println( s1.equals(s2) );  
		System.out.println( s3.equals(s4) );
		System.out.println( s1.equals(s3) );
		
		System.out.println( "안녕".equals("안녕"));  // true
		System.out.println(  s1.equals("hello")); //
		System.out.println( s3 == "hello" ); // false 
		
		
		
		// 논리 연산자 : 주어진 논리식을 판단해 참, 거짓을 결정하는 연산자 
		/*
		  &&  (and)  : 논리식이 모두 참이면 참 
		  ||  (or)   : 논리식 중 하나라도 참이면 참
		  !   (not)  : 논리식의 결과가 참이면 거짓, 거짓이면 참 
		
		*/		
		System.out.println( ( 5 > 2 )  &&  ( 5 == 2 ) );
		//                     true    &&     false   =>   false
		System.out.println( ( 5 > 2 )  ||  ( 5 == 2 ) );
		//                     true    ||     false   =>    true
		System.out.println( !(5 > 2) );   // !true   =>  false
		System.out.println( !(5==2) );  //   !false  =>  ture 
		
		int n1 = 3, n2 = 3 , n3 = 3; 
		System.out.println( (n1 == ++n2) && (n3 == 3) );
		//                      false     &&    true       > false 
		n2 = 3; 
		System.out.println( (n1 == n2++) && (n3 == 3) );
		//                비교 후 증가 true   &&   true        > true 
		
		// 	10 < k < 20  
	    int k = 15; 
	    // System.out.println( 10 < k < 20 );
		System.out.println(  (10 < k) && ( k < 20 )  );
		
		// 2의 배수이거나 3의 배수인. 
		System.out.println( (k%2 == 0) || (k%3==0) );
		//                    2의 배수         3의 배수 
		//                          
		
		// nextLine으로 한글자를 입력을 받아 그 값이 숫자이면 
		// true가 출력이되게 해보세요 (&& 연산자나 || 연산자를 사용하면 할 수 있다)
		// 
		// 1. 변수선언. 입력받기 
		Scanner scan = new Scanner (System.in); 
		System.out.println("한글자 숫자를입력해주세요 : "); // "7"
		String str = scan.nextLine();
		char strnum = str.charAt(0); // '7'
		// 2. 출력   '0' <  strnum  < '9' 면 숫자 
		System.out.println("숫자 인가요 ? : " + ( ('0' <=  strnum ) && (strnum <='9') ) );
		
		// 1. 위의 str을 사용해서 
		// 소문자면 true를 반환하게 해보세요 
		// char 'a' 'z'
	    System.out.println("영문소문자 인가요 ? : " + ( ('a' <= strnum) && (strnum <='z')  ) );
		
		// 2. 영문자(영어대문자+소문자) 면 true를 반환하게 해보세요
	    // 영소문자 이거나 영대문자 
	    //         || (or) 
	    boolean bol =   (('a' <= strnum) && (strnum <= 'z')) || (('A' <= strnum) && (strnum <= 'Z')); 
		System.out.println("영문자 인가요 ? : " + bol );
		
		// 논리 부정 연산자 ! (not) 
		
		boolean power = true ; 
		
		System.out.println(power);  // true
		System.out.println(!power); // !true => false 
		System.out.println(!!power); // !!true => !false => true 
		
		

	}

}
