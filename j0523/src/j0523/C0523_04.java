package j0523;

import java.util.Scanner;

public class C0523_04 {

	public static void main(String[] args) {
		//Switch 문
		/*
		   switch(조건식) {
		   case 값1:
		        조건식의 결과가 값1과 같을때 수행되는 코드들 
		   case 값2:
		        조건식의 결과가 값2와 같을때 수행되는 코드들
		   default:
		        조건식과 일치하는 케이스문이 없을때 수행되는 코드들
		   }
		   조건식의 결과와 case의 값이 일치하면 케이스문으로 이동해 코드수행
		   break;를넣어주어야 case 문이 종료되고 switch문을 빠져나옴 
		   조건식의 결과는 정수 또는 문자열이어야함. 
		   case문의 값은 정수, 상수, 문자열만 가능하고 중복은 안됨 (변수안됨)*/
		int a = 3, b = 2; 	
		final int one = 1; 
		switch ( a ) {
		case one:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		default: // 생략이 가능함 (if문에서 else에 해당)
			System.out.println(5);
		}
		
		// 100, 90, 80, 70 점은 pass 출력 그이하점수는 fail 을 출력 
		int score = 80; 
		switch(score) {
		case 100: case 90: case 80:	case 70:
			System.out.println("pass");
			break;
		default:
			System.out.println("fail");
		}
		// 만약에 s가 a면 a, b면 b, c면 c , 그외는 other라고 출력하는 if문
		String s = "a"; 
		System.out.println("for 사용");
		if( s.equals("a")) System.out.println("a");
		else if (s.equals("b")) System.out.println("b");
		else if (s.equals("c"))	System.out.println("c");
		else System.out.println("other");
		// switch문으로 바꿔쓸 수 있다 . 
		System.out.println("switch 사용");
		switch (s) {
		case "a":
			System.out.println("a");
			break; 
		case "b":
			System.out.println("b");
			break;
		case "c":
			System.out.println("c");
			break;
		default:
			System.out.println("other");
		}
		
		int n = 2;
		if ( n == 1 || n ==3 || n == 5) {
			System.out.println("홀수");
		} else if ( n == 2 || n == 4 || n == 6) {
			System.out.println("짝수");
		} else if (n==0) {
			System.out.println("0");
		} else {
			System.out.println("6보다 큰수입니다.");
		}
		// switch 문으로 바꿔보세요 
		switch ( n ) {
		case 1: 
		case 3: 
		case 5:
			System.out.println("홀수");
			break;
		case 2: case 4: case 6:
			System.out.println("짝수");
			break;
		case 0:
			System.out.println("0");
			break;
		default:
			System.out.println("6보다 큰수입니다.");	
		}
		Scanner scan = new Scanner(System.in);
		// m,M 입력받으면 남자 f,F입력받으면 여자 그외는 잘못입력하셨습니다 
		// switch문으로 만들어보세요 
		System.out.println("성별을 입력하세요 ");
		String gender= scan.next();
		switch(gender) {
		case "m": case "M": case "남": case "male": case "남자":
			System.out.println("남성"); 
			break;
		case "f": case "F": case "여": case "female": case "여자":
			System.out.println("여성");
			break; 
		default:
			System.out.println("잘못입력하셨습니다. ");
		}
		
		
		// 월을 입력받아서 해당월의 계절을 출력해보세요 
		// 3,4,5 봄 6,7,8 여름 9,10,11 가을 12,1,2 겨울
		System.out.println("월을 입력해주세요");
		int month = scan.nextInt();
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
		}

	}

}
