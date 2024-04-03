package j0403;

import java.util.Scanner;

public class C0403_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자 하나를 입력받아서 
		// 10보다 크면  (조건)
		// "10보다 큽니다" 를 출력해보세요 
		// 1. 변수선언
		//   1-1 필요하다면 scanner사용해 입력받기 
		
		int num ; 
		num = 100 ; // 변수에 값을 넣는다 
		System.out.println("숫자를 입력해주세요 : "); 
		num = scan.nextInt(); // n이라는 이름의 변수에는 내가 입력한 값이 들어간다. 

		System.out.println(num + "입니다."); 
		
		// 2. 출력
		if ( num > 10 ) {
			System.out.println("10보다 큽니다."); 
		}
		
		
		// 입력받은 숫자가 짝수면 짝수입니다, 홀수면 홀수입니다 를 출력해보세요 
		//( 나누기2를 한 나머지가 0이면 짝수 )
		
		
//		num : 입력받은 숫자 
		// num % 2  == 0 이 조건이 참이면, 짝수이면 
		
		if ( num % 2  == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다. ");
		}
		
		
		if ( num % 2  == 0) {
			System.out.println("짝수입니다.");
		} 
		if ( num % 2  == 1) {
			System.out.println("홀수입니다. ");
		}
		scan.nextLine(); // enter 가 들어가게됨
		// 문자를 입력받아 영문자입니다 아닙니다 출력
		System.out.println("문자를 입력해주세요 : "); 
		String str = scan.nextLine();
		// String = "ABCD" 
		// Char = 'A' 
		char ch = str.charAt(0);
		System.out.println(ch);
		
		// 소문자 혹은 대문자 일때 참 
		// 'a' <= ch && ch <='z' 
		if(('a' <= ch && ch <='z' ) || ('A' <= ch && ch <='Z' )) {
			System.out.println("영문자입니다.");
		}else {
			System.out.println("영문자가 아닙니다.");
		}
		
	}

}
