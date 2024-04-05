package j0405;

import java.util.Scanner;

public class C0405_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		// 해보세요 
//		// 1. 나이를 입력받아 20이상이면 성인입니다 출력
//		System.out.print("나이를 입력해주세요 : ");
//		int age = scan.nextInt();// 변수를 선언함과 동시에 입력받기 
//		// age라는 변수에 내가 입력한 값이 대입됨. 
//		// 조건문 
//		if( age >= 20 ) { // 조건문 : 20이상이면
//			System.out.println("성인입니다"); // 실행문: 출력 
//		}
//		
//		// 2. 숫자 1개를 입력받아 5와 10 사이면
//		// [5보다 크고 10보다 작은 수 입니다] 출력 
//		System.out.print("숫자를 입력해주세요 : ");
//		int n1 = scan.nextInt();
//		if ( 5< n1 && n1<10 ) {
//			System.out.println("5보다 크고 10보다 작은 수 입니다"); 
//		}
//		
//		// 3. 숫자 1개를 입력받아 0이면 0, 아니면 0이 아님 출력
//		System.out.print("숫자를 입력해주세요 : ");
//		int n2 = scan.nextInt();
//		if( n2 == 0 ) {
//			System.out.println("0");
//		}else {
//			System.out.println("0이 아님");
//		}
//				
//		// 4, 숫자 1개를 입력받아 양수면 양수, 음수면 음수 출력
//		System.out.print("숫자를 입력해주세요 : ");
//		int n3 = scan.nextInt();
//		if( n3 >= 0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}
//		
//		// 5. 숫자 1개를 입력받아 5의 배수이면 5의 배수, 
//		//    아니면 5의 배수가 아님을 출력 
//		System.out.print("숫자를 입력해주세요 : ");
//		int n4 = scan.nextInt();
//		if ( n4 % 5 == 0 ) {
//			System.out.println("5의 배수");
//		}else {
//			System.out.println("5의 배수가 아님");
//		}
		// 번외 6. 문자 1개를 입력받아 숫자면 숫자, 그외 문자 라고출력
		System.out.print("숫자를 입력해주세요 : ");
		String n5 = scan.nextLine();
		char ch = n5.charAt(0);
		// 0 -> '0' 6 ->'6' a ->'a'
		if ('0' <= ch && ch <= '9' ) {
			System.out.println("숫자");
		}else {
			System.out.println("문자");
		}
		

	}

}
