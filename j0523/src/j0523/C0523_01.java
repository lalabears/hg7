package j0523;

import java.util.Scanner;

public class C0523_01 {

	public static void main(String[] args) {
		/* 조건문 (if)
			
			if (조건식1) {
				조건식1 결과가 참일때 수행되는 코드들
			} else if (조건식2) {
				조건식2 결과가 참일때 수행되는 코드들
			} else if (조건식3) {  // 여러개의 else if 를 사용할 수 있다
				조건식3 결과가 참일때 수행되는 코드들
			} else {
				어느조건식도 만족하지 않을때 수행되는 코드들
			}
		
			else if, else 문은 필요없으면 생략이 가능하다. 
		*/
		int n = 10;
		if( n == 0) {  // 이 조건식이 참이 아니기때문에 실행X
			System.out.println("0 입니다.");	
		}
		if( n != 0) { // 조건식이 참이기때문에 실행 O
			System.out.println("0이 아닙니다."); 
		}
		
		if ( n == 0 ) {
			System.out.println("0 입니다.");	
		} else {
			System.out.println("0이 아닙니다."); 
		}
		
		// else if 문 까지 사용해서 0, 음수, 양수 
		if (n > 0 ) {
			System.out.println("양수입니다");
		} else if( n < 0) {
			System.out.println("음수입니다.");
		} else if( n == 0 ) {
			System.out.println("0 입니다.");
		}
		
		// 중첩 if 문을 사용해서 표현 
		if ( n == 0 ) {
			System.out.println("0 입니다.");	
		} else {
			if ( n > 0 ) {
				System.out.println("양수입니다");
			}else {
				System.out.println("음수입니다");
			}
		}
		
		
		char ch = 'B'; 
		
		if( ch == 'A') System.out.println("A입니다");
		
		if ( ch >= 'A' && ch <= 'H' ) {
			System.out.println("문자가 A와 H 사이에 있습니다.");
		}
		
		int temp = 35; // 온도를 나타내는변수 temp 
		// 만약에 기온이 10도 이하이면 춥습니다. 20도 이하이면 쌀쌀합니다
		// 30도 이하이면 날씨가 좋습니다. 그 이상이면 날씨가 덥습니다 라고 출력해보세요 
		if (temp <= 10 ) {
			System.out.println("춥습니다");
		} else if (temp <= 20) {
			System.out.println("쌀쌀합니다");
		} else if (temp <= 30) {
			System.out.println("날씨가 좋습니다");
		} else {
			System.out.println("날씨가 덥습니다 ");
		}
		int num = 17; 
		// 만약 숫자가 5보다 크면 5보다큽니다. 숫자가 10보다 크면 10보다 큽니다 라고 출력해보세요 
		if (num > 5 ) {
			System.out.println("5보다 큽니다");
		} else if(num > 10) {
			// num > 5의 조건식 범위안에 num>10의  조건식이 포함되므로
			// num >10 조건식이 실행이 될 수 없다. 
			System.out.println("10보다 큽니다");
		}
		// else - if문을 사용할때는 조건식의 범위가 좁은 조건식부터 판별해야함
		if(num >10) {
			System.out.println("10보다 큽니다");
		} else if( num > 5 ) {
			System.out.println("5보다 큽니다");
		}
		// 숫자를 입력받아서 그 숫자가 짝수인지 홀수인지 0인지를 판별해보세요 
		Scanner scan = new Scanner(System.in); 
		System.out.println("숫자를 입력해주세요 : ");
		int number = scan.nextInt();
		
		// if 문은 위에서 부터 차례로 조건을 검사함
		// number%2 == 0 >짝수  , 1 > 홀수 0%2==0  
		if ( number == 0 ) {
			System.out.println("0 입니다");
		} else if ( number % 2 == 1 ) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		// 0을 판별하는것이 짝수판별 위에만 있어도 상관없다 . 
		if ( number % 2 == 1 ) {
			 System.out.println("홀수");
		} else if ( number == 0 ) {
		     System.out.println("0 입니다");
		} else {
				System.out.println("짝수");
		}
		

	}

}
