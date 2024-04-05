package j0405;

import java.util.Scanner;

public class C0405_01 {

	public static void main(String[] args) {
		// 복습
		
		// 변수의 종류 : boolean, char, byte, short, int, long, float, double 
		
		// 문자열 String 
		
		boolean b = true; 
		//변수타입  변수명 = 값; 
		char ch ;
		ch = 'P'; 
		
		int number = 1000; 
		float number2 = 10.23f;
		
		// 입력을 받아서 변수 값 초기화 scanner + ctrl + spacebar => import 
		Scanner scan = new Scanner(System.in);
		// 정수입력받기 : scan.nextInt()함수를 사용
		int n = 20; 
		System.out.println(n);
		System.out.println("나이를 입력하세요 : ");
		n = scan.nextInt();
		System.out.println(n);
		
		scan.nextLine(); // nextInt()를 하고 enter키를 눌러서 입력을 하기때문에 
		// enter scan.nextLine()에 들어감.
		
		// 문자 입력받기  : scan.nextLine();
		String name = "홍길동";
		System.out.println("이름을 입력하세요 : ");
		name = scan.nextLine(); // name이라는 변수에 입력한 값이 들어간다. 
		System.out.println(name);

		
		// 출력 : print, println, printf
		// 출력: 이름은 홍길동이고 나이는 20살입니다. 
		System.out.println("이름은 "+name+"이고 나이는 "+n+"살입니다.");
		System.out.printf("이름은 %s이고 나이는 %d살입니다.", name, n);
		System.out.println(); 
		
		// 연산자 
		// 우선 순위 : 산술 > 비교 > 논리 > 대입
		// 산술 : + - * / % 
		// 비교 : >, >= , < , <=, ==, != 
		// 논리 : ||, && , !
		//  || (or) : 둘중 하나라도 참이면 참, 
		//  && (and): 둘다 참이어야 참 
		//  !  : not 
		// 대입 : = 
		
		int a = 5 ; 
		System.out.println(a*2);
		System.out.println(a>10);
		System.out.println(a!=10);
		
		System.out.println(4 <= a && a >=20); // true && false -> false
		System.out.println(4 <= a || a >=20); // true || false -> true
		
		System.out.println( a = 100 ); // 대입연산자 
		System.out.println(4 <= a && a >=20);
		
		// 조건문 
		/*
		if(조건문) {
			실행문1
		}else {
			실행문2
		}
		*/
		// 만약에 조건문이 참이면 실행문1 실행, 거짓이면 실행문2 실행 
		
		if (a == 10) {
			System.out.println("10입니다");
		}
		
		if (a == 10) {
			System.out.println("10입니다");
		}else {
			System.out.println("10이 아닙니다");
		}
		
		
		// charAt()
		
//		System.out.println("문자를 입력해주세요 ");
//		
//		String str = scan.nextLine();
//		char ch = ' ';
		
		String str1 = "abc";
		//             012
		char ch1 ;
		// ch1 변수에 a를 넣고싶다 
		ch1	 = str1.charAt(0);
		System.out.println(ch1);
		
		// 한글자만 사용하고 싶다. 첫자, 혹은 주민등록번호를 입력받아서
		
		

	}

}
